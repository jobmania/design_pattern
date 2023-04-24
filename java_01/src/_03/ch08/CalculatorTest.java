package _03.ch08;

public class CalculatorTest {

    public static void main(String[] args) {
        int num1= 10;
        int num2 = 2;
        CompleteCalc cal = new CompleteCalc();
        System.out.println(cal.add(num1,num2));
        System.out.println(cal.subtract(num1,num2));
        System.out.println(cal.times(num1,num2));
        System.out.println(cal.divide(num1,num2));
//        cal.showInfo();
        cal.description();

        int[] arr = {10, 2,1,2};
        int total = Calc.total(arr);
        System.out.println("total = " + total);
    }

}
