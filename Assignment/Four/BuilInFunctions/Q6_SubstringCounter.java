package Assignment.Four.BuilInFunctions;

import java.util.Scanner;

// Write a Java program to count how many times a given substring occurs in a string.
class Q6_SubstringCounter {

    public int countSubstringOccurrences(String mainString, String subString) {
        int count = 0;
        int lastIndex = 0;

        while (lastIndex != -1) {
            lastIndex = mainString.indexOf(subString, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex = lastIndex + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String text = scanner.nextLine();
        System.out.print("Enter the substring to find: ");
        String pattern = scanner.nextLine();

        Q6_SubstringCounter counter = new Q6_SubstringCounter();
        int occurrences = counter.countSubstringOccurrences(text, pattern);

        System.out.println("The substring '" + pattern + "' appears " + occurrences + " time(s).");

        scanner.close();
    }
}
