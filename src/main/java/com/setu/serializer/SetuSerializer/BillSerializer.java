package com.setu.serializer.SetuSerializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class BillSerializer {
    public static void main(String[] a)  {

        AmountWithName total = new AmountWithName(new Amount(2000), "total");
        AmountWithName subtotal = new AmountWithName(new Amount(1000), "sub total");
        BillAggregates billAggregates = new BillAggregates(total, subtotal);

        Bill bharatBill = new Bill(billAggregates, BillExactness.EXACT_UP);
        bharatBill.setRecurrence(Recurrence.MONTHLY);
        bharatBill.setCustomerAccount(new CustomerAccount("ranjith"));

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        try {

            String jsonStr = mapper.writeValueAsString(bharatBill);

            // Displaying JSON String
            System.out.println("#########");
            System.out.println(jsonStr);
            System.out.println("#########");
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


    }
}
