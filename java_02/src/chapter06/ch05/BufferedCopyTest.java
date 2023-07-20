package chapter06.ch05;

import java.io.*;
import java.net.Socket;

public class BufferedCopyTest {
    public static void main(String[] args) throws IOException {
        long miliSecond = 0;

        try(BufferedInputStream bis = new BufferedInputStream (new FileInputStream("a.zip")) ;  // default bufferd size 는 8k 제공됨.
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"))) {

            miliSecond = System.currentTimeMillis();
            int i ;
            while ( (i = bis.read()) != 1){
                bos.write(i);
            }

            miliSecond = System.currentTimeMillis() - miliSecond;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("파일 복사시 다음과 같은 시간이 소요됨 " + miliSecond );

        Socket socket = new Socket();
        BufferedReader br =   //
        new BufferedReader(new InputStreamReader(socket.getInputStream()))  ;

        br.readLine(); // 한줄 읽기
    }
}
