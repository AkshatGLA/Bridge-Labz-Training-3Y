package Assignment.OOPs.Assignments.Two;

/**
 * Level 1 Practice Program 5: Library Book System
 * Create a Book class with attributes title, author, price, and availability.
 * Implement a method to borrow a book.
 */
public class Book_L1_P5 {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor
    public Book_L1_P5(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; // New books are available by default
    }

    // Method to borrow a book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed '" + title + "'. Enjoy!");
        } else {
            System.out.println("Sorry, '" + title + "' is currently unavailable.");
        }
    }

    // Method to return a book
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Thank you for returning '" + title + "'.");
        } else {
            System.out.println("This book was not borrowed from our library.");
        }
    }

    public void displayStatus() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Checked Out"));
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Book_L1_P5 libraryBook = new Book_L1_P5("1984", "George Orwell", 12.50);

        libraryBook.displayStatus();

        // Attempt to borrow the book
        libraryBook.borrowBook();
        libraryBook.displayStatus();

        // Attempt to borrow it again
        libraryBook.borrowBook();
        System.out.println("--------------------");

        // Return the book
        libraryBook.returnBook();
        libraryBook.displayStatus();
    }
}
