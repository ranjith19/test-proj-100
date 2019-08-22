package com.setu.serializer.SetuSerializer;

public class FetchBillsDataObject {
    Customer customer;
    BillDetails billDetails;

    public FetchBillsDataObject(Customer customer, BillDetails billDetails) {
        this.customer = customer;
        this.billDetails = billDetails;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BillDetails getBillDetails() {
        return billDetails;
    }

    public void setBillDetails(BillDetails billDetails) {
        this.billDetails = billDetails;
    }
}
