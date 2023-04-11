package ch13;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력");
        age = scanner.nextInt();

        if (age >= 8) {
            System.out.println("학교감");
        } else {
            System.out.println("어린이는 놀아야 합니다.");
        }
    }
}
