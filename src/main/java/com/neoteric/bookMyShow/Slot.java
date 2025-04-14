package com.neoteric.bookMyShow;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Slot {
    private Movie movie;
    private LocalTime startTime;
    private List<Seat> seats;

    public Slot(Movie movie, LocalTime startTime, int seatCount) {
        this.movie = movie;
        this.startTime = startTime;
        this.seats = new ArrayList<>();
        generateSeats(seatCount);
    }

    private void generateSeats(int count) {
        for (int i = 1; i <= count; i++) {
            String seatNumber = "A" + i;
            seats.add(new Seat(seatNumber));
        }
    }

    public Movie getMovie() {
        return movie;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public Seat getSeatByNumber(String seatNumber) {
        for (Seat seat : seats) {
            if (seat.getSeatNumber().equalsIgnoreCase(seatNumber)) {
                return seat;
            }
        }
        return null;
    }

    public List<Seat> getAvailableSeats() {
        List<Seat> available = new ArrayList<>();
        for (Seat seat : seats) {
            if (!seat.isBooked()) {
                available.add(seat);
            }
        }
        return available;
    }

    @Override
    public String toString() {
        return "Slot{" +
                "movie=" + movie +
                ", startTime=" + startTime +
                ", seats=" + seats +
                '}';
    }
}
