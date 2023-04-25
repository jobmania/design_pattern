package chapter01.ch02;

public class EqualsTest {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student lee = new Student(1, "엄");
        Student lee2 = lee;
        Student um = new Student(1, "엄");

        Student ab = (Student) um.clone(); // 반환값이 object이므로 다운캐스팅.

        System.out.println(um.toString());
        System.out.println(ab.toString());

//        System.out.println(lee.equals(lee2)); // true
//        System.out.println(lee==lee2); // true

        // Student equals 재정의> id만 비교
//        System.out.println(lee.equals(um));
//        System.out.println(lee==um);
//        System.out.println(um.hashCode());


        System.out.println(lee.hashCode());
        System.out.println(um.hashCode());

        System.out.println(System.identityHashCode(lee));
        System.out.println(System.identityHashCode(um));

        String str1 = "123";
        String str2 = "123";

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
    }
}
