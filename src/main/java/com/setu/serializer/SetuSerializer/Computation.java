package com.setu.serializer.SetuSerializer;

public class Computation {
    CurrencyCode currencyCode;
    String code;
    ComputationMethod computationMethod;
    int value;

    public Computation() {
    }

    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ComputationMethod getComputationMethod() {
        return computationMethod;
    }

    public void setComputationMethod(ComputationMethod computationMethod) {
        this.computationMethod = computationMethod;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
