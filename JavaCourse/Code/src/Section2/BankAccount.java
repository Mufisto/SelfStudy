package Section2;

// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.

public class BankAccount {

    // FIELDS ...
    private int number, phoneNumber;
    private double balance;
    private String customerName, email;
    // ... FIELDS

    // METHODS ...
    public void deposit(double funds) {
        balance += funds;
        System.out.println("Your new balance is: " + balance);
    }

    public void withdraw(double funds) {
        if ((balance - funds) > 0) {
            balance -= funds;
            System.out.println("Your new balance is: " + balance);
        } else {
            System.out.println("Insufficient Funds!");
        }

    }
    // ... METHODS

    // CONSTRUCTORS ...
    public BankAccount() {
        customerName = "";
        email = "";
        phoneNumber = -1;
        number = -1;
        balance = 0.0;
    }

    public BankAccount(String name, String email, int phoneNumber) {
        this.customerName = name;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }
    // ... CONSTRUCTORS

    // GETTERS and SETTERS ...
    public int getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    // ... GETTERS and SETTERS


    // MAIN ... 
    public static void main(String[] args) {

        BankAccount johhny = new BankAccount();

        
    }
    // ... MAIN
}
