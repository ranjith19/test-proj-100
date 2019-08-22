package com.setu.serializer.SetuSerializer;

import com.fasterxml.jackson.core.JsonProcessingException;

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
        String jsonStr = fcbResponse.convertToJson();
        System.out.println("#########");
        System.out.println(jsonStr);
        System.out.println("#########");

        Item item1 =  new Item("EMI for June", new Amount(99));
        Item item2 = new Item("EMI for July", new Amount(100));

        Fee fee1 = new Fee("Convenience Fee", new Amount(12));
        Fee fee2 = new Fee("Late Fee", new Amount(200));

        Item[] items = new Item[2];
        items[0] = item1;
        items[1] = item2;

        Fee[] billFees = new Fee[1];
        billFees[0] = fee2;

        Fee[] itemFees = new Fee[1];
        itemFees[0] = fee1;

        item1.setFees(itemFees);
        billAggregates.setBillFees(billFees);
        bill.setItems(items);
        jsonStr = fcbResponse.convertToJson();
        System.out.println("#########");
        System.out.println(jsonStr);
        System.out.println("#########");

    }
}
