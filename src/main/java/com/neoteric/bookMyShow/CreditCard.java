package com.neoteric.bookMyShow;

public class CreditCard implements PaymentService{
    @Override
    public void makePayment(String orderId, String merchantId, double amount) {
        System.out.println("Credit Card Payment:");
        System.out.println("Order ID: " + orderId);
        System.out.println("Merchant ID: " + merchantId);
        System.out.println("Amount: " + amount);
    }
}
