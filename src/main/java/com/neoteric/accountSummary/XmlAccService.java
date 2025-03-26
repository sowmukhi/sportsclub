package com.neoteric.accountSummary;

import java.util.Date;
import java.util.List;

public class XmlAccService extends AccountSummaryService{

    @Override
    String write(List<Transaction> transactionList) {
        System.out.println("Xml");
        return "accSummary"+new Date()+".xml";
    }
}
