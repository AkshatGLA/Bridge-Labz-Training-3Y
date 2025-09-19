package Assignment.practiceProblem;

// Problem 5: Volume of a Cylinder
// Formula: Volume = π * radius^2 * height

import java.util.Scanner;

class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input radius and height
        System.out.print("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = sc.nextDouble();

        // Calculation
        double volume = Math.PI * radius * radius * height;

        // Output
        System.out.println("Volume of the cylinder: " + volume);

        sc.close();
    }
}
