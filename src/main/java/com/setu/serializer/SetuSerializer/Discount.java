package com.setu.serializer.SetuSerializer;

public class Discount {
    Amount amount;
    String code;
    Computation computation;
    String reason;

    public Discount(Amount amount, String code, Computation computation, String reason) {
        this.amount = amount;
        this.code = code;
        this.computation = computation;
        this.reason = reason;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Computation getComputation() {
        return computation;
    }

    public void setComputation(Computation computation) {
        this.computation = computation;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
