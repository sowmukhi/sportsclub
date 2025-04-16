package com.neoteric.bookMyShow;

public class PaymentFailedException extends Exception{
    public PaymentFailedException(String message) {
        super(message);
    }
}
