package com.setu.serializer.SetuSerializer;

public class BillAggregates {
    AmountWithName subTotal;
    AmountWithName total;
    Tax tax;
    Discount discount;
    ItemQuantity itemQuantity;
    Fee[] fees;

    public BillAggregates(AmountWithName total) {
        this.total = total;
    }

    public BillAggregates(AmountWithName subTotal, AmountWithName total) {
        this.subTotal = subTotal;
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

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public ItemQuantity getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(ItemQuantity itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public Fee[] getFees() {
        return fees;
    }

    public void setFees(Fee[] fees) {
        this.fees = fees;
    }
}
