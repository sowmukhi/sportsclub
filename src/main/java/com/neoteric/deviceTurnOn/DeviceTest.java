package com.neoteric.deviceTurnOn;

public class DeviceTest {
    public static void main(String[] args) {
        Device fan = new Fan();
        fan.plugIn();
        fan.getPowerConsumption();
        fan.turnOn();

        Device tv = new TV();
        tv.plugIn();
        tv.getPowerConsumption();
        tv.turnOn();

        Device ac = new AC();
        ac.plugIn();
        ac.getPowerConsumption();
        ac.turnOn();
    }
}
