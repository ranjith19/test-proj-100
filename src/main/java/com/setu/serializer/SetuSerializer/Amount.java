package com.setu.serializer.SetuSerializer;

public class Amount {
    int value;
    CurrencyCode currencyCode;

    public Amount(int value, CurrencyCode currencyCode) {
        this.value = value;
        this.currencyCode = currencyCode;
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

    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
    }
}
