package Assignment.staticFinal;

// Sample Program 6: Vehicle Registration System

class Vehicle {
    static double registrationFee = 1500;  // common for all vehicles

    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    // Constructor
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Static method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayVehicleDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }
}

class VehicleSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("UP85AB1234", "Pragati Agrawal", "Car");
        Vehicle v2 = new Vehicle("UP85XY5678", "Utkarsh Maheshwari", "Bike");

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();

        // Updating registration fee
        Vehicle.updateRegistrationFee(2000);
        System.out.println("\nAfter fee update:");
        v1.displayVehicleDetails();
    }
}
