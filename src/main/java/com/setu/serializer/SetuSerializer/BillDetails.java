package com.setu.serializer.SetuSerializer;

public class BillDetails {
    BillFetchStatus billFetchStatus;
    SetuBill[] bills;

    public BillDetails(BillFetchStatus billFetchStatus, SetuBill[] bills) {
        this.billFetchStatus = billFetchStatus;
        this.bills = bills;
    }

    public BillFetchStatus getBillFetchStatus() {
        return billFetchStatus;
    }

    public void setBillFetchStatus(BillFetchStatus billFetchStatus) {
        this.billFetchStatus = billFetchStatus;
    }

    public SetuBill[] getBills() {
        return bills;
    }

    public void setBills(SetuBill[] bills) {
        this.bills = bills;
    }
}
