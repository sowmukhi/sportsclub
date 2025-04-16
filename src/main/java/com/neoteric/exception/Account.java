package com.neoteric.exception;

public class Account {
    private String accNo;
    private double balance;
    private CardDetails cardDetails;

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public CardDetails getCardDetails() {
        return cardDetails;
    }

    public void setCardDetails(CardDetails cardDetails) {
        this.cardDetails = cardDetails;
    }

    public String getAccNo() {
        return accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}