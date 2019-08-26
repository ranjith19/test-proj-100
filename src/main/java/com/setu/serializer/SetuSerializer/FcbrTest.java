package com.setu.serializer.SetuSerializer;

import com.fasterxml.jackson.core.JsonProcessingException;

public class FcbrTest {
    public static void main(String[] a) throws JsonProcessingException {
        FetchCustomerBillsResponse fcbResponse2 = new FetchCustomerBillsResponse(10000, "19990", "Ranjith BR", "10000");
        System.out.println("#########");
        System.out.println(fcbResponse2.convertToJson());
        System.out.println("#########");
        SetuBill bill = new SetuBill(10000, "19990",  "10000");
        System.out.println("#########");
        System.out.println(bill.convertToJson());
        System.out.println("#########");
    }
}
