package Assignment.Four.BuilInFunctions;

import java.util.Scanner;

// Write a Java program to find the most frequent character in a string.
class Q9_MostFrequentCharFinder {

    public char findMostFrequentChar(String text) {
        if (text == null || text.isEmpty()) {
            return '\0';
        }
        int[] frequency = new int[256];
        for (char ch : text.toCharArray()) {
            frequency[ch]++;
        }

        int maxFrequency = -1;
        char mostFrequent = ' ';
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > maxFrequency) {
                maxFrequency = frequency[i];
                mostFrequent = (char) i;
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        Q9_MostFrequentCharFinder finder = new Q9_MostFrequentCharFinder();
        char resultChar = finder.findMostFrequentChar(userInput);

        if (resultChar != '\0') {
            System.out.println("Most Frequent Character: '" + resultChar + "'");
        } else {
            System.out.println("The input string is empty.");
        }

        scanner.close();
    }
}
