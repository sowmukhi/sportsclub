package com.neoteric.aadhaar;

public class Aadhaar {
    private String AadhaarNum;
    private Person person;

    public Aadhaar(String aadhaarNum, Person person) {
        AadhaarNum = aadhaarNum;
        this.person = person;
    }

    public String getAadhaarNum() {
        return AadhaarNum;
    }

    public Person getPerson() {
        return person;
    }
}
