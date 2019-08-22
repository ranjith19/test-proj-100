package com.setu.serializer.SetuSerializer;

public class ItemQuantity {
    int quantity;
    String displayName;

    public ItemQuantity(int quantity, String displayName) {
        this.quantity = quantity;
        this.displayName = displayName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
