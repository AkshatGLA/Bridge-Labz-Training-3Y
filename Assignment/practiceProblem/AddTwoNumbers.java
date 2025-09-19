package Assignment.practiceProblem;
// Problem 2: Add Two Numbers
// Write a program that takes two numbers as input from the user and prints their sum.

import java.util.Scanner;

class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Asking user for input
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Calculating sum
        int sum = num1 + num2;

        // Displaying result
        System.out.println("The sum is: " + sum);

        sc.close();
    }
}

