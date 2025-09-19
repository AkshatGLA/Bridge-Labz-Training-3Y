package Assignment.staticFinal;

// Sample Program 2: Library Management System

class Book {
    static String libraryName = "National Library";
    private final String isbn;  // cannot be changed
    private String title;
    private String author;

    // Constructor using 'this'
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method
    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }
}

class LibrarySystem {
    public static void main(String[] args) {
        Book.displayLibraryName();

        Book book1 = new Book("Java Basics", "James Gosling", "ISBN123");
        book1.displayBookDetails();
    }
}
