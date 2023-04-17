package ch16;

public class NestedLoopTest {
    public static void main(String[] args) {
        int dan;
        int times ;
        for (dan  =2     ; dan < 10; dan++) {
            for (times = 1; times < 10; times++) {
                int result = dan * times;
                System.out.println("result = " + result);
            }
            System.out.println();
        }


    }
}
