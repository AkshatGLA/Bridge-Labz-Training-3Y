package Assignment.staticFinal;

// Sample Program 1: Bank Account System
// Demonstrates static, this, final, and instanceof usage.

class BankAccount {
    // Static variable shared by all accounts
    static String bankName = "Reserve Bank of India";
    static int totalAccounts = 0;

    // Final variable for unique account number (cannot be changed)
    private final int accountNumber;
    private String accountHolderName;

    // Constructor using 'this' to resolve ambiguity
    public BankAccount(int accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        totalAccounts++;
    }

    // Static method
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Display details (with instanceof check)
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
        }
    }
}

class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "Akshat Somani");
        BankAccount acc2 = new BankAccount(102, "Sujal Singh");

        acc1.displayAccountDetails();
        System.out.println();
        acc2.displayAccountDetails();

        BankAccount.getTotalAccounts();
    }
}
