package _02.ch11;

import _02.ch10.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<Book>();
        list.add(new Book("무자식","엄준식"));
        list.add(new Book("무자식1","엄준식"));
        list.add(new Book("무자식2","엄준식"));
        list.add(new Book("무자식3","엄준식"));
        list.add(new Book("무자식4","엄준식"));

        for (int i = 0; i < list.size(); i++) {
            list.get(i).showBookInfo();
        }
    }
}
