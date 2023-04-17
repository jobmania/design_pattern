package _01.ch17;

import java.util.Scanner;

public class Test {
    /**
    *     *
    *    ***
     *  *****
     * *******
     *  *****
     *   ***
     *    *
    * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int blankCount = count/2;
        int starCount = 0;
        for (int i = 1; i <= count; i++) {
            starCount = count - 2 * blankCount;


            for (int j = 0; j < blankCount; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < starCount; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < blankCount; j++) {
                System.out.print(" ");
            }

            System.out.println();

            if(i<count/2+1){
                blankCount--;
            }else {
                blankCount++;
            }

        }


    }
}
