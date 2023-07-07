package chapter04.ch02;

public class TestAdd {
    public static void main(String[] args) {
        Add addF = (x,y) -> x+y;
        int add = addF.add(3, 5);
        System.out.println("add = " + add);


        MyMaxNumber max = ((x, y) -> (x >= y) ? x : y);
        System.out.println("max = " + max.getMax(5,12));
    }
}
