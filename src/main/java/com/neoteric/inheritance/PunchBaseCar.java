package com.neoteric.inheritance;

import java.util.List;

public abstract class PunchBaseCar {

    public PunchBaseCar(){
        System.out.println("from punch base car");
    }
    protected Car getCar(){
        Engine engine=getEngine();
        Car car = new Car();
        car.setEngine(engine);
        car.setWheelList(getWheel());
        car.setLightList(getLight());
        return car;
    }
    public Engine getEngine(){//concrete method
        System.out.println("from getEngine");
        return new Engine(3);
    }
    public abstract List<Wheel> getWheel();

    public abstract List<Light> getLight();
}
