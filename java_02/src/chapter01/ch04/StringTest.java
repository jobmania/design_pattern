package chapter01.ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("java.lang.String"); // 동적로딩
        System.out.println("c.getName() = " + c.getName());
//        String str;

        Constructor<String>[] cons = c.getConstructors();

        for (Constructor con : cons){
            System.out.println("con = " + con);
        }

        Method[] methods = c.getMethods();
        for(Method m : methods){
            System.out.println("m = " + m);
        }

    }
}
