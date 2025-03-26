package com.neoteric.doctorAppointment;

public class Patient {
    private String patientName;
    private String age;
    private String gender;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Patient(String patientName, String age, String gender) {
        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
    }
}
