package com.setu.serializer.SetuSerializer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class SetuBill {
    BillAggregates billAggregates;
    BillExactness billExactness;
    ZonedDateTime billGeneratedOn;
    ZonedDateTime billDueDate;
    String billerBillID;
    CustomerAccount customerAccount;
    Recurrence recurrence;
    Item[] items;

    public SetuBill(BillAggregates billAggregates, BillExactness billExactness, ZonedDateTime billGeneratedOn,
                    String billerBillID, CustomerAccount customerAccount, Recurrence recurrence) {
        this.billAggregates = billAggregates;
        this.billExactness = billExactness;
        this.billGeneratedOn = billGeneratedOn;
        this.billerBillID = billerBillID;
        this.customerAccount = customerAccount;
        this.recurrence = recurrence;
    }

    public SetuBill(int amount, String billID, String customerAccountID) {
        AmountWithName total = new AmountWithName(new Amount(amount), "Total outstanding");
        ZoneId zoneId = ZoneId.of( "UTC" );
        ZonedDateTime genDate = LocalDateTime.now().atZone(zoneId);
        BillAggregates billAggregates = new BillAggregates(total);
        CustomerAccount customerAccount = new CustomerAccount(customerAccountID);
        this.billAggregates = billAggregates;
        this.billExactness = BillExactness.EXACT;
        this.billGeneratedOn = genDate;
        this.billerBillID = billID;
        this.customerAccount = customerAccount;
        this.recurrence = Recurrence.ONE_TIME;
    }

    public ZonedDateTime getBillDueDate() {
        return billDueDate;
    }

    public void setBillDueDate(ZonedDateTime billDueDate) {
        this.billDueDate = billDueDate;
    }


    public ZonedDateTime getBillGeneratedOn() {
        return billGeneratedOn;
    }

    public void setBillGeneratedOn(ZonedDateTime billGeneratedOn) {
        this.billGeneratedOn = billGeneratedOn;
    }

    public String getBillerBillID() {
        return billerBillID;
    }

    public void setBillerBillID(String billerBillID) {
        this.billerBillID = billerBillID;
    }

    public CustomerAccount getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(CustomerAccount customerAccount) {
        this.customerAccount = customerAccount;
    }

    public Recurrence getRecurrence() {
        return recurrence;
    }

    public void setRecurrence(Recurrence recurrence) {
        this.recurrence = recurrence;
    }

    public BillAggregates getBillAggregates() {
        return billAggregates;
    }

    public void setBillAggregates(BillAggregates billAggregates) {
        this.billAggregates = billAggregates;
    }

    public BillExactness getBillExactness() {
        return billExactness;
    }

    public void setBillExactness(BillExactness billExactness) {
        this.billExactness = billExactness;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
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
