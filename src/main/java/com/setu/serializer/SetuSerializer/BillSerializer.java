package com.setu.serializer.SetuSerializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class BillSerializer {


    public static void main(String[] a) throws JsonProcessingException {

        AmountWithName total = new AmountWithName(new Amount(2000), "total");
        AmountWithName subtotal = new AmountWithName(new Amount(1000), "sub total");
        ZoneId zoneId = ZoneId.of( "UTC" );
        ZonedDateTime genDate = LocalDateTime.of(2019, 9, 10, 13, 12, 0).atZone(zoneId);
        ZonedDateTime dueDate = LocalDateTime.of(2019, 10, 10, 0, 0, 0).atZone(zoneId);
        BillAggregates billAggregates = new BillAggregates(total, subtotal);
        CustomerAccount customerAccount = new CustomerAccount("10000");

        String billId = "bill10122";

        Bill bill = new Bill(billAggregates, BillExactness.EXACT_UP, genDate, billId, customerAccount,
                Recurrence.MONTHLY);
        bill.setBillDueDate(dueDate);

        Bill[] bills = new Bill[1];
        bills[0] = bill;

        BillDetails billDetails = new BillDetails(BillFetchStatus.AVAILABLE, bills);
        Customer customer = new Customer("Ramesh");

        FetchBillsDataObject fbData = new FetchBillsDataObject(customer, billDetails);
        FetchCustomerBillsResponse fcbResponse = new FetchCustomerBillsResponse(fbData);
        String jsonStr = fcbResponse.printJson();
        System.out.println("#########");
        System.out.println(jsonStr);
        System.out.println("#########");

    }
}
