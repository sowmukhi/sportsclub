//package com.neoteric.doctorAppointment;
//
//import com.neoteric.AtmService.DbService;
//
//public class Service {
//    DoctorAppointmentSystem doctorAppointmentSystem=new DoctorAppointmentSystem();
//    public void bookAppointment(int doctorIndex, int patientIndex, String date, String startTime, String endTime) {
//        if (doctorIndex < 0 || doctorIndex >= doctor.size() || patientIndex < 0 || patientIndex >= patientMap.size()) {
//            System.out.println("Invalid doctor or patient selection.");
//            return;
//        }
//
//        Doctor selectedDoctor = doctorMap.get(doctorIndex);
//        Patient selectedPatient = patientMap.get(patientIndex);
//        Duration duration = new Duration(startTime, endTime);
//        Amount amount = new Amount("USD", 100.0);
//        Appointment appointment = new Appointment(selectedDoctor, amount, date, duration, selectedPatient);
//        appointments.add(appointment);
//
//        System.out.println("Appointment booked successfully!");
//        System.out.println("Doctor: " + selectedDoctor.getDocName());
//        System.out.println("Patient: " + selectedPatient.getPatientName());
//        System.out.println("Date: " + date);
//        System.out.println("Time: " + startTime + " - " + endTime);
//        System.out.println("Amount: " + amount.getAmt() + " " + amount.getCurrency());
//    }
//
//    public void listAvailableDoctors() {
//        System.out.println("Available Doctors:");
//        for (int i = 0; i < doctorMap.size(); i++) {
//            System.out.println((i + 1) + ". " + doctorMap.get(i).getDocName() + " - " + doctorMap.get(i).getSpecialisation() + " (" + doctorMap.get(i).getAvailableTime() + ")");
//        }
//    }
//}
