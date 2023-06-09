package chapter01.ch02;

public class Student implements Cloneable {
    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {
        /// 다운캐스팅 및 검사
        if(obj instanceof Student){
            Student student = (Student) obj;
            return this.studentId == student.studentId;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentId;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return studentName;
    }
}
