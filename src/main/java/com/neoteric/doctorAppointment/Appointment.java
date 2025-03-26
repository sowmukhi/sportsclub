package com.neoteric.doctorAppointment;

public class Appointment {
    private Doctor doctor;
    private Patient patient;
    private Duration duration;
    private String appDate;
    private Amount amount;

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public void setAppDate(String appDate) {
        this.appDate = appDate;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public Appointment(Doctor doctor, Amount amount, String appDate, Duration duration, Patient patient) {
        this.doctor = doctor;
        this.amount = amount;
        this.appDate = appDate;
        this.duration = duration;
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public Duration getDuration() {
        return duration;
    }

    public String getAppDate() {
        return appDate;
    }

    public Amount getAmount() {
        return amount;
    }
}
