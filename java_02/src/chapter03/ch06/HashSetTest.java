package chapter03.ch06;

import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();

        hashSet.add("엄준식");
        hashSet.add("엄준식");
        hashSet.add("1준식");
        hashSet.add("2준식");
        hashSet.add("3준식");
        hashSet.add("4준식");

        System.out.println(hashSet); /// 순서보장 x , 중복 허용 x
    }
}
