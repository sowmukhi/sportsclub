package com.neoteric.aadhaar;

public class Finger{
    private String f1;
    private String f2;
    private String f3;
    private String f4;
    private String f5;

    public String getF1() {
        return f1;
    }

    public String getF2() {
        return f2;
    }

    public String getF3() {
        return f3;
    }

    public String getF4() {
        return f4;
    }

    public String getF5() {
        return f5;
    }

    public Finger(String f1, String f2, String f3, String f4, String f5) {
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;
        this.f4 = f4;
        this.f5 = f5;
    }
}
