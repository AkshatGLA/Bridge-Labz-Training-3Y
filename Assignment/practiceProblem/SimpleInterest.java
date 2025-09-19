package Assignment.practiceProblem;

// Problem 1: Calculate Simple Interest
// Formula: SI = (Principal * Rate * Time) / 100

import java.util.Scanner;

class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter Principal amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        // Calculation
        double si = (principal * rate * time) / 100;

        // Output
        System.out.println("Simple Interest: " + si);

        sc.close();
    }
}
