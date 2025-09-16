package Assignment.Four.BuilInFunctions;

import java.util.Scanner;

// Write a Java program to count the number of vowels and consonants in a given string.
class Q1_VowelConsonantCounter {

    public int[] countVowelsAndConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;
        String normalizedText = text.toLowerCase();

        for (int i = 0; i < normalizedText.length(); i++) {
            char ch = normalizedText.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        Q1_VowelConsonantCounter counter = new Q1_VowelConsonantCounter();
        int[] counts = counter.countVowelsAndConsonants(userInput);

        int vowels = counts[0];
        int consonants = counts[1];

        System.out.println("In the string '" + userInput + "':");
        System.out.println("Number of Vowels: " + vowels);
        System.out.println("Number of Consonants: " + consonants);

        scanner.close();
    }
}
