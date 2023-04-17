package _01.ch13;

import java.util.Scanner;

public class IfElseIfTest {


    public static void main(String[] args) {
        int charge;
        int age;
        System.out.println("나이입력");
        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();
        if(age < 8){
            charge=1000;
            System.out.println("미취");
        } else if (age < 14) {
            charge = 2000;
            System.out.println("중고딩");
        } else if (age< 20) {
            charge = 2500;

            System.out.println("중고딩");
        } else {
            charge = 3000;
        }

        System.out.println(charge);
    }

    /// if else와 if-if는 다르다!!
}
