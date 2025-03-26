package com.neoteric.interfacePgm;

public class BankApp {
    public static void main(String[] args) {
        FDAccService fd = new FDAccService();
        fd.openAccount("Ravi");
        fd.openFDAccount("Ravi", 100000);
        fd.provideInterestRate();
        fd.knowYourCustomerGuidelines();
        fd.sbiExclusiveService();

        System.out.println();

        // RBI rules through ICICI
        ICICI icici = new ICICI();
        icici.openAccount("Priya");
        icici.provideInterestRate();
        icici.knowYourCustomerGuidelines();
        icici.iciciExclusiveService();

        System.out.println();

        // Savings Account Service from SBI
        SavingsAccService sav = new SavingsAccService();
        sav.openSavingsAccount("Kiran");
        sav.provideInterestRate();

        System.out.println();

        // PPF Account Service from SBI
        PPFAccService ppf = new PPFAccService();
        ppf.openPPFAccount("Arjun", 50000);
    }
}
