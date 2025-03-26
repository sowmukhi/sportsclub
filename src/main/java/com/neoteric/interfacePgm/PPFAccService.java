package com.neoteric.interfacePgm;

public class PPFAccService extends SBI{
    public void openPPFAccount(String name, double amount) {
        System.out.println("PPF Account opened for " + name + " with amount ₹" + amount);
    }
}
