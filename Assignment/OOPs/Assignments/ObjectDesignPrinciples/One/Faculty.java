package Assignment.OOPs.Assignments.ObjectDesignPrinciples.One;

// Problem 2: University with Faculties and Departments (Composition + Aggregation)

import java.util.*;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void displayFaculty() {
        System.out.println("Faculty: " + name);
    }
}

class DepartmentUni {
    private String deptName;

    public DepartmentUni(String deptName) {
        this.deptName = deptName;
    }

    public void displayDepartment() {
        System.out.println("Department: " + deptName);
    }
}

class University {
    private String uniName;
    private List<DepartmentUni> departments = new ArrayList<>();
    private List<Faculty> faculties = new ArrayList<>();

    public University(String uniName) {
        this.uniName = uniName;
    }

    public void addDepartment(DepartmentUni dept) {
        departments.add(dept);
    }

    public void addFaculty(Faculty f) {
        faculties.add(f);
    }

    public void displayUniversity() {
        System.out.println("University: " + uniName);
        for (DepartmentUni d : departments) d.displayDepartment();
        for (Faculty f : faculties) f.displayFaculty();
    }
}

class UniversityDemo {
    public static void main(String[] args) {
        University uni = new University("Delhi University");

        uni.addDepartment(new DepartmentUni("Computer Science"));
        uni.addDepartment(new DepartmentUni("Physics"));

        uni.addFaculty(new Faculty("Dr. Sharma"));
        uni.addFaculty(new Faculty("Dr. Mehta"));

        uni.displayUniversity();
    }
}
