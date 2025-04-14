package com.neoteric.bookMyShow;

public class ForexPaymentServiceImp implements ForexPaymentService{
    @Override
    public String convertion(String orderId, String merchantId, double amount) {
        double conversionRate = 0.012; // e.g., INR to USD
        double convertedAmount = amount * conversionRate;
        return "Converted ₹" + amount + " to $" + String.format("%.2f", convertedAmount);
    }

    @Override
    public void makePayment(String orderId, String merchantId, double amount) {
        String converted = convertion(orderId, merchantId, amount);
        System.out.println("Forex Payment (via International Gateway):");
        System.out.println(converted);
        System.out.println("Order ID: " + orderId + ", Merchant ID: " + merchantId);
    }

    @Override
    public String refund(String orderId, String merchantId, double amount) {
        return "Forex refund of ₹" + amount + " initiated for Order ID: " + orderId;
    }
}
