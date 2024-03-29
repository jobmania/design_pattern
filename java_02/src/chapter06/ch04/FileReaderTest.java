package chapter06.ch04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

    public static void main(String[] args) {

        // 문자 읽기 .. Raader 클래스들은 문자를 읽는다.
        try(FileReader fis = new FileReader("reader.txt")) {

            int i ;
            while ((i = fis.read()) != -1){
                System.out.print((char) i);
            }
            System.out.println("end");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
