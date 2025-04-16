package com.neoteric.bookMyShow;

import java.util.List;

public class Test {
    public static void main(String[] args) {
//        // Initialize payment gateway and get the payment service
//        BookMyShowPaymentGateway gateway = new BookMyShowPaymentGateway();
//        PaymentService paymentService = gateway.getPaymentService("ForexPaymentService");
//
//        // Initialize SlotManager and get all slots
//        SlotManager slotManager = new SlotManager();
//        List<Slot> slots = slotManager.getAvailableSlots();
//
//        // Display all slots
//        System.out.println("Available Slots:");
//        for (int i = 0; i < slots.size(); i++) {
//            System.out.println(i + ". " + slots.get(i));
//        }
//
//        // Hardcoded slot selection (e.g., selecting the 2nd slot - index 1)
//        int selectedIndex = 2; // Change this to try other slots
//        Slot selectedSlot = slotManager.getSlotByIndex(selectedIndex);
//
//        if (selectedSlot == null) {
//            System.out.println("Invalid slot selection.");
//            return;
//        }
//        System.out.println("\nAvailable Seats in Selected Slot:");
//        for (Seat seat : selectedSlot.getAvailableSeats()) {
//            System.out.println(seat);
//        }
//
//        String selectedSeat = "A5"; // Seat number to book
//        System.out.println("\nAttempting to book seat: " + selectedSeat);
//
//        // Create an Order
//        Order order = new Order("ORD123", 500.0);
//
//        // Inject slot and payment service into MovieBooking
//        MovieBooking booking = new MovieBooking(paymentService, selectedSlot);
//
//        // Book the movie ticket
//        Ticket ticket = booking.bookMovieTicket("abc@upi", order,selectedSeat);
//
//        // Display ticket info
//        if (ticket != null) {
//            System.out.println("Ticket ID: " + ticket.getTicketId());
//        }
        try {
            // Setup code
            BookMyShowPaymentGateway gateway = new BookMyShowPaymentGateway();
            PaymentService paymentService = gateway.getPaymentService("ForexPaymentService");

            SlotManager slotManager = new SlotManager();
            Slot selectedSlot = slotManager.getSlotByIndex(2);
            if (selectedSlot == null) {
                System.out.println("Invalid slot selection.");
                return;
            }

            System.out.println("Available Seats:");
            selectedSlot.getAvailableSeats().forEach(System.out::println);

            Order order = new Order("ORD123", 500.0);
            MovieBooking booking = new MovieBooking(paymentService, selectedSlot);

            Ticket ticket = booking.bookMovieTicket("abc@upi", order, "A5");
            if (ticket != null) {
                System.out.println("Ticket ID: " + ticket.getTicketId());
            }

        } catch (InvalidSeatException | SeatNotAvailableException | PaymentFailedException e) {
            System.err.println("Booking failed: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error occurred: " + e.getMessage());
        }
    }
}
