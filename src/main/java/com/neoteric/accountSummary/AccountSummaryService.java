package com.neoteric.accountSummary;

import java.util.List;
import java.util.Map;

public abstract class AccountSummaryService {
    public AccountFile getAccSummary(String account){
        AccDbService dbService=new AccDbService();
        List<Transaction> transactionList=dbService.getAccData(account);
        String fileName = write(transactionList);
        AccountFile accountFile=new AccountFile(fileName);
        return accountFile;
    }
    abstract String write(List<Transaction> transactionList);
}
