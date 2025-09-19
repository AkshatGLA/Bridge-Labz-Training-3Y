package Assignment.practiceProblem;

// Problem 4: Area of a Circle
// Formula: Area = π * radius^2

import java.util.Scanner;

class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input radius
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        // Calculation
        double area = Math.PI * radius * radius;

        // Output
        System.out.println("Area of the circle: " + area);

        sc.close();
    }
}
