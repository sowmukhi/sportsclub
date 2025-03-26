package com.neoteric.schoolFee;

public class CreditCard extends Payment{
    CreditCard(double amount) {
        super(amount);
    }

    @Override
    void pay() {
        double extraCharge = amount * 0.02;
        double total = amount + extraCharge;
        System.out.println("Credit Card Selected.");
        System.out.println("2% extra charge applicable.");
        System.out.println("Total Amount to be Paid: ₹" + total);
    }
}
