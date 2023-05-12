package chapter02.ch04;

public class MyArrayStackTest {
    public static void main(String[] args) {
        MyArrayStack stack = new MyArrayStack(3);

        stack.push(10);
        stack.push(12);
        stack.push(13);
        stack.push(14);


        stack.printAll();

        System.out.println("=========");
        System.out.println(stack.pop());
        System.out.println("=========");
        stack.printAll();
        System.out.println("=========");
        System.out.println(stack.peek());
        System.out.println("=========");
        stack.printAll();
        System.out.println("=========");
        System.out.println(stack.getSize());
    }
}
