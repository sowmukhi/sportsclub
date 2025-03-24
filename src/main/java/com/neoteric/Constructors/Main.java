package com.neoteric.Constructors;

public class Main {
    public static void main(String[] args) {

        Bus bus1=new Bus("22-03-2025","23-03-2025","Super Deluxe","1234","hyd","vskp");
        Bus bus2=new Bus("22-03-2025","23-03-2025","Luxury","2345","hyd","vzg");
        Bus bus3=new Bus("22-03-2025","23-03-2025","Sleeper","3456","hyd","chennai");

        Seat s1 = new Seat("1");
        Seat s2 = new Seat("2");
        Seat s3 = new Seat("3");
        Seat s4 = new Seat("4");
        Seat s5 = new Seat("5");
        Seat s6 = new Seat("6");
        Seat s7 = new Seat("7");
        Seat s8 = new Seat("8");
        Seat s9 = new Seat("9");
        Seat s10 = new Seat("10");

        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(s1);

    }
}
