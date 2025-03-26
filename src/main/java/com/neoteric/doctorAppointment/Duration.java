package com.neoteric.doctorAppointment;

public class Duration {
    private String startTime;
    private String endTime;

    public Duration(String startTime, String endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }
}
