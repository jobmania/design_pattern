package _02.ch12_Exam.grade;

public class StudentSubjectTest {

    public static void main(String[] args) {
        Student student = new Student(1001, "엄");
        student.addSubject("국어", 100);
        student.addSubject("수학", 40);

        Student studen2 = new Student(1002, "갈");
        studen2.addSubject("영어", 100);
        studen2.addSubject("국어", 40);
        studen2.addSubject("수학", 100);

        student.showStudentInfo();

        System.out.println("=======");

        studen2.showStudentInfo();
    }
}
