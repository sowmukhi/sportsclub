package com.neoteric.EmpHackathon;

import com.neoteric.restuarent.Address;

public class Employee {
    public String emp_name;
    public String emp_id;

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String salary;
    public Address address;

    public Employee(){
        this.emp_name="lakshmi";
        this.emp_id="1";
        this.salary="50000";
        this.address = new Address();
    }
    public Employee(String emp_name,String emp_id){
        this.emp_name=emp_name;
        this.emp_id=emp_id;
        this.salary="Unknown";
        this.address = new Address();
    }
    public Employee(String emp_id,Address address){
        this.emp_name="emp_name";
        this.emp_id=emp_id;
        this.salary="Unknown";
        this.address = new Address();
    }
    public void displayDetails() {
        System.out.println("empname:"+emp_name);
        System.out.println(emp_id);
    }

}
