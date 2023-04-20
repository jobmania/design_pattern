package _02.ch10;

public class BookArrayTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        library[0] = new Book("제목", "엄준식");
        library[1] = new Book("제목", "엄준식");
        library[2] = new Book("제목", "엄준식");
        library[3] = new Book("제목", "엄준식");
        library[4] = new Book("제목", "엄준식");

        for(Book book : library){
            book.showBookInfo();
            System.out.println(book);
        }

    }
}
