package Assignment.Four.BuilInFunctions;

import java.util.Scanner;

// Write a Java program to compare two strings lexicographically without using built-in compare methods.
class Q8_StringComparator {

    public int compareStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.charAt(i) - str2.charAt(i);
            }
        }
        return str1.length() - str2.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        Q8_StringComparator comparator = new Q8_StringComparator();
        int result = comparator.compareStrings(firstString, secondString);

        if (result < 0) {
            System.out.println("'" + firstString + "' comes before '" + secondString + "' in lexicographical order.");
        } else if (result > 0) {
            System.out.println("'" + secondString + "' comes before '" + firstString + "' in lexicographical order.");
        } else {
            System.out.println("The two strings are equal.");
        }

        scanner.close();
    }
}
