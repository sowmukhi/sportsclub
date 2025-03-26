package com.neoteric.doctorAppointment;

public class DocBySpec {
    DbService dbService=new DbService();
    public void getDoctorsBySpecialization(String specialization) {
        boolean found = false;
        System.out.println("Doctors available in " + specialization + " specialization:");
        for (Doctor doctor : dbService.doctorMap.values()) {
            if (doctor.getSpecialisation().equalsIgnoreCase(specialization)) {
                System.out.println("Doctor Name: " + doctor.getDocName() + ", Available Time: " + doctor.getAvailableTime());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No doctors available for this specialization.");
        }
    }
}
