package com.setu.serializer.SetuSerializer;

public class BillAggregates {
    AmountWithName subTotal;
    AmountWithName total;

    public BillAggregates(AmountWithName subTotal, AmountWithName total) {
        this.subTotal = subTotal;
        this.total = total;
    }

    public BillAggregates(AmountWithName total) {
        this.total = total;
    }

    public AmountWithName getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(AmountWithName subTotal) {
        this.subTotal = subTotal;
    }

    public AmountWithName getTotal() {
        return total;
    }

    public void setTotal(AmountWithName total) {
        this.total = total;
    }

}
