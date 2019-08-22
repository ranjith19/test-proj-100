package com.setu.serializer.SetuSerializer;

public class SubAggregate {
    Amount discount;
    Amount subTotal;
    Amount tax;
    Amount total;

    public SubAggregate(Amount total) {
        this.total = total;
    }

    public Amount getDiscount() {
        return discount;
    }

    public void setDiscount(Amount discount) {
        this.discount = discount;
    }

    public Amount getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Amount subTotal) {
        this.subTotal = subTotal;
    }

    public Amount getTax() {
        return tax;
    }

    public void setTax(Amount tax) {
        this.tax = tax;
    }

    public Amount getTotal() {
        return total;
    }

    public void setTotal(Amount total) {
        this.total = total;
    }
}

