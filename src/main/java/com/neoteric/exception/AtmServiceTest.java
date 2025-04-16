package com.neoteric.exception;

public class AtmServiceTest {
    public static void main(String[] args) {
        try {
            CardDetails card1111 = new CardDetails();
            card1111.setCardNum("1111111111111");
            card1111.setPinNum("1234");

            Account acc1111 = new Account();
            acc1111.setAccNo("11111");
            acc1111.setBalance(3000);
            acc1111.setCardDetails(card1111);
            card1111.setAccount(acc1111);

            AtmService atmService = new AtmService();
            ApiResponse<Amount> amount = atmService.getMoney(card1111);

            if (amount.getData() != null) {
                System.out.println("amount " + amount.getData().getAmount() + " balance " + amount.getData().getBalance());
            } else {
                System.out.println("amount " + amount.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Exception in ATM transaction: " + e.getMessage());
        }
    }
}
