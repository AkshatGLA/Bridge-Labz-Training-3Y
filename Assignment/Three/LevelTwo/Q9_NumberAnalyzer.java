package Assignment.Three.LevelTwo;

import java.util.Scanner;

// Write a program to take user input for 5 numbers and check whether a number is positive or negative.
// For positive numbers check if the number is even or odd. Finally compare the first and last
// elements of the array and display if they are equal, greater, or less.
class Q9_NumberAnalyzer {

    public boolean isPositive(int number) {
        return number >= 0;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int compareNumbers(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        final int ARRAY_SIZE = 5;
        int[] numbers = new int[ARRAY_SIZE];
        Scanner scanner = new Scanner(System.in);
        Q9_NumberAnalyzer analyzer = new Q9_NumberAnalyzer();

        System.out.println("Please enter " + ARRAY_SIZE + " numbers.");
        for (int i = 0; i < ARRAY_SIZE; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\n--- Number Analysis ---");
        for (int number : numbers) {
            if (analyzer.isPositive(number)) {
                System.out.print(number + " is Positive");
                if (analyzer.isEven(number)) {
                    System.out.println(" and Even.");
                } else {
                    System.out.println(" and Odd.");
                }
            } else {
                System.out.println(number + " is Negative.");
            }
        }

        System.out.println("\n--- First and Last Element Comparison ---");
        int firstElement = numbers[0];
        int lastElement = numbers[ARRAY_SIZE - 1];
        int comparisonResult = analyzer.compareNumbers(firstElement, lastElement);

        switch(comparisonResult) {
            case 1:
                System.out.println("The first element (" + firstElement + ") is GREATER THAN the last element (" + lastElement + ").");
                break;
            case 0:
                System.out.println("The first element (" + firstElement + ") is EQUAL TO the last element (" + lastElement + ").");
                break;
            case -1:
                System.out.println("The first element (" + firstElement + ") is LESS THAN the last element (" + lastElement + ").");
                break;
        }
        scanner.close();
    }
}