package com.neoteric.bookMyShow;

public class BookMyShowPaymentGateway {
    public PaymentService getPaymentService(String paymentType){
        PaymentService paymentService = null;
        if("CARD".equalsIgnoreCase(paymentType)){
            paymentService= new CreditCard();
        } else if ("UPI".equalsIgnoreCase(paymentType)) {
            paymentService=new UPI();
        } else if ("NetBanking".equalsIgnoreCase(paymentType)) {
            paymentService=new NetBanking();
        } else if ("ForexPaymentService".equalsIgnoreCase(paymentType)) {
            paymentService=new ForexPaymentServiceImp();
        }
        return paymentService;
    }
}
