package Assignment.Four.BuilInFunctions;

import java.util.Scanner;

// Write a Java program to remove all occurrences of a specific character from a string.
class Q10_CharacterRemover {

    public String removeCharacter(String text, char charToRemove) {
        String resultString = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != charToRemove) {
                resultString = resultString + text.charAt(i);
            }
        }
        return resultString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String originalString = scanner.nextLine();
        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        Q10_CharacterRemover remover = new Q10_CharacterRemover();
        String modifiedString = remover.removeCharacter(originalString, charToRemove);

        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);

        scanner.close();
    }
}
