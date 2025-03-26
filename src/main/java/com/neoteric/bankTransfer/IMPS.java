package com.neoteric.bankTransfer;

public class IMPS extends Transfer{

    private static final double IMPS_LIMIT = 500000.0;

    @Override
    public void transfer() {
        if (amount > IMPS_LIMIT) {
            System.out.println("Validation failed: IMPS transfer limit is ₹5,00,000.");
            return;
        }
        if (validate()) {
            Account sender = db.getAccount(senderAcc);
            Account receiver = db.getAccount(receiverAcc);

            sender.setBalance(sender.getBalance() - amount);
            receiver.setBalance(receiver.getBalance() + amount);

            db.updateAccount(sender);
            db.updateAccount(receiver);

            System.out.println("Transfer successful via IMPS.");
        }
    }
}
