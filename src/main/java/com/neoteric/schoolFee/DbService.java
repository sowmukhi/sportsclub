package com.neoteric.schoolFee;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class DbService {
    Map<Integer, String> studentMap = new HashMap<>();
    public DbService() {
        generateStudents();
    }

    // Generate 5 random students and store in HashMap
    private void generateStudents() {
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int roll = 1000 + random.nextInt(9000); // Roll number between 1000-9999
            studentMap.put(roll, "Student" + (i + 1));
        }
        String put = studentMap.put(1234, "Student" + 6);
    }
    public boolean isStudentPresent(int rollNumber) {
        return studentMap.containsKey(rollNumber);
    }
}
