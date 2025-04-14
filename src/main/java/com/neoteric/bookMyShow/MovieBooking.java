package com.neoteric.bookMyShow;

public class MovieBooking extends BookMyShow{
    private PaymentService paymentService;
    private Slot slot;

    public MovieBooking(PaymentService paymentService, Slot slot) {
        this.paymentService = paymentService;
        this.slot = slot;
    }

    @Override
    public void makePayment(String orderId, String merchantId, double amount) {
        paymentService.makePayment(orderId, merchantId, amount);
    }

    @Override
    public String refund(String orderId, String merchantId, double amount) {
        return paymentService.refund(orderId, merchantId, amount);
    }

    public Ticket bookMovieTicket(String fromAccount, Order order, String seatNumber) {
        Seat selectedSeat = slot.getSeatByNumber(seatNumber);

        if (selectedSeat == null) {
            System.out.println("Seat " + seatNumber + " does not exist.");
            return null;
        }

        if (!selectedSeat.book()) {
            System.out.println("Seat " + seatNumber + " is already booked.");
            return null;
        }

        System.out.println("Seat " + seatNumber + " booked successfully.");
        return getTicket(fromAccount, order.getAmount(), order);
    }
}
