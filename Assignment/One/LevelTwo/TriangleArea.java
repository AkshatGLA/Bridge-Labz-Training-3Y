package Assignment.One.LevelTwo;

/*
 Question:
 Write a program that takes the base and height in cm to find the area of a triangle
 in square inches and square centimeters.

 Formula: Area = 1/2 * base * height
 Conversion: 1 inch = 2.54 cm → 1 sq inch = (2.54*2.54) = 6.4516 sq cm

 Input: base, height
 Output: The Area of the triangle in sq in is ___ and sq cm is ___
*/

import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter base of triangle in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height of triangle in cm: ");
        double height = input.nextDouble();

        // Compute area
        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / 6.4516;

        // Display results
        System.out.println("The Area of the triangle in sq cm is " + areaCm + " and in sq inches is " + areaInches);
    }
}
