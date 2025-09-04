package Assignment.OOPs.Assignments.Two;

/**
 * Level 1 Practice Program 4: Hotel Booking System
 * Create a HotelBooking class with attributes guestName, roomType, and nights.
 * Use default, parameterized, and copy constructors to initialize bookings.
 */
public class HotelBooking_L1_P4 {
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking_L1_P4() {
        this.guestName = "N/A";
        this.roomType = "Standard";
        this.nights = 1;
        System.out.println("Default constructor called.");
    }

    // Parameterized constructor
    public HotelBooking_L1_P4(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
        System.out.println("Parameterized constructor called.");
    }

    // Copy constructor
    public HotelBooking_L1_P4(HotelBooking_L1_P4 otherBooking) {
        this.guestName = otherBooking.guestName;
        this.roomType = otherBooking.roomType;
        this.nights = otherBooking.nights;
        System.out.println("Copy constructor called.");
    }

    public void displayBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        // Using default constructor
        HotelBooking_L1_P4 booking1 = new HotelBooking_L1_P4();
        System.out.println("Booking 1 (Default):");
        booking1.displayBooking();

        // Using parameterized constructor
        HotelBooking_L1_P4 booking2 = new HotelBooking_L1_P4("John Doe", "Deluxe", 5);
        System.out.println("Booking 2 (Parameterized):");
        booking2.displayBooking();

        // Using copy constructor
        HotelBooking_L1_P4 booking3 = new HotelBooking_L1_P4(booking2);
        System.out.println("Booking 3 (Copy of Booking 2):");
        booking3.displayBooking();
    }
}
