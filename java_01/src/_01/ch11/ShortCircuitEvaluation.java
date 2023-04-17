package _01.ch11;

public class ShortCircuitEvaluation {

    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;

        boolean value;
        value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
        System.out.println("value = " + value);
        System.out.println("num1 = " + num1);
        // i 는 수행이 되지 않음
        System.out.println("i = " + i);


        value = ((num1 = num1 + 10) < 10)|| ((i = i + 2) < 10);

        System.out.println("value = " + value);
        System.out.println("num1 = " + num1);
        // i 는 수행 됨
        System.out.println("i = " + i);
    }
}
