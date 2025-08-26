// File: BooleanLogicExample.java
// Demonstrates boolean expressions and logical operators
public class BooleanLogicExample {
    public static void main(String[] args) {
        int a = 10, b = 20;

        boolean result1 = (a < b);        // true
        boolean result2 = (a == b);       // false
        boolean result3 = (a < b && b > 5); // true
        boolean result4 = (a > b || b > 5); // true

        System.out.println("a < b: " + result1);
        System.out.println("a == b: " + result2);
        System.out.println("a < b && b > 5: " + result3);
        System.out.println("a > b || b > 5: " + result4);
    }
}
