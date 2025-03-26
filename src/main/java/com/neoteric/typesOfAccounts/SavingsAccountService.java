package com.neoteric.typesOfAccounts;

public class SavingsAccountService extends AccountService{
    @Override
    protected void generateAccNumber() {
        String accNum = "SA-" + java.util.UUID.randomUUID().toString().substring(0, 8);
        account.setAccNum(accNum);
        account.setAccType("Savings Acc");
        System.out.println("SA Account Number Generated: " + accNum);
    }

    @Override
    protected void interestRate() {
        System.out.println("Savings Acc Interest Rate: 3%");
    }

    @Override
    protected void maturityDate() {
        System.out.println("Savings Acc Maturity Date: anytime");
    }
}
