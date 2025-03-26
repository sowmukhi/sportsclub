package com.neoteric.bankTransfer;

public class Main {
    public static void main(String[] args) {
            DbService db = new DbService();

            Account acc1 = new Account(null, 1000.0, "Alice");
            Account acc2 = new Account(null, 500.0, "Bob");

            db.generateAccNum(acc1);
            db.generateAccNum(acc2);

            System.out.println("Before Transfer:");
            System.out.println("Alice Balance: " + acc1.getBalance());
            System.out.println("Bob Balance: " + acc2.getBalance());

            IMPS imps = new IMPS();
            imps.setDbService(db);
            imps.senderAcc = acc1.getAccNum();
            imps.receiverAcc = acc2.getAccNum();
            imps.amount = 300000000.0;
            imps.transfer();

            System.out.println("After Transfer:");
            System.out.println("Alice Balance: " + db.getAccount(acc1.getAccNum()).getBalance());
            System.out.println("Bob Balance: " + db.getAccount(acc2.getAccNum()).getBalance());

        }
    }