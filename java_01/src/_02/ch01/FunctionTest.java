package _02.ch01;

public class FunctionTest {
    public static void main(String[] args) {

        int a1 = 20;
        int a2 = 10;

        int result = addNum(a1, a2);
        System.out.println("result = " + result);

        sayHello("엄준식");
        int sum = calcSum();
        System.out.println("sum = " + sum);
    }

    public static int addNum(int a1, int a2) {
        return a1 + a2;
    }

    public static void sayHello(String str){
        System.out.println(str);
    }

    public static int calcSum(){
        int i ;
        int sum=0;
        for ( i = 0; i <= 100 ; i++) {
            sum += i;

        }
        return sum;
    }
}
