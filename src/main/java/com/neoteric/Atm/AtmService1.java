package com.neoteric.Atm;

public class AtmService1 {
    // insert the card
    public void insertCard() {
        System.out.println("Card inserted successfully. Please enter your PIN.");
    }

    //  enter the PIN
    public boolean enterPin(String pin) {
        String pinNumber="1111";
        if (pinNumber.equals(pin)) {
            System.out.println("PIN entered correctly. Access granted.");
            return true;
        } else {
            System.out.println("Incorrect PIN. Access denied.");
            return false;
        }
    }

    //  withdraw money
    public void withdraw(double amount) {
        double balance = 1000.0;
        if (amount > balance) {
            System.out.println("Insufficient funds. Transaction declined.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }

}
