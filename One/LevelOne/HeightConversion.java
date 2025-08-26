package Assignment.One.LevelOne;

/*
 * Program 10: Convert height from cm to feet and inches.
 * 1 foot = 12 inches, 1 inch = 2.54 cm
 */
import java.util.Scanner;

class HeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double cm = input.nextDouble();

        double inches = cm / 2.54;
        int feet = (int) (inches / 12);
        double remainingInches = inches % 12;

        System.out.println("Your Height in cm is " + cm + " while in feet is " + feet +
                " and inches is " + remainingInches);
    }
}
