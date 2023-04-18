package _02.ch02;

public class StudentTest {
    public static void main(String[] args) {
        Student studentUm = new Student();
        studentUm.studentName = "준식";
        studentUm.studentAddress = "동탄";

        Student studentGal = new Student(1,"광주");
        studentGal.studentName = "지성    ";

        studentUm.showStudentInfo();
        studentGal.showStudentInfo();

        System.out.println(studentUm);
        System.out.println(studentGal);
    }

}
