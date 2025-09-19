package Assignment.staticFinal;

// Sample Program 7: Hospital Management System

class Patient {
    static String hospitalName = "Apollo Hospital";
    static int totalPatients = 0;

    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    // Constructor
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    // Static method
    public static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }
}

class HospitalSystem {
    public static void main(String[] args) {
        Patient p1 = new Patient(1, "John Doe", 30, "Fever");
        Patient p2 = new Patient(2, "Jane Smith", 45, "Diabetes");

        p1.displayPatientDetails();
        System.out.println();
        p2.displayPatientDetails();

        Patient.getTotalPatients();
    }
}
