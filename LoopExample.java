// File: LoopExample.java
// Demonstrates for and while loops
public class LoopExample {
    public static void main(String[] args) {
        System.out.println("For loop: 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nWhile loop: 5 down to 1");
        int n = 5;
        while (n >= 1) {
            System.out.print(n + " ");
            n--;
        }
    }
}
