package Assignment.staticFinal;

// Sample Program 3: Employee Management System

class Employee {
    static String companyName = "TechCorp Pvt Ltd";
    static int totalEmployees = 0;

    private final int id;   // unique ID
    private String name;
    private String designation;

    // Constructor
    public Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }
}

class EmployeeSystem {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Utkarsh Maheshwari", "Developer");
        Employee emp2 = new Employee(2, "Pragati Agrawal", "Manager");

        emp1.displayEmployeeDetails();
        System.out.println();
        emp2.displayEmployeeDetails();

        Employee.displayTotalEmployees();
    }
}
