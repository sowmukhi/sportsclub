package com.neoteric.inheritance;

import java.util.ArrayList;
import java.util.List;

public class PunchMediumModel extends PunchBaseCar{

    @Override
    public List<Wheel> getWheel() {
        List<Wheel> wheelList= new ArrayList<>();
        Wheel wheel1=new Wheel("alloy","frontLeft");
        Wheel wheel2=new Wheel("alloy","frontRight");
        Wheel wheel3=new Wheel("alloy","backLeft");
        Wheel wheel4=new Wheel("alloy","backRight");
        wheelList.add(wheel1);
        wheelList.add(wheel2);
        wheelList.add(wheel3);
        wheelList.add(wheel4);
        return wheelList;
}
    @Override
    public List<Light> getLight() {
        List<Light> lightList= new ArrayList<>();
        Light light1=new Light("LED","frontLeft");
        Light light2=new Light("LED","frontRight");
        Light light3=new Light("LED","backLeft");
        Light light4=new Light("LED","backRight");
        lightList.add(light1);
        lightList.add(light2);
        lightList.add(light3);
        lightList.add(light4);
        return lightList;
    }
}
