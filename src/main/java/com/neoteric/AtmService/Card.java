package com.neoteric.AtmService;

public class Card {
    String name;
    String number;
    String fromDate;
    String toDate;
//    Pin pin; // Added PIN field for authentication
    double balance; // Added balance field

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getFromDate() {
        return fromDate;
    }

    public String getToDate() {
        return toDate;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
