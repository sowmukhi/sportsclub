package com.neoteric.typesOfAccounts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BankService {
    DBService dbService=new DBService();


    Map<String, Account> accountMap = new HashMap<>();
    Map<String, Nominee> nomineeMap = new HashMap<>();

//    public Account openAccount(Customer customer){
//        String accNum = UUID.randomUUID().toString();
//        Account account=new Account(customer);
//        accountMap.put(accNum,account);
//        return account;
//    }
//
//    public Nominee addNominee(String nomineeAccNum){
//        Nominee nominee = dbService.nomineeMap.get(nomineeAccNum);
//        if(nominee != null) {
//            nomineeMap.put(nomineeAccNum, nominee);
//            return nominee;
//        }
//        return null;
//    }
// Open an account based on account type
public Account openAccount(String mobileNum, String accType) {
    // Check if customer exists in DB
    if (!dbService.isValidCustomer(mobileNum)) {
        System.out.println("Customer not found.");
        return null;
    }

    Customer customer = dbService.getCustomerByMobile(mobileNum);
    String accNum = UUID.randomUUID().toString().substring(0, 8);
    Account account;

    switch (accType.toUpperCase()) {
        case "SAVINGS":
            account = new SavingsAccount(accNum, customer, "A123456789", "PAN123456");
            break;
        case "FD":
            account = new FDAccount(accNum, customer, "5 years");
            break;
        case "PPF":
            account = new PPFAccount(accNum, customer, 15);
            break;
        default:
            System.out.println("Invalid account type.");
            return null;
    }

    account.setAccNum(accNum);
    account.setAccType(accType.toUpperCase());
    accountMap.put(accNum, account);

    System.out.println(accType + " Account created for customer: " + customer.getCustomerName() + " | Account Number: " + accNum);
    return account;
}

    // Add a nominee to an existing account
    public Nominee addNominee(String accNum, String nomineeAccNum) {
        Account account = accountMap.get(accNum);
        if (account == null) {
            System.out.println("Account not found.");
            return null;
        }

        Nominee nominee = dbService.getNomineeByAccNo(nomineeAccNum);
        if (nominee != null) {
            if (account.getNomineeList() == null) {
                account.setNomineeList(new ArrayList<>());
            }
            account.getNomineeList().add(nominee);
            nomineeMap.put(nomineeAccNum, nominee);
            System.out.println("Nominee " + nominee.getNomineeName() + " added to account " + accNum);
            return nominee;
        }

        System.out.println("Nominee not found in DB.");
        return null;
    }
}
