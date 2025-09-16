package Assignment.OOPs.Assignments.Two;

/**
 * Level 1 Practice Program 3:
 * Create a Person class with a copy constructor that clones another person's attributes.
 */
public class Person_L1_P3 {
    private String name;
    private int age;

    // Parameterized constructor
    public Person_L1_P3(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person_L1_P3(Person_L1_P3 otherPerson) {
        this.name = otherPerson.name;
        this.age = otherPerson.age;
        System.out.println("Copy constructor called.");
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    public static void main(String[] args) {
        // Original Person object
        Person_L1_P3 person1 = new Person_L1_P3("Alice", 30);
        System.out.println("Original Person:");
        person1.displayDetails();
        System.out.println("--------------------");

        // Creating a new Person object by copying person1
        Person_L1_P3 person2 = new Person_L1_P3(person1);
        System.out.println("Copied Person:");
        person2.displayDetails();
    }
}
