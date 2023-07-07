package chapter04.ch01;


class OutClass{
    private int num = 10;
    private static int sNum = 20;
    private InnerClass inClass;


    public OutClass() {
        this.inClass = new InnerClass(); // 이너 클래스 생성자 주입
    }

    class InnerClass {
        int inNum = 410;
//        static int sInNum = 200; // 이너클래스 정적 필드 및 메서드는  java 16 이후 가능

        void inTest(){
            System.out.println(num);
            System.out.println(sNum);
            System.out.println(inNum);
        }

//        static void sTest(){ // java 16 이후 가능
//
//        }
    }

    public void usingInClass(){
        inClass.inTest();
    }

    static class InStaticClass{

        int inNum = 500;
        static int sInNum = 700;

        void inTest(){   //정적 클래스의 일반 메서드
            //num += 10;    // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
            System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
        }

        static void sTest(){  // 정적 클래스의 static 메서드
            //num += 10;   // 외부 클래스의 인스턴스 변수는 사용할 수 없음.
            //inNum += 10; // 내부 클래스의 인스턴스 변수는 사용할 수 없음

            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 스태틱 변수 사용)");

        }


    }
}





public class InnerTest {

    public static void main(String[] args) {
       /* OutClass outer = new OutClass();
        outer.usingInClass();


//        System.out.println(OutClass.InnerClass.sInNum);


        OutClass.InnerClass innerClass = outer.new InnerClass();
        innerClass.inTest();*/



        OutClass.InStaticClass.sTest();
        System.out.println("=========");
        OutClass.InStaticClass innerClass = new OutClass.InStaticClass();
        innerClass.inTest();


    }
}
