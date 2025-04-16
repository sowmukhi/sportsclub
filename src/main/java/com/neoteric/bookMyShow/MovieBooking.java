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

    public Ticket bookMovieTicket(String fromAccount, Order order, String seatNumber) throws InvalidSeatException, SeatNotAvailableException, PaymentFailedException {
        Seat selectedSeat = slot.getSeatByNumber(seatNumber);

        if (selectedSeat == null) {
            throw new InvalidSeatException("Seat " + seatNumber + " does not exist.");
        }

        if (!selectedSeat.book()) {
            throw new SeatNotAvailableException("Seat " + seatNumber + " is already booked.");
        }

        System.out.println("Seat " + seatNumber + " booked successfully.");

        try {
            return getTicket(fromAccount, order.getAmount(), order);
        } catch (IllegalArgumentException e) {
            throw new PaymentFailedException("Payment failed: " + e.getMessage());
        }
    }
}
