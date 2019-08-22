package com.setu.serializer.SetuSerializer;

public class Item {
    String code;
    String description;
    Discount discount;
    String displayName;
    Fee[] fees;
    SubAggregate[] itemAggregates;
    MeasurementUnit measurementUnit;
    int quantity;
    Tax tax;
    Amount unitPrice;

    public Item(String displayName, SubAggregate[] itemAggregates) {
        this.displayName = displayName;
        this.itemAggregates = itemAggregates;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public Fee[] getFees() {
        return fees;
    }

    public void setFees(Fee[] fees) {
        this.fees = fees;
    }

    public SubAggregate[] getItemAggregates() {
        return itemAggregates;
    }

    public void setItemAggregates(SubAggregate[] itemAggregates) {
        this.itemAggregates = itemAggregates;
    }

    public MeasurementUnit getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(MeasurementUnit measurementUnit) {
        this.measurementUnit = measurementUnit;
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

    public Amount getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Amount unitPrice) {
        this.unitPrice = unitPrice;
    }
}


