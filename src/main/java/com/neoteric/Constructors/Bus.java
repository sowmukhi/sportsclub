package com.neoteric.Constructors;

import java.util.Arrays;

public class Bus {
    String fromDate;
    String toDate;
    String type;
    String serviceNo;
    String fromLocation;
    String toLocation;
    Seat[] seats;

    @Override
    public String toString() {
        return "Bus{" +
                "fromDate='" + fromDate + '\'' +
                ", toDate='" + toDate + '\'' +
                ", type='" + type + '\'' +
                ", serviceNo='" + serviceNo + '\'' +
                ", fromLocation='" + fromLocation + '\'' +
                ", toLocation='" + toLocation + '\'' +
                ", seats=" + Arrays.toString(seats) +
                '}';
    }

    Bus(String fromDate, String toDate, String type, String serviceNo, String fromLocation, String toLocation){
        this.fromDate=fromDate;
        this.toDate=toDate;
        this.type=type;
        this.serviceNo=serviceNo;
        this.fromLocation=fromLocation;
        this.toLocation=toLocation;
        this.seats = initializeSeats();
    }

    public Seat[] initializeSeats(){
        Seat[] seats = new Seat[10];
        for (int i=0;i< seats.length;i++){
            seats[i]=new Seat(String.valueOf(i+1));
        }return seats;
    }
}
