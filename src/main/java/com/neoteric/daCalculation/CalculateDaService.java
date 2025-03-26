package com.neoteric.daCalculation;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CalculateDaService {
    public double calculateDa(Employee employee, Da da, Date daChangeDate, double newDaPercentage) {
        Date joiningDate = employee.getJoining_date();
        Date currentDate = new Date();

        // Calculate months before DA change
        long diffBeforeChange = Math.abs(daChangeDate.getTime() - joiningDate.getTime());
        long monthsBeforeChange = TimeUnit.DAYS.convert(diffBeforeChange, TimeUnit.MILLISECONDS) / 30;
        double daAmountBeforeChange = employee.getSalary() * (da.getDaPercentage() / 100) * monthsBeforeChange;

        // Calculate months after DA change
        long diffAfterChange = Math.abs(currentDate.getTime() - daChangeDate.getTime());
        long monthsAfterChange = TimeUnit.DAYS.convert(diffAfterChange, TimeUnit.MILLISECONDS) / 30;
        double daAmountAfterChange = employee.getSalary() * (newDaPercentage / 100) * monthsAfterChange;

        // Total DA amount
        double totalDaAmount = daAmountBeforeChange + daAmountAfterChange;

        return totalDaAmount;
    }

    public void calculateDaIfEmployeePresent(DbService dbService, String empId, Da da, Date daChangeDate, double newDaPercentage) {
        Employee employee = dbService.employeeMap.get(empId);
        if (employee != null) {
            double daAmount = calculateDa(employee, da, daChangeDate, newDaPercentage);
            System.out.println("Total DA Amount for employee " + empId + ": " + daAmount);
        } else {
            System.out.println("Employee not present");
        }
    }
}