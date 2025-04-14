package com.neoteric.bookMyShow;

public class Ticket {
    private int ticketId;
    private static int counter = 1000;

    public Ticket(int ticketId) {
        this.ticketId = ticketId;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                '}';
    }

    public Ticket() {
        this.ticketId = ++counter;
        System.out.println("Ticket generated successfully. Ticket ID: " + ticketId);
    }
    public int getTicketId() {
        return ticketId;
    }
}
