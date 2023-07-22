package chapter06.ch07;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) {


        try {
            RandomAccessFile rf = new RandomAccessFile("random.txt", "rw"); // read write 모드
            rf.writeInt(100);
            System.out.println("rf.getFilePointer() = " + rf.getFilePointer());
            rf.writeDouble(3.14);
            System.out.println("rf.getFilePointer = " + rf.getFilePointer());
            rf.writeUTF("안녕깜디");
            System.out.println("rf.getFilePointer() = " + rf.getFilePointer());

            rf.seek(0); // 포지션 이동 -> 첫번째로

            int i = rf.readInt();
            double dnum = rf.readDouble();
            String str = rf.readUTF();

            System.out.println(rf.getFilePointer());
            System.out.println(i);
            System.out.println(dnum);
            System.out.println(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
