package ch15;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input ;
        int sum  = 0 ;

        // 초기화 해주는게 좋다.
        do {
            input = scanner.nextInt();
            sum += input;

        }while (input != 0 );
        System.out.println(sum);

    }
}
