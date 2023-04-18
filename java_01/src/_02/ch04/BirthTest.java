package _02.ch04;

public class BirthTest {
    public static void main(String[] args) {
        BirthDay day = new BirthDay();
        day.setDay(20);
        day.setYear(2023);
        day.setMonth(1);


        System.out.println(day.isValid);
        System.out.println("day = " + day);
        day.printThis();
    }


}
