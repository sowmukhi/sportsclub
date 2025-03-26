package com.neoteric.inheritance;

public class Test {
    public static void main(String[] args) {
        PunchBaseCar base = new PunchBasicModel();
        Car basicCar=base.getCar();
        System.out.println("Basic Car: " + basicCar);
        PunchBaseCar medium = new PunchMediumModel();
        Car mediumCar = medium.getCar();
        System.out.println("Medium Car: " + mediumCar);
    }
}
