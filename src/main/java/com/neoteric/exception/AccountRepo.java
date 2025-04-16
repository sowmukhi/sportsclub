package com.neoteric.exception;

import java.util.HashMap;
import java.util.Map;

public class AccountRepo {
    private static Map<String,Account> accountMap=new HashMap<>();

    private static Map<String,CardDetails> cardDetailsMap =new HashMap<>();

    static {
        CardDetails card1111=new CardDetails();
        card1111.setCardNum("1111111111111");
        card1111.setPinNum("1234");
        Account acc1111=new Account();
        acc1111.setAccNo("11111");
        acc1111.setBalance(5000);
        acc1111.setCardDetails(card1111);
        card1111.setAccount(acc1111);

        accountMap.put(acc1111.getAccNo(),acc1111);
        cardDetailsMap.put(card1111.getCardNum(),card1111);

        CardDetails card2222=new CardDetails();
        card2222.setCardNum("22222222222");
        card2222.setPinNum("1234");
        Account acc2222=new Account();
        acc2222.setAccNo("22222");
        acc2222.setBalance(2000);
        acc2222.setCardDetails(card2222);
        card2222.setAccount(acc2222);

        accountMap.put(acc2222.getAccNo(),acc2222);
        cardDetailsMap.put(card2222.getCardNum(),card2222);
    }

    public Account getAccByNum(String accNum){
        return accountMap.get(accNum);
    }

    public CardDetails getCardDetails(String cardNum){
        return cardDetailsMap.get(cardNum);
    }
}
