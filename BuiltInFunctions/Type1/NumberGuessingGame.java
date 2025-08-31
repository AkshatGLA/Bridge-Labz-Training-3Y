package Assignment.BuiltInFunctions.Type1;

/*
Problem Statement:
Number Guessing Game:
- Write a Java program where the user thinks of a number between 1 and 100,
  and the computer tries to guess the number by generating random guesses.
- The user provides feedback: "high", "low", or "correct".
- The program should be modular with different functions.
*/

import java.util.*;

public class NumberGuessingGame {
    static Random rand = new Random();

    public static int generateGuess(int low, int high) {
        return rand.nextInt(high - low + 1) + low;
    }

    public static String getFeedback(Scanner sc) {
        System.out.print("Enter feedback (high/low/correct): ");
        return sc.next().toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100, guess;
        String feedback = "";

        System.out.println("Think of a number between 1 and 100...");

        while (!feedback.equals("correct")) {
            guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);
            feedback = getFeedback(sc);

            if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("correct")) {
                System.out.println("Yay! Computer guessed it!");
            } else {
                System.out.println("Invalid feedback! Use high/low/correct.");
            }
        }
        sc.close();
    }
}

