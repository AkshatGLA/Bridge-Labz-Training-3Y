package Assignment.Three.LevelTwo;
import java.util.Scanner;
import java.util.Arrays;

// Create a program to find the factors of a number taken as user input, store the factors in an array, and display the factors.
// Also find the sum, sum of square of factors and product of the factors and display the results
class Q1_FactorCalculator {

    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    public long calculateSumOfFactors(int[] factors) {
        long sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public double calculateProductOfFactors(int[] factors) {
        double product = 1.0;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public long calculateSumOfSquaresOfFactors(int[] factors) {
        long sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factors: ");
        int userInputNumber = scanner.nextInt();

        Q1_FactorCalculator calculator = new Q1_FactorCalculator();

        int[] numberFactors = findFactors(userInputNumber);
        System.out.println("Factors of " + userInputNumber + " are: " + Arrays.toString(numberFactors));

        long sumOfFactors = calculator.calculateSumOfFactors(numberFactors);
        System.out.println("Sum of the factors: " + sumOfFactors);

        double productOfFactors = calculator.calculateProductOfFactors(numberFactors);
        System.out.println("Product of the factors: " + productOfFactors);

        long sumOfSquares = calculator.calculateSumOfSquaresOfFactors(numberFactors);
        System.out.println("Sum of the square of factors: " + sumOfSquares);

        scanner.close();
    }
}