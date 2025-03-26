package com.neoteric.openBankAccount;

public class Address {
    public String city;
    public String state;
    public String pinCode;
    private String street;

    public Address(String city, String state, String pinCode, String street) {
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public String getStreet() {
        return street;
    }
}
