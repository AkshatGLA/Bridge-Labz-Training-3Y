// File: BreakContinueExample.java
// Demonstrates break and continue in loops
public class BreakContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                continue; // skips 3
            }
            if (i == 7) {
                break; // stops loop at 7
            }
            System.out.print(i + " ");
        }
    }
}
