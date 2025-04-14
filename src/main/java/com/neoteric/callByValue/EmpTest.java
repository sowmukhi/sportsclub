package com.neoteric.callByValue;

public class EmpTest {
    public static void main(String[] args) {
        Employee emp1=new Employee("lakshmi","1234");
        Employee emp2=emp1;
        emp1=null;
        System.out.println(emp2);
    }
}
