package com.neoteric.bookMyShow;

public class RazorpayClient {
    public void create(Order order) {
        System.out.println("Creating order in Razorpay...");
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Amount: ₹" + order.getAmount());
        System.out.println("Order created successfully.");
    }

    public void create(Payment payment) {
        System.out.println("Initiating payment in Razorpay...");
        System.out.println("Payment ID: " + payment.getPaymentId());
        System.out.println("Order ID: " + payment.getOrderId());
        System.out.println("Amount: ₹" + payment.getAmount());
        System.out.println("Status: " + payment.getStatus());
        System.out.println("Payment processed successfully.");
    }

    public void fetch(Refund refund) {
        System.out.println("Initiating refund in Razorpay...");
        System.out.println("Refund ID: " + refund.getRefundId());
        System.out.println("Payment ID: " + refund.getPaymentId());
        System.out.println("Amount: ₹" + refund.getAmount());
        System.out.println("Refund processed successfully.");
    }
}
