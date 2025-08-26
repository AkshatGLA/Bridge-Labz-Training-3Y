package Assignment.One.LevelOne;

/*
 * Program 14: Convert distance in feet to yards and miles.
 * 1 yard = 3 feet, 1 mile = 1760 yards
 */
import java.util.Scanner;

class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("The distance " + feet + " feet is equal to " + yards +
                " yards and " + miles + " miles.");
    }
}

