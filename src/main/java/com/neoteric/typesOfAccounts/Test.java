package com.neoteric.typesOfAccounts;

public class Test {
    public static void main(String[] args) {
        BankService bankService = new BankService();

        Account newAccount = bankService.openAccount("123456789", "FD");
        if (newAccount != null) {
            bankService.addNominee(newAccount.getAccNum(), "12345");
        }
    }
}
