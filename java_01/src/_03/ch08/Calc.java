package _03.ch08;

import java.util.Arrays;

public interface Calc { // 상수, 추상ㅁ베서드

    // public static final 상수 처리가됨.
    double PI = 3.14;
    int Error = -99999;

    // public abstract 생략되어도 됨
    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description(){
        myMethod();
        System.out.println("정수를 계산합니다.");
    }

    private void myMethod(){
        System.out.println("private method");
    }

    static int total(int[] arr){
        mystaticMethod();
        return Arrays.stream(arr).sum();
    }

    private static void mystaticMethod(){
        System.out.println("mystaticmethod");
    }

}
