package com.neoteric.schoolFee;

public class NetBanking extends Payment{
    NetBanking(double amount) {
        super(amount);
    }

    @Override
    void pay() {
        System.out.println("NetBanking Selected.");
        System.out.println("Total Amount to be Paid: ₹" + amount);
    }
}
