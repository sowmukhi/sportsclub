package com.neoteric.bookMyShow;

public class Ticket {
    private int ticketId;

    public Ticket(int ticketId) {
        this.ticketId = ticketId;
    }

    public Ticket() {
        System.out.println("Ticket generated successfully. Ticket ID: " + ticketId);
    }
    public int getTicketId() {
        return ticketId;
    }
}
