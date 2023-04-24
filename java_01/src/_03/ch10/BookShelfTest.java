package _03.ch10;

public class BookShelfTest {

    public static void main(String[] args) {
        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("일준식1");
        bookQueue.enQueue("이준식");
        bookQueue.enQueue("엄준식");

        int size = bookQueue.getSize();
        System.out.println(size);

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());
    }
}
