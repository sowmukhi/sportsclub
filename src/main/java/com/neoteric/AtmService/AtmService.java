package com.neoteric.AtmService;

import java.util.Map;

public class AtmService {

    public Amount getBalance(Card card,Pin pin){
        DbService dbService = new DbService();
        if(insertCard(card)){
            if(enterPin(pin)){
                Map<String,Amount> balanceMap = dbService.cardBalanceData;
                return balanceMap.get(card.number);
            }else {
                return null;
            }
        }else {
            return null;
        }
    }

    public boolean insertCard(Card card) {
        DbService dbService = new DbService();
        Map<String, Card> cardDB = dbService.cardData;
        if (cardDB.containsKey(card.number)) {
//            System.out.println("valid card, Please enter PIN");
            return true;
        } else {
//            System.out.println("invalid card");
            return false;
        }
    }
    public boolean enterPin(Pin vPin){
            DbService dbService = new DbService();
            Map<String,Pin> pinCardDb = dbService.pinData;
            Pin dbPin = pinCardDb.get(vPin.cardNumber);
            int vpin =Integer.parseInt(vPin.pinNumber);
            int dbpin = Integer.parseInt(dbPin.pinNumber);
            if(vpin == dbpin){
                return true;
            }else {
                return false;
            }

    }
    public boolean withdraw(Amount inputAmount,Card card){
        DbService dbService=new DbService();
        Map<String,Amount> balanceMap = dbService.cardBalanceData;
        Amount availBalanceAmt= balanceMap.get(card.number);
        if (availBalanceAmt.amt> inputAmount.amt){
            double totalBalance = availBalanceAmt.amt - inputAmount.amt;
            return true;
        }else {
            return false;
        }
    }
}
