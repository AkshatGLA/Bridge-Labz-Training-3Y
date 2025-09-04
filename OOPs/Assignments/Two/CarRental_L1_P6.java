package Assignment.OOPs.Assignments.Two;

/**
 * Level 1 Practice Program 6: Car Rental System
 * Create a CarRental class with attributes customerName, carModel, and rentalDays.
 * Add constructors to initialize the rental details and calculate total cost.
 */
public class CarRental_L1_P6 {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final double DAILY_RATE = 50.0; // A constant rate for simplicity

    // Default constructor
    public CarRental_L1_P6() {
        this.customerName = "Unknown";
        this.carModel = "Standard Model";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    public CarRental_L1_P6(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Private method to encapsulate logic, keeping constructor clean
    private double calculateTotalCost() {
        return this.rentalDays * DAILY_RATE;
    }

    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: $" + calculateTotalCost());
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        CarRental_L1_P6 rental1 = new CarRental_L1_P6("Jane Smith", "Toyota Camry", 7);
        System.out.println("Rental Details 1:");
        rental1.displayRentalDetails();

        CarRental_L1_P6 rental2 = new CarRental_L1_P6();
        System.out.println("Rental Details 2 (Default):");
        rental2.displayRentalDetails();
    }
}
