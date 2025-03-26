package com.neoteric.accountSummary;

import java.util.*;

public class AccDbService {
    private static Map<String,List<Transaction>> accTransactionMap = new HashMap<>();
    public AccDbService(){
        this.populateData();
    }
    public void populateData(){
        List<Transaction> transactionList=new ArrayList<>();
        Transaction transaction1=new Transaction("123456789","11111111","DEBIT",new Date(),1000.0);
        Transaction transaction2=new Transaction("2222222222","123456789","CREDIT",new Date(),1000.0);
        transactionList.add(transaction1);
        transactionList.add(transaction2);
        accTransactionMap.put("123456789",transactionList);
    }
    public List<Transaction> getAccData(String accNum){
        List<Transaction> transactionList = accTransactionMap.get(accNum);
        return transactionList;
    }
}
