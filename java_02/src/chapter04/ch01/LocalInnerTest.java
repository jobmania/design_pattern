package chapter04.ch01;



class Outer{
    int outNum = 100;
    static int sNum = 200;


    Runnable getRunnable(int i){

        int localNum = 10;

        class MyRunnable implements Runnable{

         int localClassNum = 5;

            @Override
            public void run() {
                //num = 200;   //에러 남. 지역변수는 상수로 바뀜
//                i = 100;     //에러 남. 매개 변수 역시 지역변수처럼 상수로 바뀜 // final로 변함
//                localNum = 299; // final로 변함
                System.out.println("i =" + i);
                System.out.println("num = " + localClassNum);
                System.out.println("localNum = " +localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outter.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
            }
        }
        return new MyRunnable();  // 반환할때 매개변수
    }


}





public class LocalInnerTest {

    public static void main(String[] args) {
        Outer outer = new Outer();
        Runnable runnable = outer.getRunnable(100);
        runnable.run();
    }

}
