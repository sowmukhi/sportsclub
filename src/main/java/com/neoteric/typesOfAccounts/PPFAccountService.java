package com.neoteric.typesOfAccounts;

public class PPFAccountService extends AccountService{
    @Override
    protected void generateAccNumber() {
        String accNum = "PPF-" + java.util.UUID.randomUUID().toString().substring(0, 8);
        account.setAccNum(accNum);
        account.setAccType("PPF");
        System.out.println("PPF Account Number Generated: " + accNum);
    }

    @Override
    protected void interestRate() {
        System.out.println("PPF Interest Rate: 7.3%");
    }

    @Override
    protected void maturityDate() {
        System.out.println("PPF Maturity Date: 15 years from opening date");
    }
}
