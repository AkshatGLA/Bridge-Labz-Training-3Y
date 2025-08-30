package Assignment.Three.LevelTwo;

import java.util.Scanner;

// An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members.
// Create a program to find the BMI and display the height, weight, BMI and status of each individual.
class Q10_BMICalculator {

    public void calculateAndStoreBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double weightInKg = personData[i][0];
            double heightInCm = personData[i][1];
            double heightInM = heightInCm / 100.0;
            double bmi = weightInKg / (heightInM * heightInM);
            personData[i][2] = bmi;
        }
    }

    public String[] determineBMIStatus(double[][] personData) {
        String[] statuses = new String[personData.length];
        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];
            if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 25) {
                statuses[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 30) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obesity";
            }
        }
        return statuses;
    }

    public static void main(String[] args) {
        final int TEAM_SIZE = 10;
        double[][] teamData = new double[TEAM_SIZE][3];
        Scanner scanner = new Scanner(System.in);
        Q10_BMICalculator calculator = new Q10_BMICalculator();

        for (int i = 0; i < TEAM_SIZE; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("  Enter weight (in kg): ");
            teamData[i][0] = scanner.nextDouble();
            System.out.print("  Enter height (in cm): ");
            teamData[i][1] = scanner.nextDouble();
        }

        calculator.calculateAndStoreBMI(teamData);
        String[] bmiStatuses = calculator.determineBMIStatus(teamData);

        System.out.println("\n----------------- BMI Report -----------------");
        System.out.printf("%-10s %-12s %-12s %-10s %-15s\n", "Person", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < TEAM_SIZE; i++) {
            System.out.printf("%-10d %-12.2f %-12.2f %-10.2f %-15s\n",
                    (i + 1), teamData[i][0], teamData[i][1], teamData[i][2], bmiStatuses[i]);
        }
        scanner.close();
    }
}