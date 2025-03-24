package com.neoteric.AtmService;

import java.util.HashMap;
import java.util.Map;

public class DbService {
    Map<String,Card> cardData = new HashMap<>();
    Map<String,Pin> pinData =new HashMap<>();
    Map<String,Amount> cardBalanceData =new HashMap<>();

    public DbService(){
        populateData();
        populatePinData();
        populateBalanceData();
    }
    public void populateData() {
        Card card1111 = new Card();
        card1111.name = "Sowmukhi";
        card1111.number = "11111";
        card1111.fromDate = "14-03-2025";
        card1111.toDate = "14-03-2031";
        cardData.put("11111", card1111);

    }
    public void populatePinData(){
            Pin pin1111 = new Pin();
            pin1111.pinNumber = "1111";
            pin1111.cardNumber = "11111";

            pinData.put("11111", pin1111);
        }

    public void populateBalanceData(){
        Amount amount1111 = new Amount();
        amount1111.amt=10000;
        amount1111.currency="INR";
        cardBalanceData.put("11111", amount1111);
    }
}
