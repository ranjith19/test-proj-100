package com.setu.serializer.SetuSerializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FetchCustomerBillsResponse {
    FetchBillsDataObject data;
    int status = 200;
    boolean success = true;


    public FetchCustomerBillsResponse(FetchBillsDataObject data) {
        this.data = data;
    }

    public FetchCustomerBillsResponse(int amount, String billID, String customerName, String customerAccountID){
        AmountWithName total = new AmountWithName(new Amount(amount), "Total outstanding");
        ZoneId zoneId = ZoneId.of( "UTC" );
        ZonedDateTime genDate = LocalDateTime.now().atZone(zoneId);
        BillAggregates billAggregates = new BillAggregates(total);
        CustomerAccount customerAccount = new CustomerAccount(customerAccountID);
        SetuBill bill = new SetuBill(billAggregates, BillExactness.EXACT, genDate, billID, customerAccount,
                Recurrence.ONE_TIME);
        SetuBill[] bills = new SetuBill[1];
        bills[0] = bill;
        BillDetails billDetails = new BillDetails(BillFetchStatus.AVAILABLE, bills);
        Customer customer = new Customer(customerName);
        this.data = new FetchBillsDataObject(customer, billDetails);
    }

    public FetchBillsDataObject getData() {
        return data;
    }

    public void setData(FetchBillsDataObject data) {
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }


    public String convertToJson() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        try{
            return  mapper.writeValueAsString(this);
        }
        catch (JsonProcessingException ex){
            return "{}";
        }
    }
}
