package com.neoteric.rapido;

public abstract class RapidoService {
    protected String customerName;
    protected String pickUp;
    protected String drop;

    public RapidoService(String customerName, String pickUp, String drop) {
        this.customerName = customerName;
        this.pickUp = pickUp;
        this.drop = drop;
    }
    public abstract void bookRide();
    public abstract double calculateFare();
}
