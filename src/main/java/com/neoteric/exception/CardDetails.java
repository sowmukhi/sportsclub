package com.neoteric.exception;

public class CardDetails {
    private String cardNum;
    private String pinNum;
    private Account account;

    public String getCardNum() {
        return cardNum;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    public String getPinNum() {
        return pinNum;
    }

    public void setPinNum(String pinNum) {
        this.pinNum = pinNum;
    }
}
