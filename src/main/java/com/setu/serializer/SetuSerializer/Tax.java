package com.setu.serializer.SetuSerializer;

public class Tax {
    TaxComponent[] components;
    Amount amount;
    Computation computation;
    String displayName;
    String type;

    public Tax(Amount amount, String displayName) {
        this.amount = amount;
        this.displayName = displayName;
    }

    public TaxComponent[] getComponents() {
        return components;
    }

    public void setComponents(TaxComponent[] components) {
        this.components = components;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public Computation getComputation() {
        return computation;
    }

    public void setComputation(Computation computation) {
        this.computation = computation;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
