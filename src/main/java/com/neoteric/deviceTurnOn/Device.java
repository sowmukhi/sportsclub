package com.neoteric.deviceTurnOn;

public abstract class Device {

    protected void plugIn(){
        System.out.println("Device is plugged in to power source");
    }

    protected abstract int getPowerConsumption();

    protected abstract void turnOn();
}
