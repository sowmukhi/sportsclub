package com.neoteric.bookMyShow;

public class Refund {
    private String refundId;
    private String paymentId;
    private double amount;

    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Refund(String refundId, String paymentId, double amount) {
        this.refundId = refundId;
        this.paymentId = paymentId;
        this.amount = amount;
    }
}
