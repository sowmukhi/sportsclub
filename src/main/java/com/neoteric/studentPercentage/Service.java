package com.neoteric.studentPercentage;

public class Service {
    public float calculatePercentage(Student student){
        Subject[] subjectList = student.getSubjects();

        int totalMarks = 0, obtainedMarks = 0;

//       for (Subject subject : subjectList){
//
//            if (subject != null){
//                obtainedMarks += subject.marksObtained;
//                totalMarks += subject.totalMarks;
//            }


//
//        }
        for(int i=0; i<subjectList.length; i++){
            if (subjectList[i] != null){
                obtainedMarks += subjectList[i].marksObtained;
                totalMarks += subjectList[i].totalMarks;
            }
        }

        if (totalMarks == 0) return 0;

        return ((float) obtainedMarks / totalMarks) * 100;


    }
}
