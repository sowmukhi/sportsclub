package com.neoteric.exception;

public class LoginService {
    public Account login(CardDetails cardDetails) throws LoginFailedException{
        AccountRepo accountRepo=new AccountRepo();
        CardDetails dbcardDetails =accountRepo.getCardDetails(cardDetails.getCardNum());
        if(cardDetails.getCardNum().equalsIgnoreCase(dbcardDetails.getCardNum()) && cardDetails.getPinNum().equalsIgnoreCase(dbcardDetails.getPinNum())){
            return dbcardDetails.getAccount();
        }else{
            throw new LoginFailedException("Invalid credentials...");
        }
    }
}
