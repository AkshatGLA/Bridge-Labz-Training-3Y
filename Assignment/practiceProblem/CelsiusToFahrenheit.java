package Assignment.practiceProblem;
// Problem 3: Celsius to Fahrenheit Conversion
// Convert temperature from Celsius to Fahrenheit using formula: F = (C * 9/5) + 32

import java.util.Scanner;

class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Celsius temperature as input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Conversion formula
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Displaying result
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        sc.close();
    }
}
