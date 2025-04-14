package com.neoteric.bookMyShow;

public interface PaymentService {
    void makePayment(String orderId,String merchantId,double amount);

    String refund(String orderId,String merchantId,double amount);
}
