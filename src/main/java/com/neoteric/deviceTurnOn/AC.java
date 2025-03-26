package com.neoteric.deviceTurnOn;

public class AC extends Device{
    @Override
    protected int getPowerConsumption() {
        System.out.println("power consumption is: "+150);
        return 150;
    }

    @Override
    protected void turnOn() {
        System.out.println("AC turned on");
    }
}
