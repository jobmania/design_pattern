package chapter07;


class MyThread extends Thread{
    public void run(){
        int i ;
        for ( i = 0; i < 200 ; i++) {
            System.out.println( i );
        }
    }
}

public class ThreadTest{
    public static void main(String[] args) { // 메인 스레드 1
        MyThread th1 = new MyThread();  // 스레드 2
        th1.start();

        MyThread th2 = new MyThread();  // 스레드 3 
        th2.start();
    }
}


