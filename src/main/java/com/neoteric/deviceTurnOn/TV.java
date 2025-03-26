package com.neoteric.deviceTurnOn;

public class TV extends Device{
    @Override
    protected int getPowerConsumption() {
        System.out.println("power consumption is: "+80);
        return 80;
    }

    @Override
    protected void turnOn() {
        System.out.println("TV is now on");
    }
}
