package com.neoteric.typesOfAccounts;

public class PPFAccount extends Account{
    public int lockPeriod=15;
//    public Account ppfAcc;

    public PPFAccount(String accNum, Customer customer, int lockPeriod) {
        super(accNum, customer);
        this.lockPeriod = lockPeriod;
    }

    public int getLockPeriod() {
        return lockPeriod;
    }

    public void setLockPeriod(int lockPeriod) {
        this.lockPeriod = lockPeriod;
    }
}
