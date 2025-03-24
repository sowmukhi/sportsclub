package com.neoteric.busBooking;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TravelDbService travelDbService=new TravelDbService();
        List<Bus> buses =travelDbService.getAllBuses();
        for (Bus b : buses) {
            System.out.println("Service No: " + b.serviceNo +
                    ", From: " + b.fromLocation +
                    ", To: " + b.toLocation +
                    ", Type: " + b.type);
        }
    }
}
