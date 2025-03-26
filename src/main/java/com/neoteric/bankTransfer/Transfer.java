package com.neoteric.bankTransfer;

public abstract class Transfer {
    protected double amount;
    protected String senderAcc;
    protected String receiverAcc;

    public abstract void transfer();

    protected DbService db;

    public void setDbService(DbService db) {
        this.db = db;
    }


    protected boolean validate() {
        return validateAccountNumbers() &&
                validateDifferentAccounts() &&
                validateAmount() &&
                validateAccountExistence() &&
                validateBalance();
    }

    protected boolean validateAccountNumbers() {
        if (senderAcc == null || receiverAcc == null || senderAcc.isEmpty() || receiverAcc.isEmpty()) {
            System.out.println("Validation failed: Account numbers must not be null or empty.");
            return false;
        }
        return true;
    }

    protected boolean validateDifferentAccounts() {
        if (senderAcc.equals(receiverAcc)) {
            System.out.println("Validation failed: Sender and receiver accounts cannot be the same.");
            return false;
        }
        return true;
    }

    protected boolean validateAmount() {
        if (amount <= 0) {
            System.out.println("Validation failed: Transfer amount must be greater than 0.");
            return false;
        }
        return true;
    }

    protected boolean validateAccountExistence() {
        if (db.getAccount(senderAcc) == null) {
            System.out.println("Validation failed: Sender account not found.");
            return false;
        }
        if (db.getAccount(receiverAcc) == null) {
            System.out.println("Validation failed: Receiver account not found.");
            return false;
        }
        return true;
    }

    protected boolean validateBalance() {
        Account sender = db.getAccount(senderAcc);
        if (sender.getBalance() < amount) {
            System.out.println("Validation failed: Insufficient funds in sender's account.");
            return false;
        }
        return true;
    }

}
