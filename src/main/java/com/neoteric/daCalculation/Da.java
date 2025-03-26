package com.neoteric.daCalculation;

public class Da {
    private double daPercentage;
    private String fromYear;

    public double getDaPercentage() {
        return daPercentage;
    }

    public void setDaPercentage(double daPercentage) {
        this.daPercentage = daPercentage;
    }

    public void setFromYear(String fromYear) {
        this.fromYear = fromYear;
    }

    public String getFromYear() {
        return fromYear;
    }
    public Da(){

    }

    public Da(double daPercentage, String fromYear) {
        this.daPercentage = daPercentage;
        this.fromYear = fromYear;
    }
//    private String toYear;
//    private Employee[] emplist;
}
