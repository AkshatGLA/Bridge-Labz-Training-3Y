package Assignment.One.LevelOne;

/*
 * Program 16: Maximum handshakes among N students.
 * Formula: (n * (n - 1)) / 2
 */
import java.util.Scanner;

class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = input.nextInt();

        int handshakes = (students * (students - 1)) / 2;

        System.out.println("The maximum number of possible handshakes is " + handshakes);
    }
}
