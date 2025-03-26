package com.neoteric.openBankAccount;


import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BankService {
    DbService dbService=new DbService();

    Map<String,Account> accountMap = new HashMap<>();
    Map<String, Nominee> nomineeMap = new HashMap<>();
    Address cusAddress=new Address("hyd","TS","53072","SRNagar");
    Customer customer=new Customer("lavanya","9866776464","98765432321","Go098765hu",cusAddress);
    Address bankAddress=new Address("hyd","TS","53072","kphb");

    public Account openAccount(Customer customer){
        String accNum = UUID.randomUUID().toString();
        Account account=new Account(accNum,customer,bankAddress);
        accountMap.put(accNum,account);
        return account;
    }

    public Nominee addNominee(String nomineeAccNum){
        Nominee nominee = dbService.nomineeMap.get(nomineeAccNum);
        if(nominee != null) {
            nomineeMap.put(nomineeAccNum, nominee);
            return nominee;
        }
        return null;
    }
    public double checkBalance(String accNum) {
        Account account = accountMap.get(accNum);
        if (account != null) {
            return account.getBalance();
        }
        return -1.0;
    }
    public boolean deposit(String accNum, double amount) {
        Account account = accountMap.get(accNum);
        if (account != null && amount > 0) {
            account.deposit(amount);
            return true;
        }
        return false;
    }

    public boolean withdraw(String accNum, double amount) {
        Account account = accountMap.get(accNum);
        if (account != null) {
            return account.withdraw(amount);
        }
        return false;
    }

    }
