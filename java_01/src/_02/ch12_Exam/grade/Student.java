package _02.ch12_Exam.grade;

import java.util.ArrayList;

public class Student {
    private int studentId;
    private String studentName;

    ArrayList<Subject> subjectList = new ArrayList<Subject>();

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void addSubject(String name, int score){
        Subject subject = new Subject();
        subject.setName(name);
        subject.setScore(score);

        subjectList.add(subject);
    }

    public void showStudentInfo(){
        int total = 0;
        for (int i = 0; i < subjectList.size(); i++) {
            total += subjectList.get(i).getScore();
            System.out.println(studentName + " 은 " + subjectList.get(i).getName() + " 과목 " + subjectList.get(i).getScore() + " 점수 " );
        }
        System.out.println("총점은" + total);
    }
}
