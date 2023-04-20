package _02.ch06_Exam;

public class Student {
    String studentName;
    int grade;
    int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus){
        bus.takeBus(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway){
        subway.takeSubway(1200);
        this.money -= 1200;
    }

    public void showStudent(){
        System.out.println(studentName +" 님의 돈"+ money );
    }
}
