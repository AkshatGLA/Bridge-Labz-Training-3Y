package Assignment.staticFinal;

// Sample Program 5: University Student Management

class Student {
    static String universityName = "GLA University";
    static int totalStudents = 0;

    private final int rollNumber;
    private String name;
    private String grade;

    // Constructor
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }
}

class UniversitySystem {
    public static void main(String[] args) {
        Student stu1 = new Student(101, "Dhruv Tiwari", "A");
        Student stu2 = new Student(102, "Akshat Somani", "A+");

        stu1.displayStudentDetails();
        System.out.println();
        stu2.displayStudentDetails();

        Student.displayTotalStudents();
    }
}
