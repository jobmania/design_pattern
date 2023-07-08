package chapter05.ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionAuto {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("memo.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e);
        } catch (IOException e1){
            e1.printStackTrace();
        }
    }
}
