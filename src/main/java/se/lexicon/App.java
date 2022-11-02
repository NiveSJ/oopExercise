package se.lexicon;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {

    static Map<Integer, Person> personMap = new HashMap();
    static Map<Integer, Book> bookMap = new HashMap();

    public static void main(String[] args) {
        addMembers();
        addBooks();
        loanBookToUsers(); // Print user details with book id

        printBookDetails();
    }

    public static void addMembers() {
        Person person1 = new Person(100, "Jay", "solai");
        Person person2 = new Person(101, "Nive", "solai");

        personMap.put(100, person1);
        personMap.put(101, person2);


    }

    public static void addBooks() {
        Book book1 = new Book(1001, "Distributed Systems", "Tanenbaum", true);
        Book book2 = new Book(1002, "Introduction to Algorithms", "Cormen", true);
        Book book3 = new Book(1003, "Operating System", "Silberschatz", true);

        bookMap.put(1001, book1);
        bookMap.put(1002, book2);
        bookMap.put(1003, book3);
    }

    public static void loanBookToUsers() {
        Person p1 = personMap.get(100);
        p1.loanBooks(bookMap.get(1001));
        p1.loanBooks(bookMap.get(1003));


        Person p2 = personMap.get(101);
        p2.loanBooks(bookMap.get(1002));

        printReport();

        //Negative scenario
        Person p3 = personMap.get(101);
        p3.loanBooks(bookMap.get(1001));
    }

    public static void printReport() {
        Person p1 = personMap.get(100);
        p1.displayBooks();

        Person p2 = personMap.get(101);
        p2.displayBooks();
    }

    public static void printBookDetails(){
        System.out.println("<========================================>");
        System.out.println("\nBook Details");

        for(Map.Entry<Integer, Book> entry : bookMap.entrySet()){
            System.out.println("Book ID: " + entry.getKey());
            System.out.println("Book Name: " + entry.getValue().getTitle());
            System.out.println("Book Author: " + entry.getValue().getAuthor());
            System.out.println("Book Name: " + entry.getValue().getPerson().getName());
            System.out.println("========================================>");
        }
    }
}
