package _01.ch10;

public class OperatorTest {

    public static void main(String[] args) {

        int total = 10;
        int add = 10;
        total += add;
        System.out.println("total = " + total);

        int gameScore = 100;
        int myScore;

        myScore = ++gameScore;
        // 101 101
        System.out.println(myScore+ " " + gameScore);

        myScore = gameScore++; // 101  102
        System.out.println(myScore+ " " + gameScore);
    }
}
