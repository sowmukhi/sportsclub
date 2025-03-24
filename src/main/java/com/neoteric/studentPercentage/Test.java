package com.neoteric.studentPercentage;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.name="Sowmukhi";
        student.age=22;
        student.id=1;
        student.gender="female";

        Subject[] sub = new Subject[6];
        Subject sub1 = new Subject();

        Subject sub2 = new Subject();
        Subject sub3 = new Subject();
        Subject sub4 = new Subject();
        Subject sub5 = new Subject();
        Subject sub6 = new Subject();
        sub1.marksObtained=60;
        sub2.marksObtained=70;
        sub3.marksObtained=50;
        sub4.marksObtained=80;
        sub5.marksObtained=70;
        sub6.marksObtained=90;

        sub1.totalMarks=100;
        sub2.totalMarks=100;
        sub3.totalMarks=100;
        sub4.totalMarks=100;
        sub5.totalMarks=100;
        sub6.totalMarks=100;

        student.subjects = sub;

        sub[0]=sub1;
        sub[1]=sub2;
        sub[2]=sub3;
        sub[3]=sub4;
        sub[4]=sub5;
        sub[5]=sub6;

        Service service = new Service();
        float percentage = service.calculatePercentage(student);
        System.out.println(percentage);

    }

}
