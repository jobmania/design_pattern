package chapter04.ch01;


class AnonyOuter{
    int outNum = 100;
    static int sNum = 200;


    Runnable getRunnable(int i){

        int localNum = 10;

        return new Runnable() {  // 익명클래스 활용 ~
            int localClassNum = 5;

            @Override
            public void run() {

                System.out.println("i =" + i);
                System.out.println("num = " + localClassNum);
                System.out.println("localNum = " +localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outter.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");

            }
        };
    }


}



public class AnonymousTest {
    public static void main(String[] args) {
        AnonyOuter outer = new AnonyOuter();
        Runnable runnable = outer.getRunnable(20);

        runnable.run();
    }
}
