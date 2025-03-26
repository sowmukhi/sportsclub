package com.neoteric.doctorAppointment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DbService {
    public Map<String,Doctor> doctorMap = new HashMap<>();
    public Map<String,Patient> patientMap = new HashMap<>();
    public List<Appointment> appointmentList = new ArrayList<>();

    public DbService() {
        populateDoctorData();
        populatePatientData();
    }

    public void populateDoctorData(){
        Doctor d1 =new Doctor("Ram","Cardiology","9AM-6PM");
        Doctor d2 =new Doctor("Krishna","Dermatology","9AM-6PM");
        Doctor d3 =new Doctor("Lavanya","Gastroenterology","6PM-9PM");
        Doctor d4 =new Doctor("Lakshmi","Oncology","6PM-9PM");
        Doctor d5 =new Doctor("kiran","Cardiology","6PM-10PM");
        doctorMap.put("Ram",d1);
        doctorMap.put("Krishna",d2);
        doctorMap.put("Lavanya",d3);
        doctorMap.put("Lakshmi",d4);
        doctorMap.put("kiran",d5);
    }
    public void populatePatientData(){
        Patient p1=new Patient("p1","20","M");
        Patient p2=new Patient("p2","22","F");
        Patient p3=new Patient("p3","28","M");
        Patient p4=new Patient("p4","30","F");
        Patient p5=new Patient("p5","20","F");
        patientMap.put("p1",p1);
        patientMap.put("p2",p2);
        patientMap.put("p3",p3);
        patientMap.put("p4",p4);
        patientMap.put("p5",p5);
    }
}
