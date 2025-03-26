package com.neoteric.typesOfAccounts;

public class SavingsAccount extends Account{
    public String aadhaarNum;
    public String panNum;

    public String getAadhaarNum() {
        return aadhaarNum;
    }

    public void setAadhaarNum(String aadhaarNum) {
        this.aadhaarNum = aadhaarNum;
    }

    public String getPanNum() {
        return panNum;
    }

    public void setPanNum(String panNum) {
        this.panNum = panNum;
    }

    public SavingsAccount(String accNum, Customer customer, String aadhaarNum, String panNum) {
        super(accNum, customer);
        this.aadhaarNum = aadhaarNum;
        this.panNum = panNum;
    }
//    public Account savingsAcc;
}
