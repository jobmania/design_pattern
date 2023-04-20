package _02.ch10;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("제목", "엄준식");
        library[1] = new Book("제목", "엄준식");
        library[2] = new Book("제목", "엄준식");
        library[3] = new Book("제목", "엄준식");
        library[4] = new Book("제목", "엄준식");

        System.arraycopy(library,0,copyLibrary,0,5); // 얕은 복사

        for(Book book : library){
            book.showBookInfo();
            System.out.println(book);
        }

        System.out.println("============");
        for(Book book : copyLibrary){
            book.showBookInfo();
            System.out.println(book);
        }

        library[0].setTitle("바꿔");
        library[0].setAuthor("갈!");

        for(Book book : library){
            book.showBookInfo();
            System.out.println(book);
        }

        System.out.println("============");
        for(Book book : copyLibrary){
            book.showBookInfo();
            System.out.println(book);
        }
    }
}
