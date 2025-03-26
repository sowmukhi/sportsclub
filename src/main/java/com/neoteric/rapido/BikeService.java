package com.neoteric.rapido;

public class BikeService extends RapidoService{
    private String driverName;
    private String bikeNum;

    public BikeService(String customerName, String pickUp, String drop, String driverName, String bikeNum) {
        super(customerName, pickUp, drop);
        this.driverName = driverName;
        this.bikeNum = bikeNum;
    }

    @Override
    public void bookRide() {
        System.out.println("Bike ride booked for "+customerName);
        System.out.println("Pick up: "+pickUp+" Drop: "+drop);
        System.out.println("Driver: "+driverName+" Bike number: "+bikeNum);
    }

    @Override
    public double calculateFare() {
        return 50.0;
    }
}
