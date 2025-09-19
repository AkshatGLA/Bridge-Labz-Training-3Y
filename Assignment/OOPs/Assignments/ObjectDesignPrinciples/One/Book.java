package Assignment.OOPs.Assignments.ObjectDesignPrinciples.One;

// Problem 1: Library and Books (Aggregation)

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println("Book: " + title + " by " + author);
    }
}

class Library {
    private String name;
    private List<Book> books;  // Aggregation: Library has Books

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);  // Aggregation: Book exists independently
    }

    public void displayLibrary() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            book.displayBook();
        }
    }
}

class LibraryDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling");
        Book b2 = new Book("C++ Fundamentals", "Bjarne Stroustrup");

        Library lib1 = new Library("City Library");
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib1.displayLibrary();
    }
}
