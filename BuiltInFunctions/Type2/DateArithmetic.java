package Assignment.BuiltInFunctions.Type2;

/*
Problem 2: Date Arithmetic
Create a program that:
➢ Takes a date input and adds 7 days, 1 month, and 2 years to it.
➢ Then subtracts 3 weeks from the result.
Hint: Use LocalDate.plusDays(), plusMonths(), plusYears(), and minusWeeks().
*/

import java.time.*;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date (yyyy-MM-dd): ");
        String input = sc.next();
        LocalDate date = LocalDate.parse(input);

        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Final Date after operations: " + newDate);

        sc.close();
    }
}

