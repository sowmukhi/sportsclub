package com.neoteric.busBooking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TravelDbService {
    Map<String, Bus> busData = new HashMap<>(); // instance variable

    public TravelDbService(){ //constructor
        populateBusData();  //instance method
    }
    public void populateBusData(){
        Bus bus = new Bus();
        bus.serviceNo="1234";
        bus.fromDate="21-03-2025";
        bus.toDate="22-03-2025";
        bus.fromLocation="hyd";
        bus.toLocation="vskp";
        busData.put("hyd-vskp",bus);

        Bus bus1=new Bus();
        bus1.serviceNo="2345";
        bus1.fromDate="21-03-2025";
        bus1.toDate="22-03-2025";
        bus1.fromLocation="hyd";
        bus1.toLocation="vzg";
        busData.put("hyd-vzg",bus1);

        Bus bus2=new Bus();
        bus2.serviceNo="3456";
        bus2.fromDate="21-03-2025";
        bus2.toDate="22-03-2025";
        bus2.fromLocation="hyd";
        bus2.toLocation="chennai";
        bus2.type="Super Deluxe";
        busData.put("hyd-chennai",bus2);

    }
    public List<Bus> getAllBuses() {
        return new ArrayList<>(busData.values());
    }
}