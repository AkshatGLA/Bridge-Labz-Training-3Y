package Assignment.One.LevelTwo;

/*
 Question:
 Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.

 Input: unitPrice, quantity
 Output: The total purchase price is INR ___ if the quantity ___ and unit price is INR ___
*/

import java.util.Scanner;

class PurchasePrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take inputs
        System.out.print("Enter unit price of item (INR): ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        // Compute total price
        double totalPrice = unitPrice * quantity;

        // Display result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
    }
}
