package Assignment.BuiltInFunctions.Type2;

/*
Problem 4: Date Comparison
Write a program that:
➢ Takes two date inputs and compares them to check if the first date is before, after,
  or the same as the second date.
Hint: Use isBefore(), isAfter(), and isEqual() methods from LocalDate class.
*/

import java.time.*;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(sc.next());

        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate date2 = LocalDate.parse(sc.next());

        if (date1.isBefore(date2)) {
            System.out.println("First date is before second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is after second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("Both dates are the same.");
        }

        sc.close();
    }
}

