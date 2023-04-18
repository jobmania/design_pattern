package _02.ch03;

public class StudentTest {



    public static void main(String[] args) {
        Student lee = new Student(100, "Lee");
        Student kim = new Student(101, "Kim");

        lee.setMathSubject("수학",95);
        lee.setKoreanSubject("국어",100);

        kim.setMathSubject("수학",99);
        kim.setKoreanSubject("국어",80);

        lee.showStudentScore();
        kim.showStudentScore();

        System.out.println(lee.getStudentId());


        lee.setStudentName("미자");
        lee.showStudentScore();
    }

}
