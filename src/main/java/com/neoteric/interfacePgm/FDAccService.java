package com.neoteric.interfacePgm;

public class FDAccService extends SBI{
    public void openFDAccount(String name, double amount) {
        System.out.println("FD Account opened for " + name + " with amount ₹" + amount);
    }
}
