class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Warning: Initial balance cannot be negative. Setting to 0.0.");
            this.balance = 0.0;
        }
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.trim().isEmpty()) {
            this.accountHolder = accountHolder;
        } else {
            System.out.println("Error: Account holder name cannot be empty or null.");
        }
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && !accountNumber.trim().isEmpty()) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Error: Account number cannot be empty or null.");
        }
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.printf("Successfully deposited $%.2f. New balance: $%.2f%n", amount, this.balance);
        } else {
            System.out.println("Deposit failed: Amount must be positive.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal failed: Amount must be positive.");
            return false;
        }
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.printf("Successfully withdrew $%.2f. New balance: $%.2f%n", amount, this.balance);
            return true;
        } else {
            System.out.printf("Withdrawal failed: Insufficient funds. Current balance: $%.2f, Requested: $%.2f%n", this.balance, amount);
            return false;
        }
    }

    public void displayAccountInfo() {
        System.out.println("\n--- Bank Account Details ---");
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.printf("Balance: $%.2f%n", getBalance());
        System.out.println("---------------------------\n");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Demonstrating BankAccount Class with Encapsulation\n");

        BankAccount myAccount = new BankAccount("Joy", "123456789", 1000.00);

        myAccount.displayAccountInfo();

        System.out.println("Performing operations on myAccount:");
        myAccount.deposit(500.00);
        myAccount.deposit(-100.00);
        myAccount.withdraw(200.00);
        myAccount.withdraw(1500.00);
        myAccount.withdraw(0.0);

        myAccount.displayAccountInfo();

        BankAccount savingsAccount = new BankAccount("Jony", "987654321", 5000.00);
        savingsAccount.displayAccountInfo();

        System.out.println("Attempting to change account holder for savingsAccount:");
        savingsAccount.setAccountHolder("Jony");
        savingsAccount.displayAccountInfo();

        System.out.println("Attempting to set invalid details for a new account:");
        BankAccount tempAccount = new BankAccount(null, "", 0.0);
        tempAccount.displayAccountInfo();
        tempAccount.setAccountHolder("Temp User");
        tempAccount.setAccountNumber("ACC999");
        tempAccount.deposit(50.00);
        tempAccount.displayAccountInfo();
    }
}
