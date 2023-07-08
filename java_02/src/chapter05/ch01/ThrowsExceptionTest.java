package chapter05.ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExceptionTest {
    public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {
        ThrowsExceptionTest test = new ThrowsExceptionTest();
        try {
            test.loadClass("memo.txt", "java.lang.String");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (Exception e){
            // 최종 처리
        }

        System.out.println("done");
    }
}
