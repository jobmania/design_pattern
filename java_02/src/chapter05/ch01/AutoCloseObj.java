package chapter05.ch01;

public class AutoCloseObj  implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("close() called ");
    }
}
