package se.lexicon;

import java.util.*;

public class Person {
    private int personId;
    private String firstName;
    private String lastName;

    List<Integer> bookIDs = new ArrayList<Integer>(); //Books lent to Person


    public Person(int personId, String firstName, String lastName) {

        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public void loanBooks(Book book) {
        bookIDs.add(book.getBookId());

        if (book.isAvailable()){
            book.setAvailable(false);
            book.setPerson(this);
        }
        else {
            System.out.println("Book " + book.getBookId() + " is not available");
        }
    }

    public void displayBooks() {

        System.out.println("Person Name: " + firstName + " " + lastName);
        System.out.println("Books Lent: ");

        for (int i : bookIDs) {
            System.out.println("\t" + i);
        }


    }


}
