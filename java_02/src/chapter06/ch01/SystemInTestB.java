package chapter06.ch01;

import java.io.IOException;

public class SystemInTestB {

    public static void main(String[] args) {
        System.out.println("알파벳 여러개 를 쓰고 [enter]를 누르세요!! ");

        int i ;
        try {
            while ( (i = System.in.read()) != '\n'){
                System.out.println((char) i);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
