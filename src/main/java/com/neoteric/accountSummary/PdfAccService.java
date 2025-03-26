package com.neoteric.accountSummary;

import java.util.Date;
import java.util.List;

public class PdfAccService extends AccountSummaryService{
    @Override
    String write(List<Transaction> transactionList) {
        System.out.println("pdf");
        return "accSummary"+new Date()+".pdf";
    }
}
