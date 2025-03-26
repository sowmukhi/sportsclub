package com.neoteric.openBankAccount;

public class Test {
    public static void main(String[] args) {
        // Creating an instance of BankService
        BankService bankService = new BankService();
        // Creating a customer
        Address customerAddress = new Address("Hyderabad", "TS", "530072", "SR Nagar");
        Customer customer = new Customer("Lavanya", "9866776464", "98765432321", "Go098765hu", customerAddress);

        // Opening an account
        Account account = bankService.openAccount(customer);
        System.out.println("Account created successfully!");
        System.out.println("Account Number: " + account.getAccNum());
        System.out.println("Customer Name: " + account.getCustomer().getCusName());

        // Adding a nominee
        Nominee nominee = bankService.addNominee("2"); // Example nominee from DbService
        if (nominee != null) {
            System.out.println("Nominee added successfully!");
            System.out.println("Nominee Name: " + nominee.getNominee_name());
        } else {
            System.out.println("Nominee not found!");
        }

        double balance = bankService.checkBalance(account.getAccNum());
        if (balance == -1.0) {
            System.out.println("Account not found!");
        } else {
            System.out.println("Current Balance: " + balance);
        }
// Trying to withdraw ₹4000 (should fail because min balance is ₹5000)
        boolean withdrawalSuccess = bankService.withdraw(account.getAccNum(), 4000.0);
        if (withdrawalSuccess) {
            System.out.println("₹4000 withdrawn successfully!");
        } else {
            System.out.println("Withdrawal denied! Minimum balance of ₹5000 must be maintained.");
        }

        // Depositing ₹5000
        bankService.deposit(account.getAccNum(), 5000.0);
        System.out.println("Deposited ₹5000");

        // Checking updated balance
        balance = bankService.checkBalance(account.getAccNum());
        System.out.println("Updated Balance: " + balance);

        // Trying to withdraw ₹3000 (should succeed)
        withdrawalSuccess = bankService.withdraw(account.getAccNum(), 3000.0);
        if (withdrawalSuccess) {
            System.out.println("₹3000 withdrawn successfully!");
        } else {
            System.out.println("Withdrawal denied! Minimum balance of ₹5000 must be maintained.");
        }

        // Checking final balance
        balance = bankService.checkBalance(account.getAccNum());
        System.out.println("Final Balance: " + balance);
    }
    }

