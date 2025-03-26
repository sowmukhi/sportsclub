package com.neoteric.deviceTurnOn;

public class Fan extends Device{
    @Override
    protected int getPowerConsumption() {
        System.out.println("power consumption is: "+70);
        return 70;
    }

    @Override
    protected void turnOn() {
        System.out.println("Fan is now on");
    }
}
