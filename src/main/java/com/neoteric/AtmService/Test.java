package com.neoteric.AtmService;

public class Test {
    public static void main(String[] args) {
        Card inputcard = new Card();
        inputcard.number="11111";
        Pin inputpin =new Pin();
        inputpin.cardNumber="11111";
        inputpin.pinNumber="1111";
       Amount inputAmount = new Amount();
       AtmAggregateService atmAggregateService=new AtmAggregateService();
        atmAggregateService.balance(inputcard,inputpin);
        AtmService atmService=new AtmService();
        atmService.withdraw(inputAmount,inputcard);
    }
}
