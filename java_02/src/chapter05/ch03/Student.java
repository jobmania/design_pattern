package chapter05.ch03;

public class Student {
    private String studentName;

    public Student(String studentName) {

        if(studentName  == null){
            throw new StudentNameFormatException("name must not be null");
        }

        if(studentName.split(" ").length > 3 ){
            throw new StudentNameFormatException("name too long");
        }


        this.studentName = studentName;
    }
}
