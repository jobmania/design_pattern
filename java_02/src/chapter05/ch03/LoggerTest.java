package chapter05.ch03;

public class LoggerTest {
    public static void main(String[] args) {
        MyLogger myLogger = MyLogger.getLogger();

        myLogger.log("test");

    }
}
