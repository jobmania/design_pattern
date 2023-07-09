package chapter05.ch03;

public class StudentTest {
    public static void main(String[] args) {
        MyLogger myLogger = MyLogger.getLogger();
        String name = null;
        try {
            Student student = new Student(name);

        }catch (StudentNameFormatException e){
            myLogger.warning(e.getMessage());
        }


        try {
            Student student = new Student("ㅇㅇㅇ ㅇㅇㅇㅇ ㅋㅋ 가가가 ");

        }catch (StudentNameFormatException e){
            myLogger.warning(e.getMessage());
        }


    }
}
