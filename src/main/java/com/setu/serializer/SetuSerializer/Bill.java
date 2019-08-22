package com.setu.serializer.SetuSerializer;

import java.time.LocalDateTime;

enum BillExactness {
    EXACT, EXACT_UP, EXACT_DOWN, ANY
}

enum Recurrence {
    ONE_TIME, DAILY, WEEKLY, FORTNIGHTLY, MONTHLY, QUATERLY, HALF_YEARLY, YEARLY, AS_PRESENTED
}

public class Bill {
    BillAggregates billAggregates;
    BillExactness billExactness;
    LocalDateTime billGeneratedOn;
    String billerBillID;
    CustomerAccount customerAccount;
    Recurrence recurrence;

    public LocalDateTime getBillGeneratedOn() {
        return billGeneratedOn;
    }

    public void setBillGeneratedOn(LocalDateTime billGeneratedOn) {
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

    public Bill(BillAggregates billAggregates, BillExactness billExactness) {
        this.billAggregates = billAggregates;
        this.billExactness = billExactness;
    }

    public Bill() {
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

}
