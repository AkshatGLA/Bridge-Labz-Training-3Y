package Assignment.One.LevelOne;

/*
 * Program 12: Find area of a triangle using base and height.
 * Area = 1/2 * base * height
 */
import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of triangle: ");
        double base = input.nextDouble();

        System.out.print("Enter height of triangle: ");
        double height = input.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("The area of the triangle is " + area + " square units");
    }
}
