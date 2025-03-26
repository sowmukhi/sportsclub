package com.neoteric.openBankAccount;

public class Nominee {
    private String nominee_name;
    private String accNum;

    public String getNominee_name() {
        return nominee_name;
    }

    public String getAccNum() {
        return accNum;
    }

    public Nominee(String nominee_name, String accNum) {
        this.nominee_name = nominee_name;
        this.accNum = accNum;
    }
}
