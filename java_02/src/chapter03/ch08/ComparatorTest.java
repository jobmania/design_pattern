package chapter03.ch08;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


public class ComparatorTest {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<String>(new MyCompare()); // 구현체
        set.add("aaa");
        set.add("baa");
        set.add("daa");
        set.add("faa");

        System.out.println("set = " + set);


    }
}

class MyCompare implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2) * (-1);
    }
}