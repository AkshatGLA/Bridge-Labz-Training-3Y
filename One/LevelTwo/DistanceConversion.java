package Assignment.One.LevelTwo;

/*
 Question:
 Write a program to find the distance in yards and miles for the distance provided by the user in feet.

 Conversion:
 1 yard = 3 feet
 1 mile = 1760 yards

 Input: distanceInFeet
 Output: The distance in yards is ___ while the distance in miles is ___
*/

import java.util.Scanner;

class DistanceConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Compute conversion
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        // Display results
        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
    }
}
