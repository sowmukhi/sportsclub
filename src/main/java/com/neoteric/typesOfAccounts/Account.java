package com.neoteric.typesOfAccounts;

import java.util.List;

public class Account {
    protected String accNum;
    protected String accType;
    protected double balance;
    protected List<Nominee> nomineeList;
    protected Customer customer;

    public Account(String accNum, Customer customer) {
        this.accNum = accNum;
        this.customer = customer;
    }

    public Account(Customer customer) {
        this.customer = customer;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Nominee> getNomineeList() {
        return nomineeList;
    }

    public void setNomineeList(List<Nominee> nomineeList) {
        this.nomineeList = nomineeList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
