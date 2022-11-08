package se.lexicon;

import java.util.*;

public class Book {
    private int bookId;

    private String title;
    private String author;


    private boolean available;
    private Person person;


    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
        this.available = false;
    }
    public void returnbookPerson(Person person){
        this.person = person;
        this.available = true;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public String displayBookInfo(){
        return bookId + " " + title + " " + available;
    }
    public String displayLanderInfo(){
        return " "+ person.getName();
    }

}
