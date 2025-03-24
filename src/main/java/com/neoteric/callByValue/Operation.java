package com.neoteric.callByValue;

public class Operation {
    public static void main(String[] args) {
        Amount amt1 = new Amount();
        amt1.amt=1;
        Amount amt2=amt1;
        Amount amt3=amt2;
        Amount amt5 = new Amount();
        amt3.amt=2;
        amt5=amt3;
        System.out.println(amt1.amt);
        System.out.println(amt3.amt);
        System.out.println(amt5.amt);

    }
}
