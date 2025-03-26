package com.neoteric.inheritance;

import java.util.List;

public class Car {
    private Engine engine;
    private List<Wheel> wheelList;
    private List<Light> lightList;

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", wheelList=" + wheelList +
                ", lightList=" + lightList +
                '}';
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setWheelList(List<Wheel> wheelList) {
        this.wheelList = wheelList;
    }

    public void setLightList(List<Light> lightList) {
        this.lightList = lightList;
    }

    public Engine getEngine() {
        return engine;
    }

    public List<Wheel> getWheelList() {
        return wheelList;
    }

    public List<Light> getLightList() {
        return lightList;
    }

    public Car(Engine engine, List<Wheel> wheelList) {
        this.engine = engine;
        this.wheelList = wheelList;
    }
    public Car(){

    }

}
