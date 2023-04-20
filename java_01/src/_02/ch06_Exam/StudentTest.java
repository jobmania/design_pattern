package _02.ch06_Exam;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("준식",5000);
        Student student2 = new Student("무식",10000);

        Bus bus = new Bus(123);
        Subway subway = new Subway(33);

        student1.takeBus(bus);
        student2.takeSubway(subway);

        student1.showStudent();
        student2.showStudent();

        bus.showBusInfo();
        subway.showSubwayInfo();

    }
}
