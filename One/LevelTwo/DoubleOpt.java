package Assignment.One.LevelTwo;

/*
 Question:
 Write the DoubleOpt program by taking double values a, b, c and doing the same operations as IntOperation.
 Operations: a + b * c, a * b + c, c + a / b, and a % b + c.

 Input: a, b, c
 Output: The results of Double Operations are ___, ___, ___, ___
*/

import java.util.Scanner;

class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter value of c: ");
        double c = input.nextDouble();

        // Perform operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Display results
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", " + result4);
    }
}
