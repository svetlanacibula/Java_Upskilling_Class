package Challenge_27;

public class BankAccount {
    private final String accountNumber;
    private double balance;
    private final AccountType type;

    public BankAccount(String accountNumber, double balance, AccountType type) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.type = type;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public AccountType getType() {
        return type;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", type=" + type +
                '}';
    }
}