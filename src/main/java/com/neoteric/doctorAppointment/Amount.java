package com.neoteric.doctorAppointment;

public class Amount {
    private String currency;
    private double amt;

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setAmt(double amt) {
        this.amt = amt;
    }

    public Amount(String currency, double amt) {
        this.currency = currency;
        this.amt = amt;
    }

    public String getCurrency() {
        return currency;
    }

    public double getAmt() {
        return amt;
    }
}
