package Assignment.OOPs.Assignments.ObjectDesignPrinciples.One;

// Problem 2: Bank and Account Holders (Association)

class Customer {
    private String name;
    private double balance;

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void viewBalance() {
        System.out.println(name + "'s Balance: ₹" + balance);
    }
}

class Bank {
    private String bankName;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void openAccount(Customer customer) {
        System.out.println("Account opened in " + bankName + " for " + customer);
    }

    public void showBankName() {
        System.out.println("Bank: " + bankName);
    }
}

class BankDemo {
    public static void main(String[] args) {
        Bank bank = new Bank("State Bank of India");

        Customer cust1 = new Customer("Akshat", 5000);
        Customer cust2 = new Customer("Pragati", 10000);

        bank.showBankName();
        cust1.viewBalance();
        cust2.viewBalance();
    }
}
