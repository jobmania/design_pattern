package chapter04.ch05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<>();
        sList.add("엄ㅋ");
        sList.add("준");
        sList.add("식짱22");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.println(s) );

        sList.stream().sorted().forEach(System.out::println);  // sort, 리스트의 요소는 변경 x

        sList.stream().map(s -> s.length()).forEach(n-> System.out.println(n)); // map

        sList.stream().filter(s->s.length() <=3).forEach(System.out::println); // filter


    }
}
