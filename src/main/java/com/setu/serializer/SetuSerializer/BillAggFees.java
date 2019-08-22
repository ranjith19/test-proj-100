package com.setu.serializer.SetuSerializer;

public class BillAggFees {
    Fee[] billFees;
    Fee setuFees;

    public BillAggFees(Fee[] billFees, Fee setuFees) {
        this.billFees = billFees;
        this.setuFees = setuFees;
    }

    public BillAggFees(Fee[] billFees) {
        this.billFees = billFees;
    }

    public Fee[] getBillFees() {
        return billFees;
    }

    public void setBillFees(Fee[] billFees) {
        this.billFees = billFees;
    }

    public Fee getSetuFees() {
        return setuFees;
    }

    public void setSetuFees(Fee setuFees) {
        this.setuFees = setuFees;
    }
}
