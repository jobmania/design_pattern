package chapter04.ch06;

import java.util.Arrays;
import java.util.function.BinaryOperator;


class CompareString implements BinaryOperator<String >{

    @Override
    public String apply(String s, String s2) {

        if(s.getBytes().length >= s2.getBytes().length){
            return s;
        }else return s2;

    }
}






public class ReduceTest {
    public static void main(String[] args) {
        String[] greetings = {"안녕", "깜딩요", "호나우지유,", "쿠루룰쿠쿠 끼루룩!"};


        /// 1 . 람다식
        String maxString = Arrays.stream(greetings).reduce("", (a, b) -> {
            if (a.getBytes().length >= b.getBytes().length) {
                return a;
            } else return b;
        });
        System.out.println("maxString = " + maxString);


        //// 2. 클래스로 추출
        String max = Arrays.stream(greetings).reduce(new CompareString()).get();
        System.out.println("max = " + max);
    }
}
