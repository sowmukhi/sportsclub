package com.neoteric.openBankAccount;

public class Account {
    private String accNum;
    private Customer customer;
    private Address bankAddress;
    private double balance;
    private static final double MINIMUM_BALANCE = 5000.0;

    public double getBalance() {
        return balance;
    }

    public String getAccNum() {
        return accNum;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Address getBankAddress() {
        return bankAddress;
    }


    public Account(String accNum, Customer customer, Address bankAddress) {
        this.accNum = accNum;
        this.customer = customer;
        this.bankAddress = bankAddress;
        this.balance=MINIMUM_BALANCE;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= MINIMUM_BALANCE) {
            balance -= amount;
            return true;
        }
        return false;      // Withdrawal denied due to insufficient funds
    }
}