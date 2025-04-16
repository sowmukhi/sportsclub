package com.neoteric.exception;

public class AccountService {
    public Amount withdraw(Account cardAccount) throws InsufficientBalanceException{
        AccountRepo accountRepo=new AccountRepo();
        Account dbAccount=accountRepo.getAccByNum(cardAccount.getAccNo());
        if (dbAccount.getBalance()> cardAccount.getBalance()){
            dbAccount.setBalance(dbAccount.getBalance()-cardAccount.getBalance());
            Amount amount=new Amount(cardAccount.getBalance(), dbAccount.getBalance());
            return amount;
        }{
            throw new InsufficientBalanceException("Insufficient balance in this account"+dbAccount.getAccNo());
        }
    }
}
