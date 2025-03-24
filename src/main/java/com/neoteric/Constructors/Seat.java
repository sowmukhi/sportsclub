package com.neoteric.Constructors;

public class Seat {
    String seatNo;

    @Override
    public String toString() {
        return "seatNo=" + seatNo;
    }

    Seat(String seatNo){
        this.seatNo = seatNo;

    }
}
