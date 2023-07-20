package chapter06.ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutStreamTest3 {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("output3.txt");

        try(fos) {

            byte[] bs = new byte[26];

            byte data = 65;

            for (int i = 0; i < bs.length; i++) {
                bs[i] = data++;
            }

            fos.write(bs,2,10);  // buffer를 많이 사용
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("end!!");
    }
}
