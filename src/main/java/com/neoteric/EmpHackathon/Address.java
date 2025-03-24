package com.neoteric.EmpHackathon;

public class Address {
    public String city;
    public String state;
    public String pinCode;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }

    public Address(String city, String state, String pinCode){
        this.state=state;
        this.city=city;
        this.pinCode =pinCode;
    }
}
