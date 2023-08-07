package chapter07.ch01;


class MyRunnable implements Runnable{

    @Override
    public void run() {
        int i ;
        for ( i = 0; i < 200 ; i++) {
            System.out.print( i + " ");
        }
    }
}

public class ThreadTest2{
    public static void main(String[] args) { // 메인 스레드 1

        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread(runnable);
        t1.start();

        Thread t2 = new Thread(new MyRunnable());
        t2.start();
    }
}


