package com.neoteric.doctorAppointment;

public class Test1 {
    public static void main(String[] args) {
        DbService dbService = new DbService();
        DocBySpec docBySpec = new DocBySpec();
        BookAppointment bookAppointment=new BookAppointment();

        // Example: calling with a specialization (without Scanner)
        docBySpec.getDoctorsBySpecialization("Cardiology");

        bookAppointment.appointment("Ram", "p1", "2025-03-26", "10:00 AM", "10:30 AM", "USD", 100.0);
        bookAppointment.appointment("Ram", "p2", "2025-03-26", "10:15 AM", "10:45 AM", "USD", 120.0); // Overlaps, should be rejected
        bookAppointment.appointment("Ram", "p3", "2025-03-26", "11:00 AM", "11:30 AM", "USD", 150.0); // Should be successful
        bookAppointment.appointment("Kiran", "p4", "2025-03-27", "7:00 PM", "7:30 PM", "INR", 500.0);

        bookAppointment.getAppointments();
    }
}
