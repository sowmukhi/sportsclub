package com.neoteric.openBankAccount;

public class Customer {
    private String cusName;
    private String mobileNum;
    private String aadhaar;
    private String pan;
    private Address cusAddress;

    public String getCusName() {
        return cusName;
    }

    public Customer(String cusName, String mobileNum, String aadhaar, String pan) {
        this.cusName = cusName;
        this.mobileNum = mobileNum;
        this.aadhaar = aadhaar;
        this.pan = pan;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public String getAadhaar() {
        return aadhaar;
    }

    public String getPan() {
        return pan;
    }

    public Address getCusAddress() {
        return cusAddress;
    }

    public Customer(String cusName, String mobileNum, String aadhaar, String pan, Address cusAddress) {
        this.cusName = cusName;
        this.mobileNum = mobileNum;
        this.aadhaar = aadhaar;
        this.pan = pan;
        this.cusAddress = cusAddress;
    }
}
