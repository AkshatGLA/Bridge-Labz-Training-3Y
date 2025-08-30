package Assignment.Four.BuilInFunctions;
import java.util.Scanner;

// Write a Java program to reverse a given string without using any built-in reverse functions.
class Q2_StringReverser {

    public String reverseString(String text) {
        String reversedString = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedString = reversedString + text.charAt(i);
        }
        return reversedString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String originalString = scanner.nextLine();

        Q2_StringReverser reverser = new Q2_StringReverser();
        String resultString = reverser.reverseString(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed String: " + resultString);

        scanner.close();
    }
}
