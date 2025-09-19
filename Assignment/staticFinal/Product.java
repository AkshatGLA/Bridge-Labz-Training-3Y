package Assignment.staticFinal;

// Sample Program 4: Shopping Cart System

class Product {
    static double discount = 5.0; // shared discount percentage
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    // Constructor
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }
}

class ShoppingCartSystem {
    public static void main(String[] args) {
        Product prod1 = new Product(101, "Laptop", 55000, 2);
        Product prod2 = new Product(102, "Headphones", 2000, 5);

        prod1.displayProductDetails();
        System.out.println();
        prod2.displayProductDetails();

        // Updating discount
        Product.updateDiscount(10);
        System.out.println("\nAfter updating discount:");
        prod1.displayProductDetails();
    }
}
