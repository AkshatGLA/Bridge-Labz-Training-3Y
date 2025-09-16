package Assignment.OOPs.Assignments.Two;
/**
 * Level 1 Practice Program 2:
 * Write a Circle class with a radius attribute. Use constructor chaining
 * to initialize radius with default and user-provided values.
 */
public class Circle_L1_P2 {
    private double radius;

    // Default constructor
    public Circle_L1_P2() {
        // Chains to the parameterized constructor with a default value of 1.0
        this(1.0);
        System.out.println("Default constructor called, radius set to 1.0.");
    }

    // Parameterized constructor
    public Circle_L1_P2(double radius) {
        this.radius = radius;
        System.out.println("Parameterized constructor called, radius set to " + radius);
    }

    // Method to get the radius
    public double getRadius() {
        return this.radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public static void main(String[] args) {
        // Creating a circle with the default constructor
        System.out.println("Creating default circle...");
        Circle_L1_P2 defaultCircle = new Circle_L1_P2();
        System.out.printf("Default Circle Radius: %.2f, Area: %.2f%n", defaultCircle.getRadius(), defaultCircle.getArea());
        System.out.println("--------------------");

        // Creating a circle with a specific radius
        System.out.println("Creating custom circle...");
        Circle_L1_P2 customCircle = new Circle_L1_P2(5.5);
        System.out.printf("Custom Circle Radius: %.2f, Area: %.2f%n", customCircle.getRadius(), customCircle.getArea());
    }
}
