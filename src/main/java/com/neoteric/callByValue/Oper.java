package com.neoteric.callByValue;

public class Oper {
    int data=50;

    void change(Oper op){
        op.data=op.data+100;//changes will be in the instance variable
    }


    public static void main(String args[]){
        Oper op=new Oper();

        System.out.println("before change "+op.data);
        op.change(op);//passing object
        System.out.println("after change "+op.data);

    }
}
