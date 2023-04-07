package ch06;

public class DoubleTest {
    public static void main(String[] args) {
        double dNum = 3.14;  // 8byte
        float fNum = 3.14f; //4byte
        System.out.println("dNum = " + dNum);
        System.out.println("fNum = " + fNum);

        // 부동 소수점 오류!!

        double mynum = 1;
        for (int i = 0; i < 10000; i++) {
            mynum = mynum + 0.1;
        }

        System.out.println("mynum = " + mynum); /// 1001.000000000159

    }
}
