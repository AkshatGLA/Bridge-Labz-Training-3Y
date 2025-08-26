package Assignment.One.LevelOne;

/*
 * Program 8: Convert distance in kilometers to miles.
 * Take user input for kilometers.
 */
import java.util.Scanner;

class KmToMilesUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        double miles = km / 1.6;
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}
