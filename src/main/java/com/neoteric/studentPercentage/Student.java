package com.neoteric.studentPercentage;

public class Student {
    String name;
    int id;
    int age;
    String gender;
    Subject[] subjects;
    double percentage;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public double getPercentage() {
        return percentage;
    }
}
