package com.neoteric.typesOfAccounts;

import java.util.ArrayList;
import java.util.List;

public abstract class AccountService {
    protected Account account;
    protected DBService dbService;

    protected void balanceAmt(){
        System.out.println("Current balance: " + account.getBalance());
    }

    protected boolean addNominee(String nomineeAccNum){
        if (dbService.isValidNominee(nomineeAccNum)) {
            Nominee nominee = dbService.getNomineeByAccNo(nomineeAccNum);
            if (account.getNomineeList() == null) {
                account.setNomineeList(new ArrayList<>());
            }
            account.getNomineeList().add(nominee);
            System.out.println("Nominee added: " + nominee.getNomineeName());
            return true;
        }
        System.out.println("Invalid nominee account number.");
        return false;
    }
    protected abstract void generateAccNumber();
    protected abstract void interestRate();
    protected abstract void maturityDate();
}
