package _02.ch10;

public class ObjectCopyTest {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("제목", "엄준식");
        library[1] = new Book("제목", "엄준식");
        library[2] = new Book("제목", "엄준식");
        library[3] = new Book("제목", "엄준식");
        library[4] = new Book("제목", "엄준식");

        for (int i = 0; i < library.length; i++) {
            copyLibrary[i] = new Book();
            copyLibrary[i].setAuthor(library[i].getAuthor());
            copyLibrary[i].setTitle(library[i].getTitle());
//            copyLibrary[i] = library[i]; // 이것은 얕은 복사
        }



        library[0].setTitle("바꿔");
        library[0].setAuthor("갈!");


        for(Book book : library){
            book.showBookInfo();
        }

        System.out.println("============");
        for(Book book : copyLibrary){
            book.showBookInfo();
        }
    }
}
