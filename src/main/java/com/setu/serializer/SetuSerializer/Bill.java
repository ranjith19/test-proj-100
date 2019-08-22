package com.setu.serializer.SetuSerializer;
import java.time.ZonedDateTime;


public class Bill {
    BillAggregates billAggregates;
    BillExactness billExactness;
    ZonedDateTime billGeneratedOn;
    ZonedDateTime billDueDate;
    String billerBillID;
    CustomerAccount customerAccount;
    Recurrence recurrence;
    Item[] items;

    public Bill(BillAggregates billAggregates, BillExactness billExactness, ZonedDateTime billGeneratedOn,
                String billerBillID, CustomerAccount customerAccount, Recurrence recurrence) {
        this.billAggregates = billAggregates;
        this.billExactness = billExactness;
        this.billGeneratedOn = billGeneratedOn;
        this.billerBillID = billerBillID;
        this.customerAccount = customerAccount;
        this.recurrence = recurrence;
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
}
