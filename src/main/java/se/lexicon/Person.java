package se.lexicon;


import java.util.*;

public class Person {

    private int personId;
    private String firstName;
    private String lastName;

    private Book[] books = new Book[0];


    public Person(int personId, String firstName, String lastName) {

        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;

    }
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public String getName() {
        return firstName + " " + lastName;
    }


    public void loanBooks(Book book) {

        if (book.isAvailable()) {
            book.setPerson(this);
            Book[] tmp = Arrays.copyOf(books, books.length + 1);
            tmp[tmp.length -1] = book;

            books = tmp;

        } else {
            System.out.println("Book " + book.getBookId() + " is not available");
        }
    }

    public void  returnbook(Book book){
        for(Book booktmp: books){
            if(booktmp == book ){
               book.returnbookPerson(this);
            }




        }



    }



    public void displayBooks() {


   for(Book book: books ){

       System.out.println(book.displayBookInfo());
   }


    }


}
