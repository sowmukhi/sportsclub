package com.neoteric.interfacePgm;

public class SBI implements RBI{
    @Override
    public void openAccount(String name) {
        System.out.println("SBI: Opened account for " + name);
    }

    @Override
    public void provideInterestRate() {
        System.out.println("SBI: Savings interest rate is 4%");
    }

    @Override
    public void knowYourCustomerGuidelines() {
        System.out.println("SBI: KYC must include Aadhaar and PAN card");
    }
    public void sbiExclusiveService() {
        System.out.println("SBI: Offering YONO digital banking app");
    }
}
