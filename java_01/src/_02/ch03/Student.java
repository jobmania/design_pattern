package _02.ch03;

public class Student {
    private int studentId;
    private String studentName;

    Subject math;
    Subject korean;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        // 새로히 생성.
        korean = new Subject();
        math = new Subject();
    }

    public void setKoreanSubject(String name, int score){
        korean.subjectName = name;
        korean.score = score;
    }

    public void setMathSubject(String name, int score){
        math.subjectName = name;
        math.score = score;
    }


    public void showStudentScore(){
        int total = korean.score + math.score;
        System.out.println( studentName+ " total = " + total);
    }


    public int getStudentId() {
        return studentId;
    }

    public void setStudentName(String name){
        this.studentName = name;
    }

}
