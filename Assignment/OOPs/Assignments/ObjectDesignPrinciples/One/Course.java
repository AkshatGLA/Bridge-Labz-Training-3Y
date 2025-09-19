package Assignment.OOPs.Assignments.ObjectDesignPrinciples.One;

// Problem 1: School and Students with Courses (Association + Aggregation)

import java.util.*;

class Course {
    private String courseName;
    private List<Student> enrolledStudents = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void displayCourse() {
        System.out.println("Course: " + courseName);
        for (Student s : enrolledStudents) {
            System.out.println(" - " + s.getName());
        }
    }
}

class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enroll(Course course) {
        courses.add(course);
        course.addStudent(this); // Two-way association
    }

    public String getName() {
        return name;
    }

    public void displayStudent() {
        System.out.println("Student: " + name);
        for (Course c : courses) {
            System.out.println(" - Enrolled in: " + c);
        }
    }
}

class School {
    private String schoolName;
    private List<Student> students = new ArrayList<>();

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displaySchool() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}

class SchoolDemo {
    public static void main(String[] args) {
        School school = new School("GLA Public School");

        Student s1 = new Student("Akshat");
        Student s2 = new Student("Dhruv");

        Course c1 = new Course("Maths");
        Course c2 = new Course("Science");

        s1.enroll(c1);
        s2.enroll(c1);
        s2.enroll(c2);

        school.addStudent(s1);
        school.addStudent(s2);

        school.displaySchool();
        c1.displayCourse();
        c2.displayCourse();
    }
}
