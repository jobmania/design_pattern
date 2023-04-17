package _01.ch07;

public class CharacterTest {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int) ch1);

        char ch2 = 66;
        System.out.println(ch2);

        char ch3 = '한';
        char ch4 = '\uD55C'; // 유니코드
        char ch5 = '\uAC00'; // 2byte 유니코드로 표현


        System.out.println("ch3 = " + ch3);
        System.out.println("ch4 = " + ch4);
        System.out.println("ch5 = " + ch5);

        // 문자열은 string


    }
}

