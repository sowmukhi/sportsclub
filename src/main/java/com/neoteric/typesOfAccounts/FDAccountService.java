package com.neoteric.typesOfAccounts;

public class FDAccountService extends AccountService{
    @Override
    protected void generateAccNumber() {
        String accNum = "FD-" + java.util.UUID.randomUUID().toString().substring(0, 8);
        account.setAccNum(accNum);
        account.setAccType("FD");
        System.out.println("FD Account Number Generated: " + accNum);
    }

    @Override
    protected void interestRate() {
        System.out.println("FD Interest Rate: 6.5%");
    }

    @Override
    protected void maturityDate() {
        System.out.println("FD Maturity Date: 5 years from opening date");
    }
}
