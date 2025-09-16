package Assignment.OOPs.Assignments.Two;

/**
 * Instance vs. Class Variables and Methods - Problem 1: Product Inventory
 * Create a Product class with:
 * Instance Variables: productName, price.
 * Class Variable: totalProducts (shared among all products).
 * Methods:
 * An instance method displayProductDetails() to display the details of a product.
 * A class method displayTotalProducts() to show the total number of products created.
 */
public class Product {
    // Instance variables - each product has its own name and price
    private String productName;
    private double price;

    // Class variable (static) - shared across all instances of Product
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        // Increment the shared counter each time a new product is created
        totalProducts++;
    }

    // Instance method - operates on a specific instance's data
    public void displayProductDetails() {
        System.out.println("Product Name: " + this.productName);
        System.out.println("Price: $" + this.price);
    }

    // Class method (static) - belongs to the class, not a specific instance
    public static void displayTotalProducts() {
        System.out.println("Total number of products created: " + totalProducts);
    }

    public static void main(String[] args) {
        System.out.println("Initial state:");
        Product.displayTotalProducts(); // Calling the class method before creating any objects
        System.out.println("--------------------");

        // Create first product
        Product product1 = new Product("Laptop", 1200.50);
        System.out.println("Product 1 Details:");
        product1.displayProductDetails(); // Calling instance method
        Product.displayTotalProducts();   // Calling class method
        System.out.println("--------------------");

        // Create second product
        Product product2 = new Product("Mouse", 25.00);
        System.out.println("Product 2 Details:");
        product2.displayProductDetails(); // Calling instance method
        Product.displayTotalProducts();   // Calling class method
    }
}
