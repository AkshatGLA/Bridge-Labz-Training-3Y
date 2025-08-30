package Assignment.Three.LevelTwo;

import java.util.Scanner;

// Write a program to take user input for the age of all 10 students in a class and check
// whether the student can vote depending on his/her age is greater or equal to 18.
class Q7_StudentVoteChecker {

    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        final int NUMBER_OF_STUDENTS = 10;
        int[] studentAges = new int[NUMBER_OF_STUDENTS];

        Scanner scanner = new Scanner(System.in);
        Q7_StudentVoteChecker checker = new Q7_StudentVoteChecker();

        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        System.out.println("\n--- Voting Eligibility Results ---");
        for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
            boolean canVote = checker.canStudentVote(studentAges[i]);
            System.out.print("Student " + (i + 1) + " (Age: " + studentAges[i] + ") can vote: " + canVote);
            if(studentAges[i] < 0){
                System.out.print(" (Invalid age)");
            }
            System.out.println();
        }
        scanner.close();
    }
}