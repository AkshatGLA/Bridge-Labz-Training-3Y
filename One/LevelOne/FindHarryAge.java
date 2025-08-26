package Assignment.One.LevelOne;

/*
 * Program 1: Find the age of Harry if the birth year is 2000.
 * Assume the Current Year is 2024.
 * Input: None
 * Output: Harry's age in 2024 is ___
 */
class FindHarryAge {
    public static void main(String[] args) {
        int birthYear = 2000;
        int currentYear = 2024;
        int age = currentYear - birthYear;

        System.out.println("Harry's age in " + currentYear + " is " + age);
    }
}
