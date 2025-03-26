package com.neoteric.typesOfAccounts;

public class FDAccount extends Account{
    public String duration;
//    public Account fdAcc;

    public FDAccount(String accNum, Customer customer, String duration) {
        super(accNum, customer);
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
