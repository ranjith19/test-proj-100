package com.setu.serializer.SetuSerializer;

public class BillDetails {
    BillFetchStatus billFetchStatus;
    Bill[] bills;

    public BillDetails(BillFetchStatus billFetchStatus, Bill[] bills) {
        this.billFetchStatus = billFetchStatus;
        this.bills = bills;
    }

    public BillFetchStatus getBillFetchStatus() {
        return billFetchStatus;
    }

    public void setBillFetchStatus(BillFetchStatus billFetchStatus) {
        this.billFetchStatus = billFetchStatus;
    }

    public Bill[] getBills() {
        return bills;
    }

    public void setBills(Bill[] bills) {
        this.bills = bills;
    }
}
