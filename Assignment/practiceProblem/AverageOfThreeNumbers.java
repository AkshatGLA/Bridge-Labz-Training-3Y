package Assignment.practiceProblem;
// Problem 4: Calculate Average of Three Numbers

import java.util.Scanner;

class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = sc.nextDouble();

        // Calculation
        double average = (num1 + num2 + num3) / 3;

        // Output
        System.out.println("Average of the three numbers: " + average);

        sc.close();
    }
}
