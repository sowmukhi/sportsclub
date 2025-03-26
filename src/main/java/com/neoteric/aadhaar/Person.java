package com.neoteric.aadhaar;

public class Person {
    private String name;
    private String DOB;
    private String mobileNum;
    private Hand fingers;
    private Eye eye;
    private Address address;

    public String getName() {
        return name;
    }

    public String getDOB() {
        return DOB;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public Hand getFingers() {
        return fingers;
    }

    public Eye getEye() {
        return eye;
    }

    public Address getAddress() {
        return address;
    }

    public Person(String name, String DOB, String mobileNum, Hand fingers, Eye eye, Address address) {
        this.name = name;
        this.DOB = DOB;
        this.mobileNum = mobileNum;
        this.fingers = fingers;
        this.eye = eye;
        this.address = address;
    }


}
