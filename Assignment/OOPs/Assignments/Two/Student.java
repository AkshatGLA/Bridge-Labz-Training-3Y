package Assignment.OOPs.Assignments.Two;
/**
 * Access Modifiers - Problem 1: University Management System
 * Create a Student class with:
 * rollNumber (public).
 * name (protected).
 * CGPA (private).
 * Write methods to access and modify CGPA using public methods.
 */
public class Student {
    // Accessible from anywhere
    public String rollNumber;

    // Accessible within the same package and by subclasses
    protected String name;

    // Accessible only within this class
    private double cgpa;

    public Student(String rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public getter for CGPA to provide read-only access
    public double getCgpa() {
        return this.cgpa;
    }

    // Public setter for CGPA to provide controlled write access
    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA. It must be between 0.0 and 4.0.");
        }
    }

    public void displayStudentInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }

    public static void main(String[] args) {
        Student student = new Student("S101", "David", 3.8);

        // Accessing public member directly
        System.out.println("Public Roll Number: " + student.rollNumber);

        // Accessing protected member (since we are in the same file/package for demo)
        System.out.println("Protected Name: " + student.name);

        // Cannot access private member directly:
        // System.out.println(student.cgpa); // This would cause a compile error

        // Accessing private member via public getter
        System.out.println("CGPA via getter: " + student.getCgpa());

        // Modifying private member via public setter
        student.setCgpa(3.9);
        System.out.println("Updated CGPA via setter: " + student.getCgpa());
    }
}
