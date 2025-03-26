package com.neoteric.inheritance;

public class Wheel {
    private String type;
    private String position;

    @Override
    public String toString() {
        return "Wheel{" +
                "type='" + type + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public String getPosition() {
        return position;
    }

    public Wheel(String type, String position) {
        this.type = type;
        this.position = position;
    }
}
