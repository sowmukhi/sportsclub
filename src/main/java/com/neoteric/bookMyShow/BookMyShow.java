package com.neoteric.bookMyShow;

public abstract class BookMyShow implements PaymentService{
    public Ticket getTicket(String fromAccount, Double amount, Order order){
        System.out.println("Booking movie ticket");
        double tax=getServiceTax(amount);
        double totalAmt=tax+amount;
        // Make payment
        makePayment(order.getOrderId(), "NEOTERIC123", totalAmt);
        return new Ticket();
    }

    public double getServiceTax(Double amount){
        return amount * 0.18;
    }
}
