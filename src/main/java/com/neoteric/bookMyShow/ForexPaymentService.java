package com.neoteric.bookMyShow;

public interface ForexPaymentService extends PaymentService{
    String convertion(String orderId, String merchantId, double amount);
}
