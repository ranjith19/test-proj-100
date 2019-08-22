package com.setu.serializer.SetuSerializer;

public class Amount {
    int value;
    String currency;

    public Amount(int value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public Amount(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
