package chapter06.ch05;

import java.io.*;

public class DataStreamTest {

    public static void main(String[] args) {


        try(FileOutputStream fos = new FileOutputStream("data.txt");
            DataOutputStream dos = new DataOutputStream(fos)) {

            dos.writeByte(100);
            dos.writeChar('A');
            dos.writeInt(10);
            dos.writeFloat(3.14f);
            dos.writeUTF("Test");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try(FileInputStream fis = new FileInputStream("data.txt");
            DataInputStream dis = new DataInputStream(fis)) {

            // 잘못 읽으면 데이터가 깨진다.
            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
            System.out.println(dis.readInt());
            System.out.println(dis.readFloat());
            System.out.println(dis.readUTF());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
