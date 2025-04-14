package com.neoteric.bookMyShow;

public class NetBanking implements PaymentService{
    @Override
    public void makePayment(String orderId, String merchantId, double amount) {
        System.out.println("NetBanking Payment:");
        System.out.println("Order ID: " + orderId);
        System.out.println("Merchant ID: " + merchantId);
        System.out.println("Amount: " + amount);
    }

    @Override
    public String refund(String orderId, String merchantId, double amount) {
        return "Refund of ₹" + amount + " initiated for Order ID: " + orderId + " to NetBanking.";
    }
}
