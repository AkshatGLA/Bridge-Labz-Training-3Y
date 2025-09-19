package Assignment.practiceProblem;

// Problem 5: Convert Kilometers to Miles
// Formula: Miles = Kilometers * 0.621371

import java.util.Scanner;

class KilometersToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();

        // Conversion
        double miles = kilometers * 0.621371;

        // Output
        System.out.println("Distance in miles: " + miles);

        sc.close();
    }
}
