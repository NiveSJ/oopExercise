package se.lexicon;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Book book1 = new Book("Distributed Systems", "Tanenbaum", true);
        Book book2 = new Book("Introduction to Algorithms", "Cormen", true);
        Book book3 = new Book("Operating System", "Silberschatz", true);

        Person person1 = new Person(100, "Jay", "solai");
        Person person2 = new Person(101, "Nive", "solai");


    }
}
