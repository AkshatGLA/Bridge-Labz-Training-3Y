package Assignment.One.LevelTwo;

/*
 Question:
 Write a program to find the side of the square whose perimeter you read from the user.

 Formula: Perimeter = 4 * side

 Input: perimeter
 Output: The length of the side is ___ whose perimeter is ____
*/

import java.util.Scanner;

class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Compute side
        double side = perimeter / 4;

        // Display result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
    }
}
