package com.neoteric.rapido;

public class CabService extends RapidoService{
    private String driverName;
    private String cabNum;

    public CabService(String customerName, String pickUp, String drop, String driverName, String cabNum) {
        super(customerName, pickUp, drop);
        this.driverName = driverName;
        this.cabNum = cabNum;
    }

    @Override
    public void bookRide() {
        System.out.println("Cab ride booked for " + customerName);
        System.out.println("Pickup: " + pickUp + ", Drop: " + drop);
        System.out.println("Driver: "+driverName+" Cab number: "+cabNum);
    }

    @Override
    public double calculateFare() {
        return 150.0;
    }
}
