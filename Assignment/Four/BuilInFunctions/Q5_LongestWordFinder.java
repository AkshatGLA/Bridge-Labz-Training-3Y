package Assignment.Four.BuilInFunctions;

import java.util.Scanner;

// Write a Java program that takes a sentence as input and returns the longest word.
class Q5_LongestWordFinder {

    public String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";

        if (words.length > 0) {
            longestWord = words[0];
        }

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String userInputSentence = scanner.nextLine();

        Q5_LongestWordFinder finder = new Q5_LongestWordFinder();
        String resultWord = finder.findLongestWord(userInputSentence);

        System.out.println("The longest word in the sentence is: '" + resultWord + "'");

        scanner.close();
    }
}
