package com.setu.serializer.SetuSerializer;

public class TaxComponent {
    Computation computation;
    String code;
    Amount amount;
    String displayName;

    public TaxComponent(Amount amount, String displayName) {
        this.amount = amount;
        this.displayName = displayName;
    }

    public Computation getComputation() {
        return computation;
    }

    public void setComputation(Computation computation) {
        this.computation = computation;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
