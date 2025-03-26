package com.neoteric.bankTransfer;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DbService {
    Map<String,Account> accDetails =new HashMap<>();

    public Account generateAccNum(Account account){
        String accNum=UUID.randomUUID().toString();
        account.setAccNum(accNum);
        accDetails.put(accNum,account);
        return account;
    }

    public Account getAccount(String accNum) {
        return accDetails.get(accNum);
    }

    public void updateAccount(Account account) {
        accDetails.put(account.getAccNum(), account);
    }
}
