package com.neoteric.rapido;

public class RapidoServiceApp {
    public static void main(String[] args) {
        RapidoService bike = new BikeService("lakshmi","kphb","HighTech city","Srinu","1234");
        bike.bookRide();
        System.out.println("Fare: ₹"+bike.calculateFare());
        RapidoService auto = new AutoService("lavanya","kphb phase 5","kphb phase 15","venkat","12354");
        auto.bookRide();
        System.out.println("Fare: ₹"+auto.calculateFare());
        RapidoService cab = new CabService("srinivas","Miyapur","Amirpet","Yaswanth","09876");
        cab.bookRide();
        System.out.println("Fare: ₹"+cab.calculateFare());

    }
}
