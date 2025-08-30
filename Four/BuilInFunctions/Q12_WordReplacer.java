package Assignment.Four.BuilInFunctions;

import java.util.Scanner;

// Write a replace method in Java that replaces a given word with another word in a
// sentence:
class Q12_WordReplacer {

    public String replaceWord(String sentence, String wordToFind, String replacementWord) {
        return sentence.replaceAll(wordToFind, replacementWord);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String originalSentence = scanner.nextLine();
        System.out.print("Enter the word to replace: ");
        String targetWord = scanner.nextLine();
        System.out.print("Enter the replacement word: ");
        String newWord = scanner.nextLine();

        Q12_WordReplacer replacer = new Q12_WordReplacer();
        String newSentence = replacer.replaceWord(originalSentence, targetWord, newWord);

        System.out.println("Original Sentence: " + originalSentence);
        System.out.println("New Sentence: " + newSentence);

        scanner.close();
    }
}

