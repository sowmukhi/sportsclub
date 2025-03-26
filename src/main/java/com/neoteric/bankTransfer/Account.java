package com.neoteric.bankTransfer;

public class Account {
    private String accNum;
    private double balance;
    private String holderName;

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public Account(String accNum, double balance, String holderName) {
        this.accNum = accNum;
        this.balance = balance;
        this.holderName = holderName;
    }
    public Account(){

    }
}
