package com.neoteric.bookMyShow;

public class MovieBooking extends BookMyShow{
    private PaymentService paymentService;

    public MovieBooking(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public void makePayment(String orderId, String merchantId, double amount) {
        paymentService.makePayment(orderId, merchantId, amount);
    }
}
