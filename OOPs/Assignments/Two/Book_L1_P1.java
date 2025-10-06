package OOPs.Assignments.Two;

/**
 * Level 1 Practice Program 1:
 * Create a Book class with attributes title, author, and price.
 * Provide both default and parameterized constructors.
 */
public class Book_L1_P1 {
    // Attributes
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book_L1_P1() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        System.out.println("Default constructor called.");
    }

    // Parameterized constructor
    public Book_L1_P1(String title, String author, double price) {
        // Use 'this' keyword to avoid ambiguity
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Parameterized constructor called.");
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: $" + this.price);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        // Create a book using the default constructor
        Book_L1_P1 book1 = new Book_L1_P1();
        book1.displayDetails();

        // Create a book using the parameterized constructor
        Book_L1_P1 book2 = new Book_L1_P1("The Great Gatsby", "F. Scott Fitzgerald", 15.99);
        book2.displayDetails();
    }
}