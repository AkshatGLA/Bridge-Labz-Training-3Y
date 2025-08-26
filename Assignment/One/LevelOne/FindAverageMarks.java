package Assignment.One.LevelOne;

/*
 * Program 2: Sam’s marks in Maths, Physics, and Chemistry are 94, 95, 96.
 * Find the average percent mark in PCM.
 */
class FindAverageMarks {
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        double average = (maths + physics + chemistry) / 3.0;

        System.out.println("Sam’s average mark in PCM is " + average);
    }
}
