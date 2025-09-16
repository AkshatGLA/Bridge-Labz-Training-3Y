package Assignment.Four.BuilInFunctions;

import java.util.Scanner;

// Write a Java program to toggle the case of each character in a given string.
class Q7_CaseToggler {

    public String toggleCase(String text) {
        String toggledString = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isUpperCase(ch)) {
                toggledString = toggledString + Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                toggledString = toggledString + Character.toUpperCase(ch);
            } else {
                toggledString = toggledString + ch;
            }
        }
        return toggledString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to toggle its case: ");
        String originalString = scanner.nextLine();

        Q7_CaseToggler toggler = new Q7_CaseToggler();
        String resultString = toggler.toggleCase(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Toggled Case String: " + resultString);

        scanner.close();
    }
}
