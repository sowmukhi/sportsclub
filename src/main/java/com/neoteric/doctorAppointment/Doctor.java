package com.neoteric.doctorAppointment;

public class Doctor {
    private String docName;
    private String specialisation;
    private String availableTime;

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public void setAvailableTime(String availableTime) {
        this.availableTime = availableTime;
    }

    public Doctor(String docName, String specialisation, String availableTime) {
        this.docName = docName;
        this.specialisation = specialisation;
        this.availableTime = availableTime;
    }

    public String getDocName() {
        return docName;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public String getAvailableTime() {
        return availableTime;
    }
}
