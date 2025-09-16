package Assignment.OOPs.Assignments.Two;

/**
 * Instance vs. Class Variables and Methods - Problem 2: Online Course Management
 * Design a Course class with:
 * Instance Variables: courseName, duration, fee.
 * Class Variable: instituteName (common for all courses).
 * Methods:
 * An instance method displayCourseDetails() to display the course details.
 * A class method updateInstituteName() to modify the institute name for all courses.
 */
public class Course {
    // Instance variables
    private String courseName;
    private int duration; // in hours
    private double fee;

    // Class variable
    private static String instituteName = "Default Tech Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName); // Can access static members
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Duration: " + this.duration + " hours");
        System.out.println("Fee: $" + this.fee);
    }

    // Class method
    public static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }

    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 80, 499.99);
        Course course2 = new Course("Python for Data Science", 120, 799.99);

        System.out.println("Initial Course Details:");
        course1.displayCourseDetails();
        System.out.println("--------------------");
        course2.displayCourseDetails();
        System.out.println("====================");

        // Update the institute name for all courses using the class method
        Course.updateInstituteName("Global Tech Academy");
        System.out.println("====================");

        System.out.println("Course Details after update:");
        course1.displayCourseDetails();
        System.out.println("--------------------");
        course2.displayCourseDetails();
    }
}
