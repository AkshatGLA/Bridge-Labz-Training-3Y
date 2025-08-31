package Assignment.BuiltInFunctions.Type1;

/*
Problem Statement:
Basic Calculator:
- Perform addition, subtraction, multiplication, division.
- Each operation in its own function.
*/

import java.util.Scanner;

public class BasicCalculator {
    public static int add(int a, int b) { return a + b; }
    public static int subtract(int a, int b) { return a - b; }
    public static int multiply(int a, int b) { return a * b; }
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose operation: 1.Add 2.Subtract 3.Multiply 4.Divide");
        int choice = sc.nextInt();

        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (choice) {
            case 1 -> System.out.println("Result: " + add(a, b));
            case 2 -> System.out.println("Result: " + subtract(a, b));
            case 3 -> System.out.println("Result: " + multiply(a, b));
            case 4 -> System.out.println("Result: " + divide(a, b));
            default -> System.out.println("Invalid choice!");
        }
        sc.close();
    }
}

