package chapter06.ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args) {

        // 문자 읽기 .. Raader 클래스들은 문자를 읽는다. 
        try(FileWriter fw = new FileWriter("writer.txt", true)) {
            fw.write('A');
            char buf[] = {'B', 'C', 'D'};

            fw.write(buf);
            fw.write("안녕하세용!! \n ");
            fw.write(buf,1,2);
            fw.write(65);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("end");

    }
}
