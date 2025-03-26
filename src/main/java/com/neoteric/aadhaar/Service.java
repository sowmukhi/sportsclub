package com.neoteric.aadhaar;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Service {
    private Map<String,Otp> otpMap=new HashMap<>();
    private Map<String,Aadhaar> aadhaarMap=new HashMap<>();
    public static String generateAadhaarNumber() {
        Random random = new Random();
        StringBuilder aadhaarNum = new StringBuilder();
        for (int i = 0; i < 12; i++) {
            aadhaarNum.append(random.nextInt(10));
        }
        return aadhaarNum.toString();
    }
    public static String generateOtp() {
        Random random = new Random();
        StringBuilder otp = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            otp.append(random.nextInt(10));
        }
        return otp.toString();
    }
    public boolean validateOtp(String aadhaarNumber, String inputOtp) {
        Otp storedOtp = otpMap.get(aadhaarNumber);
        return storedOtp != null && storedOtp.getOtp().equals(inputOtp);
    }
    public Aadhaar createAadhaarCard(Person person,String otp) {
        if (validateOtp(person.getMobileNum(), otp)) {
            String aadhaarNum = generateAadhaarNumber();
            Aadhaar newAadhaar = new Aadhaar(aadhaarNum, person);
            aadhaarMap.put(aadhaarNum, newAadhaar);
            return newAadhaar;
        } else {
            System.out.println("invalid otp");
            return null;
        }
    }
}
