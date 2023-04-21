package _03.ch06;

public interface Calc { // 상수, 추상ㅁ베서드

    // public static final 상수 처리가됨.
    double PI = 3.14;
    int Error = -99999;

    // public abstract 생략되어도 됨
    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);
}
