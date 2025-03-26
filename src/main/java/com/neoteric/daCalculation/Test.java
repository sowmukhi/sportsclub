package com.neoteric.daCalculation;

import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        // Creating the joining date using Calendar (easier to read)
        Calendar calendar = Calendar.getInstance();
        calendar.set(2020, Calendar.SEPTEMBER, 1); // Year, Month (0-based), Day
        Date joiningDate = calendar.getTime();

        // Creating the DA change date
        calendar.set(2022, Calendar.MAY, 1);
        Date daChangeDate = calendar.getTime();

        // Creating an Employee object
        Employee emp = new Employee("John Doe", "NEO001", 50000, joiningDate);

        // Creating a DA object
        Da da = new Da();
        da.setDaPercentage(2.0);

        // New DA percentage after change
        double newDaPercentage = 3.0;

        // Creating an instance of CalculateDaService
        CalculateDaService service = new CalculateDaService();
        double daAmount = service.calculateDa(emp, da, daChangeDate, newDaPercentage);

        // Printing the calculated DA amount
        System.out.println("Total DA Amount: " + daAmount);
    }
}
