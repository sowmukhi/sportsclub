package com.neoteric.doctorAppointment;

public class BookAppointment {

    DbService dbService=new DbService();
    public void appointment(String doctorName, String patientName, String date, String startTime, String endTime, String currency, double amt) {
        Doctor doctor = dbService.doctorMap.get(doctorName);
        Patient patient = dbService.patientMap.get(patientName);

        if (doctor == null) {
            System.out.println("Doctor not found.");
            return;
        }
        if (patient == null) {
            System.out.println("Patient not found.");
            return;
        }
        // Check slot availability
        if (!isSlotAvailable(doctor, date, startTime, endTime)) {
            System.out.println(" Slot not available for " + doctorName + " on " + date + " from " + startTime + " to " + endTime);
            return;
        }

        Duration duration = new Duration(startTime, endTime);
        Amount amount = new Amount(currency, amt);
        Appointment appointment = new Appointment(doctor, amount, date, duration, patient);
        dbService.appointmentList.add(appointment);

        System.out.println("Appointment booked successfully!");
    }
    private boolean isSlotAvailable(Doctor doctor, String date, String startTime, String endTime) {
        for (Appointment appt : dbService.appointmentList) {
            if (appt.getDoctor().equals(doctor) && appt.getAppDate().equals(date)) {
                // Check if the new appointment overlaps with an existing one
                if (isTimeOverlap(appt.getDuration().getStartTime(), appt.getDuration().getEndTime(), startTime, endTime)) {
                    return false;  // Slot is already booked
                }
            }
        }
        return true; // Slot is available
    }
    private boolean isTimeOverlap(String existingStart, String existingEnd, String newStart, String newEnd) {
        return (newStart.compareTo(existingEnd) < 0 && newEnd.compareTo(existingStart) > 0);
    }
    public void getAppointments() {
        if (dbService.appointmentList.isEmpty()) {
            System.out.println("No appointments booked.");
            return;
        }

        System.out.println("Booked Appointments:");
        for (Appointment appt : dbService.appointmentList) {
            System.out.println("Patient: " + appt.getPatient().getPatientName() +
                    ", Doctor: " + appt.getDoctor().getDocName() +
                    ", Specialization: " + appt.getDoctor().getSpecialisation() +
                    ", Date: " + appt.getAppDate() +
                    ", Time: " + appt.getDuration().getStartTime() + " to " + appt.getDuration().getEndTime() +
                    ", Amount: " + appt.getAmount().getAmt() + " " + appt.getAmount().getCurrency());
        }
    }
}