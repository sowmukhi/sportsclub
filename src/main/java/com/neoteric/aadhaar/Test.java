//package com.neoteric.aadhaar;
//
//public class Test {
//    public static void main(String[] args) {
//        Finger leftHandFingers=new Finger("a","s","d","f","g");
//        Finger rightHandFingers=new Finger("s","d","f","g","h");
//        Hand fingers=new Hand(leftHandFingers,rightHandFingers);
//        Eye eyes=new Eye("asdf","lkjh");
//        Address address=new Address("sdf","asdf","asdf");
//        Person person=new Person("lakshmi","28-08-2002","987654321",fingers,eyes,address);
//        Service service=new Service();
//        service.createAadhaarCard(person,"12345");
//        String otp =Service.generateOtp();
//        service.createAadhaarCard(person,otp);
//
//        Service aadhaarService=new Service();
//        String mobileNumber="987654321";
//        Otp otp1=Service.generateOtp(mobileNumber);
//        System.out.println("generated otp:"+otp1.getOtp());
//        Person person=new Person("lakshmi","28-08-2002","987654321",fingers,eyes,address);
//        Aadhaar aadhaar=aadhaarService.createAadhaarCard(person,otp1.getOtp());
//
//    }
//}
