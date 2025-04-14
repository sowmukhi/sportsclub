package com.neoteric.billPlan;

public abstract class Plan {
    public double rate;

    public abstract void getRate();
    public void calculateBill(int units){
        getRate();
        System.out.println("bill calculated");
    }
}
