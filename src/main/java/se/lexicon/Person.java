package se.lexicon;

import java.util.*;

public class Person {
    private int personId;
    private String firstName;
    private String lastName;

    static Map<Integer, Person> personMap = new HashMap();



    List<Integer> bookIDs = new ArrayList<Integer>(); //Books lended to Person



    public Person(int personId, String firstName, String lastName) {

        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;

    }

    public static void addMembers() {
        Person person1 = new Person(100, "Jay", "solai");
        Person person2 = new Person(101, "Nive", "solai");

        personMap.put(100, person1);
        personMap.put(101, person2);
    }
    public void loanBooks(Book book) {


    }

    public String displayBooks() {


    }

}
