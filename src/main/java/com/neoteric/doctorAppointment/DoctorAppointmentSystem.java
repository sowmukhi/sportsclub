//package com.neoteric.doctorAppointment;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class DoctorAppointmentSystem {
//    public List<Doctor> doctors = new ArrayList<>();
//    public List<Patient> patients = new ArrayList<>();
//    public List<Appointment> appointments = new ArrayList<>();
//
//    public DoctorAppointmentSystem() {
//        populateDoctors();
//        populatePatients();
//    }
//
//    private void populateDoctors() {
//        doctors.add(new Doctor("Ram", "Cardiology", "9AM-6PM"));
//        doctors.add(new Doctor("Krishna", "Dermatology", "9AM-6PM"));
//        doctors.add(new Doctor("Lavanya", "Gastroenterology", "6PM-9PM"));
//        doctors.add(new Doctor("Lakshmi", "Oncology", "6PM-9PM"));
//    }
//
//    private void populatePatients() {
//        patients.add(new Patient("p1", "20", "M"));
//        patients.add(new Patient("p2", "22", "F"));
//        patients.add(new Patient("p3", "28", "M"));
//        patients.add(new Patient("p4", "30", "F"));
//        patients.add(new Patient("p5", "20", "F"));
//    }
//
//    public void bookAppointment(int doctorIndex, int patientIndex, String date, String startTime, String endTime) {
//        if (doctorIndex < 0 || doctorIndex >= doctors.size() || patientIndex < 0 || patientIndex >= patients.size()) {
//            System.out.println("Invalid doctor or patient selection.");
//            return;
//        }
//
//        Doctor selectedDoctor = doctors.get(doctorIndex);
//        Patient selectedPatient = patients.get(patientIndex);
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
//        for (int i = 0; i < doctors.size(); i++) {
//            System.out.println((i + 1) + ". " + doctors.get(i).getDocName() + " - " + doctors.get(i).getSpecialisation() + " (" + doctors.get(i).getAvailableTime() + ")");
//        }
//    }
//
//}
