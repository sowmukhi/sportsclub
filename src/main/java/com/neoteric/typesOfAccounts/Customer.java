package com.neoteric.typesOfAccounts;

public class Customer {
    public String customerName;
    public String mobileNum;

    public Customer(String customerName, String mobileNum) {
        this.customerName = customerName;
        this.mobileNum = mobileNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }
}
