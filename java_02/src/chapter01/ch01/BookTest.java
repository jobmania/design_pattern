package chapter01.ch01;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("제목","엄준식");
        System.out.println(book.toString());
        //chapter01.ch01.Book@6a5fc7f7

    }
}

class Book{
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + "," + author;
    }
}