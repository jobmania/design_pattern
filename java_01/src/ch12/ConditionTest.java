package ch12;

import java.util.Scanner;

public class ConditionTest {
    public static void main(String[] args) {

        // 조건연산자
        int max;

        System.out.println(" 두 수 중 큰수를 출력 ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력하셈 1번: ");
        int x = scanner.nextInt();

        System.out.println("입력하셈 2번: ");
        int y = scanner.nextInt();

        max = (x>y)? x:y;
        System.out.println(max);


    }

}
