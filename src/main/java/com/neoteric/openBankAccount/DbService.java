package com.neoteric.openBankAccount;

import java.util.HashMap;
import java.util.Map;

public class DbService {
    Map<String,Nominee> nomineeMap=new HashMap<>();
    public DbService(){
        populateNomineeData();
    }
    public void populateNomineeData(){
        Nominee n1=new Nominee("n1","1");
        Nominee n2=new Nominee("n2","2");
        Nominee n3=new Nominee("n3","3");
        Nominee n4=new Nominee("n4","4");
        Nominee n5=new Nominee("n5","5");
        nomineeMap.put("1",n1);
        nomineeMap.put("2",n2);
        nomineeMap.put("3",n3);
        nomineeMap.put("4",n4);
        nomineeMap.put("5",n5);
    }
}
