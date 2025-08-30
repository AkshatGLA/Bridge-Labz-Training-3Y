package Assignment.Three.LevelTwo;

import java.util.Scanner;

// Write a program to find the sum of n natural numbers using recursive method and compare the result
// with the formulae n*(n+1)/2 and show the result from both computations is correct.
class Q2_NaturalNumberSum {

    public long calculateSumRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return n + calculateSumRecursive(n - 1);
    }

    public long calculateSumWithFormula(int n) {
        return (long) n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (n): ");
        int numberN = scanner.nextInt();

        if (numberN <= 0) {
            System.out.println("Error: Please enter a natural number (greater than 0).");
        } else {
            Q2_NaturalNumberSum summer = new Q2_NaturalNumberSum();

            long sumFromRecursion = summer.calculateSumRecursive(numberN);
            System.out.println("Sum using recursion: " + sumFromRecursion);

            long sumFromFormula = summer.calculateSumWithFormula(numberN);
            System.out.println("Sum using formula n*(n+1)/2: " + sumFromFormula);

            if (sumFromRecursion == sumFromFormula) {
                System.out.println("\nBoth results are correct and equal.");
            } else {
                System.out.println("\nThere is a discrepancy in the results.");
            }
        }
        scanner.close();
    }
}