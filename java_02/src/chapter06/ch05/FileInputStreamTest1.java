package chapter06.ch05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileInputStreamTest1 {
    public static void main(String[] args) {
        // inputstreamReader
        try(InputStreamReader ir = new InputStreamReader(new FileInputStream("reader.txt")))  {

            int i ;
            while ((i = ir.read()) != -1){
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
