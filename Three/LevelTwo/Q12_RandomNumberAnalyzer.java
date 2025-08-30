package Assignment.Three.LevelTwo;

import java.util.Arrays;

// Write a program that generates five 4-digit random values and then finds their average value,
// and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().
class Q12_RandomNumberAnalyzer {

    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000;
        }
        return randomNumbers;
    }

    public double[] findAverageMinMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new double[0];
        }

        long sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        final int ARRAY_SIZE = 5;
        Q12_RandomNumberAnalyzer analyzer = new Q12_RandomNumberAnalyzer();

        int[] generatedNumbers = analyzer.generate4DigitRandomArray(ARRAY_SIZE);
        System.out.println("Generated Random Numbers: " + Arrays.toString(generatedNumbers));

        double[] results = analyzer.findAverageMinMax(generatedNumbers);

        if (results.length == 3) {
            double averageValue = results[0];
            int minValue = (int) results[1];
            int maxValue = (int) results[2];

            System.out.printf("Average Value: %.2f\n", averageValue);
            System.out.println("Minimum Value: " + minValue);
            System.out.println("Maximum Value: " + maxValue);
        }
    }
}