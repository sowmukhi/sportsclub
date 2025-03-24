package com.neoteric.callByValue;

public class Operation2 {
    int data = 50;

    void change(Operation2 op) {
        op.data = op.data + 100; // Changes the instance variable
    }

    public static void main(String args[]) {
        Operation2 op = new Operation2();

        int originalValue = op.data; // Store original value

        System.out.println("Before change: " + op.data);
        op.change(op); // Passing object
        System.out.println("After change: " + op.data);
        System.out.println("original value: " + originalValue);
    }
}
