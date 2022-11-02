package se.lexicon;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean available;




    static Map<Integer, Book> bookMap = new HashMap();

    public Book(int bookId, String title, String author, boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available = available;

    }


    public static void addBooks() {
        Book book1 = new Book(1001, "Distributed Systems", "Tanenbaum", true);
        Book book2 = new Book(1002, "Introduction to Algorithms", "Cormen", true);
        Book book3 = new Book(1003, "Operating System", "Silberschatz", true);

        bookMap.put(1001, book1);
        bookMap.put(1002, book2);
        bookMap.put(1003, book3);
    }


    public Book showPerson() {

    }


}
