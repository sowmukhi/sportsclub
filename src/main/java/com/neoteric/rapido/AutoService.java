package com.neoteric.rapido;

public class AutoService extends RapidoService{
    private String driverName;
    private String autoNum;

    public AutoService(String customerName, String pickUp, String drop, String driverName, String autoNum) {
        super(customerName, pickUp, drop);
        this.driverName = driverName;
        this.autoNum = autoNum;
    }

    @Override
    public void bookRide() {
        System.out.println("Auto ride booked for " + customerName);
        System.out.println("Pickup: " + pickUp + ", Drop: " + drop);
        System.out.println("Driver: "+driverName+" Auto number: "+autoNum);
    }

    @Override
    public double calculateFare() {
        return 70.0;
    }
}
