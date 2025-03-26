package com.neoteric.daCalculation;

import java.util.Date;

public class Employee {
    private String emp_name;
    private String emp_id;
    private double salary;
    private Date joining_date;
    private Da currentDa;

    public Employee(String emp_id) {
        this.emp_id = emp_id;
    }


    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setJoining_date(Date joining_date) {
        this.joining_date = joining_date;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_name='" + emp_name + '\'' +
                ", emp_id='" + emp_id + '\'' +
                ", salary=" + salary +
                ", joining_date=" + joining_date +
                '}';
    }

    public Date getJoining_date() {
        return joining_date;
    }

    public Employee(String emp_name, String emp_id, double salary, Date joining_date) {
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.salary = salary;
        this.joining_date = joining_date;
    }

}
