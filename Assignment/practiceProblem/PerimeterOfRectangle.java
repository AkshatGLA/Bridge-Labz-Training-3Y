package Assignment.practiceProblem;
// Problem 2: Perimeter of a Rectangle
// Formula: Perimeter = 2 * (length + width)

import java.util.Scanner;

class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input length and width
        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        // Calculation
        double perimeter = 2 * (length + width);

        // Output
        System.out.println("Perimeter of the rectangle: " + perimeter);

        sc.close();
    }
}

