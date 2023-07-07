package chapter04.ch04;

public class TestStringConcat {
    public static void main(String[] args) {
        String s1 = " hello";
        String s2 = " word";

        int num = 10;

        ///// 객체지향 방식
        StringConcatImpl concat = new StringConcatImpl();
        concat.makeString(s1,s2);

        ////// 함수프로그래밍 방식

        StringConcat concat2 = (str1,str2) ->{

//            num = 2000;

            System.out.println(str1 + str2);
            System.out.println(num);
        };
        concat2.makeString(s1,s2);

        // 익명클래스로됨
        StringConcat concat3 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {

//            num = 2000;

                System.out.println(s1+s2);
                System.out.println(num);

            }
        };

        concat3.makeString(s1,s2);

//  결국 람다식 내부가 익명클래스로 구현된다. ( 익명클래스 구성과 동일)
    }
}
