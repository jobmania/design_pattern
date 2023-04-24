package _03.ch08;

import java.util.Arrays;

public abstract class Calculator implements Calc {
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

//    @Override
//    public void description() {
//        System.out.println("사칙연산을 수행하는 계산기입니다.");
//    }


}
