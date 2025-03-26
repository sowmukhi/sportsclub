package com.neoteric.schoolFee;

public class SchoolFeePayment {
    public static void main(String[] args) {
        DbService dbService=new DbService();
        Student student=new Student(1234);
        if (!dbService.isStudentPresent(student.getRollNum())) {
            System.out.println("Student not found. Payment aborted.");
            return;
        }
        double amountToPay = 5000.0;
        Payment paymentMethod = new CreditCard(amountToPay);
        paymentMethod.pay();

    }
}
