package chapter06.ch05;

import java.io.*;

public class FileCopyTest {
    public static void main(String[] args) {
        long miliSecond = 0;

        try(FileInputStream fis = new FileInputStream("a.zip");
            FileOutputStream fos = new FileOutputStream("copy.zip")) {

            miliSecond = System.currentTimeMillis();
            int i ;
            while ( (i = fis.read()) != 1){
                fos.write(i);
            }

            miliSecond = System.currentTimeMillis() - miliSecond;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("파일 복사시 다음과 같은 시간이 소요됨 " + miliSecond );
    }
}
