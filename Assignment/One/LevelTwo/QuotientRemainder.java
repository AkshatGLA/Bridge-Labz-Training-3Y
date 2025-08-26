package Assignment.One.LevelTwo;

/*
 Question:
 Write a program to take 2 numbers and print their quotient and remainder.

 Input: number1, number2
 Output: The Quotient is ___ and Remainder is ___ of two numbers ___ and ___
*/

import java.util.Scanner;

class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter second number: ");
        int number2 = input.nextInt();

        // Compute quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Display results
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers " + number1 + " and " + number2);
    }
}
