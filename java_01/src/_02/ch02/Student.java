package _02.ch02;

public class Student {
    int studentId;
    String studentName;
    String studentAddress;

    public void showStudentInfo(){
        System.out.println(studentName + "," + studentAddress);
    }

    public String getStudentName(){
        return studentName;
    }

    public Student(){

    }

    public Student (int id, String address){
        this.studentId = id;
        this.studentAddress = address;
    }
}
