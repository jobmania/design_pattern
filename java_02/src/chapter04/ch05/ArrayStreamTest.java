package chapter04.ch05;

import java.util.Arrays;

public class ArrayStreamTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sumVal = Arrays.stream(arr).sum(); // 합연산.
        System.out.println("sumVal = " + sumVal);

        long count = Arrays.stream(arr).count();
        System.out.println("count = " + count);

        // 중간 연산 filter, mapping, sorted (Comparable 인터페이스가 구현되어있어야함)

        //최종연산 foreach, count, sum ..

    }
}
