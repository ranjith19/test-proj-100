package com.setu.serializer.SetuSerializer;

public class AmountWithName {
    Amount amount;
    String displayName;

    public AmountWithName(Amount amount, String displayName) {
        this.amount = amount;
        this.displayName = displayName;
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
