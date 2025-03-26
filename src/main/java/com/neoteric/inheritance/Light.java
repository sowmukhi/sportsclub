package com.neoteric.inheritance;

public class Light {
    private String type;
    private String position;

    @Override
    public String toString() {
        return "Light{" +
                "type='" + type + '\'' +
                ", position='" + position + '\'' +
                '}';
    }

    public Light(String type, String position) {
        this.type = type;
        this.position = position;
    }

    public String getType() {
        return type;
    }

    public String getPosition() {
        return position;
    }
}
