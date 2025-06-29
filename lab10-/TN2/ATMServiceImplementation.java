// Interface for ATM services
interface ATMService {
    void withdraw(double amount);
    void deposit(double amount);
    double checkBalance();
}

// DBBL class implementing ATMService
class DBBL implements ATMService {
    private double balance;

    // Constructor
    public DBBL(double initialBalance) {
        this.balance = initialBalance;
    }

    // Implementation of withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
    }

    // Implementation of deposit method
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Implementation of checkBalance method
    @Override
    public double checkBalance() {
        return balance;
    }
}

// Main class to test the implementation
public class ATMServiceImplementation {
    public static void main(String[] args) {
        // Create instance with initial balance
        DBBL account = new DBBL(1000.0);

        // Test ATM operations
        System.out.println("Initial balance: " + account.checkBalance());
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(2000.0); // Should show error
        System.out.println("Final balance: " + account.checkBalance());
    }
}