package ch03;

public class BinaryTest {

    public static void main(String[] args) {
        int num = 10; // 10진수
        int bNum = 0B1010; // 2진수 0b
        int oNum = 012; // 8진수   0
        int xNum = 0XA; // 16진수  0x

        System.out.println("10진수 num = " + num);
        System.out.println("2진수 bNum = " + bNum);
        System.out.println("8진수 oNum = " + oNum);
        System.out.println("16진수 xNum = " + xNum);

        int cNum = 0b01000001; // 65
        System.out.println(cNum);  // 숫자
        System.out.println((char)cNum); // 문자
    }
}
