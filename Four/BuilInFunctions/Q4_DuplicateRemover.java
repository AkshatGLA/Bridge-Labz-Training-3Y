package Assignment.Four.BuilInFunctions;
import java.util.Scanner;

// Write a Java program to remove all duplicate characters from a given string.
class Q4_DuplicateRemover {

    public String removeDuplicates(String text) {
        String resultString = "";
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (resultString.indexOf(currentChar) < 0) {
                resultString = resultString + currentChar;
            }
        }
        return resultString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to remove duplicates from: ");
        String originalString = scanner.nextLine();

        Q4_DuplicateRemover remover = new Q4_DuplicateRemover();
        String modifiedString = remover.removeDuplicates(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("String after removing duplicates: " + modifiedString);

        scanner.close();
    }
}
