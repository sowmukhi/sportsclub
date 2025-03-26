package com.neoteric.typesOfAccounts;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DBService {
    Map<String,Nominee> nomineeMap = new HashMap<>();
    public Map<String, Customer> customerMap = new HashMap<>();

    public DBService(){
        populateNomineeData();
        populateCustomerData();
    }

    public void populateNomineeData(){
        Nominee n1=new Nominee("lakshmi","12345");
        Nominee n2=new Nominee("sowmukhi","67890");
        Nominee n3=new Nominee("lavanya","23456");
        Nominee n4=new Nominee("kalyani","45678");
        Nominee n5=new Nominee("srinivas","87654");
        nomineeMap.put("12345",n1);
        nomineeMap.put("67890",n2);
        nomineeMap.put("23456",n3);
        nomineeMap.put("45678",n4);
        nomineeMap.put("87654",n5);
    }

    public void populateCustomerData(){
        Customer c1=new Customer("cus1","123456789");
        Customer c2=new Customer("cus2","987654321");
        Customer c3=new Customer("cus3","234567890");
        Customer c4=new Customer("cus4","098765412");
        Customer c5=new Customer("cus5","456789012");
        customerMap.put("123456789",c1);
        customerMap.put("987654321",c2);
        customerMap.put("234567890",c3);
        customerMap.put("098765412",c4);
        customerMap.put("456789012",c5);
    }

    public boolean isValidCustomer(String mobileNum) {
        return customerMap.containsKey(mobileNum);
    }

    public boolean isValidNominee(String nomineeAccNo) {
        return nomineeMap.containsKey(nomineeAccNo);
    }

    public Customer getCustomerByMobile(String mobileNum) {
        return customerMap.get(mobileNum);
    }

    public Nominee getNomineeByAccNo(String accNo) {
        return nomineeMap.get(accNo);
    }

}
