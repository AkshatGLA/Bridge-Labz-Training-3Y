package Assignment.One.LevelOne;

/*
 * Program 9: Take user input for fee and discount percent.
 * Compute discount and final fee.
 */
import java.util.Scanner;

class UniversityFeeDiscountUser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter total course fee (INR): ");
        double fee = input.nextDouble();

        System.out.print("Enter discount percent: ");
        double discountPercent = input.nextDouble();

        double discountAmount = (discountPercent / 100) * fee;
        double finalFee = fee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount +
                " and final discounted fee is INR " + finalFee);
    }
}
