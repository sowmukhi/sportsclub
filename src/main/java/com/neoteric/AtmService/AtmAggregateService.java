package com.neoteric.AtmService;

public class AtmAggregateService {
    public Amount balance(Card inputcard, Pin inputpin){
        AtmService atmService=new AtmService();
        return atmService.getBalance(inputcard,inputpin);
    }
}
//    public boolean withdraw(Card card, Pin pin, double amount) {
//        AtmService atmService = new AtmService();
//        boolean isValidCard = atmService.insertCard(card);
//        if (!isValidCard) {
//            System.out.println("Invalid Card! Withdrawal failed.");
//            return false;
//        }
//        boolean isValidPin = atmService.enterPin(pin);
//        if (!isValidPin) {
//            System.out.println("Invalid PIN! Withdrawal failed.");
//            return false;
//        }
//        boolean isDebited = atmService.debit(card.getNumber(), amount);
//        if (!isDebited) {
//            System.out.println("Insufficient balance! Withdrawal failed.");
//            return false;
//        }
//
//        System.out.println("Withdrawal successful! Amount: " + amount);
//        return true;
//  }
//
//
//    public boolean deposit(Card card, Pin pin, double amount) {
//        AtmService atmService = new AtmService();
//
//        if (!atmService.insertCard(card)) {
//            System.out.println("Invalid Card! Deposit failed.");
//            return false;
//        }
//
//        if (!atmService.enterPin(pin)) {
//            System.out.println("Invalid PIN! Deposit failed.");
//            return false;
//        }
//
//        if (!atmService.credit(card.getNumber(), amount)) {
//            System.out.println("Deposit failed due to an invalid amount.");
//            return false;
//        }
//
//        System.out.println("Deposit successful! Amount: " + amount);
//        return true;
//    }
//    }
//    }