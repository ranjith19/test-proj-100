package com.setu.serializer.SetuSerializer;

public class Fee {
    String description;
    Discount discount;
    String displayName;
    SubAggregate feeAggregates;
    int quantity;
    Tax tax;
    Amount unitCost;

    public Fee(String displayName, SubAggregate feeAggregates) {
        this.displayName = displayName;
        this.feeAggregates = feeAggregates;
    }

    public Fee(String displayName, Amount amount) {
        this.displayName = displayName;
        this.feeAggregates = new SubAggregate(amount);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public SubAggregate getFeeAggregates() {
        return feeAggregates;
    }

    public void setFeeAggregates(SubAggregate feeAggregates) {
        this.feeAggregates = feeAggregates;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public Amount getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(Amount unitCost) {
        this.unitCost = unitCost;
    }
}
