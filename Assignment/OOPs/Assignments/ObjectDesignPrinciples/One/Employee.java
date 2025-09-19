package Assignment.OOPs.Assignments.ObjectDesignPrinciples.One;

// Problem 3: Company and Departments (Composition)

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void displayEmployee() {
        System.out.println("Employee: " + name + " (" + role + ")");
    }
}

class Department {
    private String deptName;
    private List<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void displayDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee emp : employees) {
            emp.displayEmployee();
        }
    }
}

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    public void displayCompany() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.displayDepartment();
        }
    }
}

class CompanyDemo {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        Department d1 = new Department("IT");
        d1.addEmployee(new Employee("Sujal", "Developer"));
        d1.addEmployee(new Employee("Utkarsh", "Tester"));

        Department d2 = new Department("HR");
        d2.addEmployee(new Employee("Pragati", "HR Manager"));

        company.addDepartment(d1);
        company.addDepartment(d2);

        company.displayCompany();
    }
}
