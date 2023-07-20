package chapter06.ch03;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {
    public static void main(String[] args) {


        try(  FileInputStream fis = new FileInputStream("input2.txt");) { // 리소스를 선언 및 초기화

            byte[] bs = new byte[10];

            int i ;
            while ( (i = fis.read(bs)) != -1){
                for (int k = 0 ; k < i; k++ ){ // 잔여 데이터가 있을수 잇음
                    System.out.println((char) bs[k] );
                }
                System.out.print(i +"bytes read");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
