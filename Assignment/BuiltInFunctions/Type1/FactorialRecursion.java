package Assignment.BuiltInFunctions.Type1;

/*
Problem Statement:
Factorial Using Recursion:
- Calculate factorial using recursion.
- Separate input, calculation, and output processes.
*/

import java.util.Scanner;

public class FactorialRecursion {
    public static long factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Factorial of " + n + " = " + factorial(n));
        sc.close();
    }
}

