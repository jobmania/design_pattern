package chapter05.ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
          fis = new FileInputStream("memo.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e);
            return;
        }finally {
            System.out.println("finally");
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
