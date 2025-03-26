package com.neoteric.schoolFee;

public class PhonePe extends Payment{
    PhonePe(double amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("PhonePe Selected.");
        System.out.println("Total Amount to be Paid: ₹" + amount);
    }
}
