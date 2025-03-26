package com.neoteric.inheritance;

import java.util.ArrayList;
import java.util.List;

public class PunchBasicModel extends PunchBaseCar {


    @Override
    public List<Wheel> getWheel() {
        List<Wheel> wheelList= new ArrayList<>();
        Wheel wheel1=new Wheel("normal","frontLeft");
        Wheel wheel2=new Wheel("normal","frontRight");
        Wheel wheel3=new Wheel("normal","backLeft");
        Wheel wheel4=new Wheel("normal","backRight");
        wheelList.add(wheel1);
        wheelList.add(wheel2);
        wheelList.add(wheel3);
        wheelList.add(wheel4);
        return wheelList;
    }

    @Override
    public List<Light> getLight() {
        List<Light> lightList= new ArrayList<>();
        Light light1=new Light("normal","frontLeft");
        Light light2=new Light("normal","frontRight");
        Light light3=new Light("normal","backLeft");
        Light light4=new Light("normal","backRight");
        lightList.add(light1);
        lightList.add(light2);
        lightList.add(light3);
        lightList.add(light4);
        return lightList;
    }
}
