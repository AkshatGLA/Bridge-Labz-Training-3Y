package Assignment.BuiltInFunctions.Type1;

/*
Problem Statement:
Palindrome Checker:
- Check if a given string is a palindrome.
- Break into functions for input, checking, and displaying result.
*/

import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("\\s+", "");
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println(isPalindrome(str) ? "Palindrome" : "Not a Palindrome");
        sc.close();
    }
}

