package chapter01.ch03;

public class StringTest {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1==str2);  // false

        String abc = "abc";
        String abc2 = "abc";
        System.out.println(abc==abc2);  ///


    }
}
