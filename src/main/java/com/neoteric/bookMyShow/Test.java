package com.neoteric.bookMyShow;

public class Test {
    public static void main(String[] args) {
        // Create order
        Order order = new Order("ORD123", 250.0);

        // Choose a payment method dynamically
        PaymentService selectedPaymentMethod = new UPI(); // Can be UPI, NetBanking, or CreditCard

        // Pass it to MovieBooking
        MovieBooking booking = new MovieBooking(selectedPaymentMethod);

        // Get ticket
        Ticket ticket = booking.getTicket("9876543210", order.getAmount(), order);

        System.out.println("Ticket booked with ID: " + ticket.getTicketId());
    }
}
