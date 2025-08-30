package Assignment.Four.BuilInFunctions;

import java.util.Arrays;
import java.util.Scanner;

// Write a Java program that accepts two strings from the user and checks if the two
// strings are anagrams of each other (i.e., whether they contain the same characters in any
// order).
class Q11_AnagramChecker {

    public boolean areAnagrams(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        Q11_AnagramChecker checker = new Q11_AnagramChecker();
        boolean areTheyAnagrams = checker.areAnagrams(firstString, secondString);

        if (areTheyAnagrams) {
            System.out.println("'" + firstString + "' and '" + secondString + "' are anagrams.");
        } else {
            System.out.println("'" + firstString + "' and '" + secondString + "' are not anagrams.");
        }

        scanner.close();
    }
}

