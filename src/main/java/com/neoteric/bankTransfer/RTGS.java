package com.neoteric.bankTransfer;

public class RTGS extends Transfer{

    private static final double RTGS_LIMIT = 5000000.0;

    @Override
    public void transfer() {
        if (amount > RTGS_LIMIT) {
            System.out.println("Validation failed: IMPS transfer limit is ₹50,00,000.");
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
