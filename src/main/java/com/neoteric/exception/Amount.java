package com.neoteric.exception;

public class Amount {
    private double amount;
    private double balance;

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public Amount(double amount, double balance) {
        this.amount = amount;
        this.balance = balance;
    }
}
