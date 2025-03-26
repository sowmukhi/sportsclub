package com.neoteric.accountSummary;

import java.util.Date;

public class Transaction {
    private String fromAcc;
    private String toAcc;
    private String transactionType;
    private Date transactionDate;
    private Double amount;


    public Transaction(String fromAcc, String toAcc, String transactionType, Date transactionDate, Double amount) {
        this.fromAcc = fromAcc;
        this.toAcc = toAcc;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.amount = amount;
    }

}
