package com.neoteric.daCalculation;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DbService {
    Map<String,Employee> employeeMap=new HashMap<>();

//    public DbService(){
//        populateEmpData();
//    }
    public Employee createEmployee(Employee employee){
        String empId="NEO"+ UUID.randomUUID().toString();
        employee.setEmp_id(empId);
        employeeMap.put(empId,employee);
        Employee employee1 =new Employee(empId);
        return employee1;
    }

//    public void populateEmpData(){
//        Date date1=new Date();
//        Employee emp1=new Employee("Lakshmi","1","50000",date1);
//        employeeMap.put("1",emp1);
//        Date date2=new Date();
//        Employee emp2=new Employee("Lavanya","2","40000",date2);
//        employeeMap.put("2",emp2);
//    }
}
