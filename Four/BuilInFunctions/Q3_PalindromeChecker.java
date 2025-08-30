package Assignment.Four.BuilInFunctions;

import java.util.Scanner;

// Write a Java program to check if a given string is a palindrome.
class Q3_PalindromeChecker {

    public boolean isPalindrome(String text) {
        int leftIndex = 0;
        int rightIndex = text.length() - 1;

        while (leftIndex < rightIndex) {
            if (text.charAt(leftIndex) != text.charAt(rightIndex)) {
                return false;
            }
            leftIndex++;
            rightIndex--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String userInput = scanner.nextLine();

        Q3_PalindromeChecker checker = new Q3_PalindromeChecker();
        boolean isPal = checker.isPalindrome(userInput);

        if (isPal) {
            System.out.println("The string '" + userInput + "' is a palindrome.");
        } else {
            System.out.println("The string '" + userInput + "' is not a palindrome.");
        }

        scanner.close();
    }
}
