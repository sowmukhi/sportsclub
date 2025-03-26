package com.neoteric.typesOfAccounts;

public class Nominee {
    protected String nomineeName;
    protected String nomineeAccNo;

    public String getNomineeName() {
        return nomineeName;
    }

    public void setNomineeName(String nomineeName) {
        this.nomineeName = nomineeName;
    }

    public String getNomineeAccNo() {
        return nomineeAccNo;
    }

    public void setNomineeAccNo(String nomineeAccNo) {
        this.nomineeAccNo = nomineeAccNo;
    }

    public Nominee(String nomineeName, String nomineeAccNo) {
        this.nomineeName = nomineeName;
        this.nomineeAccNo = nomineeAccNo;
    }
}
