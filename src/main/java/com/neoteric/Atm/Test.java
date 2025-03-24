package com.neoteric.Atm;

public class Test {
    public static void main( String[] args ) {

        Card card1111 = new Card();

        card1111.pinNo = "1000505";
        card1111.cardNumber = "11111";
        card1111.fromDate = "14-03-2025";
        card1111.toDate = "14-03-2031";

        AtmService1 atmService = new AtmService1();
        atmService.insertCard();
        atmService.enterPin("1111");
        atmService.withdraw(1000.0);
    }
    }
