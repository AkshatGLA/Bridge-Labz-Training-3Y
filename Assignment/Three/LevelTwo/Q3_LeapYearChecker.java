package Assignment.Three.LevelTwo;

import java.util.Scanner;

// Write a program that takes a year as input and outputs the Year is a Leap Year or not.
// The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar.
// A leap year is divisible by 4 and not divisible by 100 unless it is also divisible by 400.
class Q3_LeapYearChecker {

    public boolean isLeapYear(int year) {
        if (year < 1582) {
            return false;
        }
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year (e.g., 2024): ");
        int inputYear = scanner.nextInt();

        Q3_LeapYearChecker checker = new Q3_LeapYearChecker();

        if (inputYear < 1582) {
            System.out.println("The leap year rules apply for years 1582 and later.");
        } else {
            boolean isLeap = checker.isLeapYear(inputYear);
            if (isLeap) {
                System.out.println(inputYear + " is a Leap Year.");
            } else {
                System.out.println(inputYear + " is not a Leap Year.");
            }
        }
        scanner.close();
    }
}