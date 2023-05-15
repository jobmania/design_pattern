package chapter02.ch05;

public class MyListQueueTest {

    public static void main(String[] args) {
        MyListQueue listQueue = new MyListQueue();
        listQueue.enQueue("A");
        listQueue.enQueue("B");
        listQueue.enQueue("C");
        listQueue.enQueue("D");
        listQueue.enQueue("E");
        listQueue.enQueue("F");
        listQueue.enQueue("G");

        System.out.println("=============");

        System.out.println(listQueue.deQueue());
        System.out.println(listQueue.deQueue());
        System.out.println(listQueue.deQueue());
        System.out.println(listQueue.deQueue());
        System.out.println(listQueue.deQueue());
        System.out.println(listQueue.deQueue());
        System.out.println(listQueue.deQueue());

        listQueue.printAll();
    }
}
