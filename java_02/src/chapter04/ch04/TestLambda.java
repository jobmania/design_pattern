package chapter04.ch04;

@FunctionalInterface
interface PrintString{
    public void showString(String string);
}


public class TestLambda {


    public static void main(String[] args) {

        // 1
        PrintString printString = string -> System.out.println(string);
        printString.showString("엄준식11");

        // 2
        showMyString(printString);

        // 3
        PrintString myString = returnString();
        myString.showString("엄");

    }
    public static void showMyString(PrintString str){
        str.showString("hello2");
    }

    public  static PrintString returnString(){
        return s -> System.out.println(s + ", 문식");
    }
}
