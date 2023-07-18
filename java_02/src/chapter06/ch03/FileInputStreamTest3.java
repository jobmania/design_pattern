package chapter06.ch03;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {
    public static void main(String[] args) {


        try(  FileInputStream fis = new FileInputStream("input.txt");) {

            int i ;
            while ( (i = fis.read()) != -1){
                System.out.println((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
