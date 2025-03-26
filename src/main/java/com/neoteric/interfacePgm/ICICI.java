package com.neoteric.interfacePgm;

public class ICICI implements RBI{
    @Override
    public void openAccount(String name) {
        System.out.println("ICICI: Opened account for " + name);
    }

    @Override
    public void provideInterestRate() {
        System.out.println("ICICI: Savings interest rate is 3.5%");
    }

    @Override
    public void knowYourCustomerGuidelines() {
        System.out.println("ICICI: KYC requires Aadhaar, PAN, and passport photo");
    }
    public void iciciExclusiveService() {
        System.out.println("ICICI: Offering iMobile Pay app");
    }
}
