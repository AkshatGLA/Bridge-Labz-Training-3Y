package Assignment.practiceProblem;

// Problem 3: Power Calculation
// Program to calculate base^exponent without loops or conditionals

import java.util.Scanner;

class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input base and exponent
        System.out.print("Enter the base: ");
        double base = sc.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = sc.nextDouble();

        // Calculation using Math.pow()
        double result = Math.pow(base, exponent);

        // Output
        System.out.println(base + " raised to the power " + exponent + " is: " + result);

        sc.close();
    }
}
