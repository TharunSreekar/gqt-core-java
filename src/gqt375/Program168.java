package gqt375;
/**
 * @author tharun
 */
class Program04 {
    private int accountNumber;
    private double balance;

    public Program04(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}

public class Program168 {
    public static void main(String[] args) {
        Program04 account = new Program04(12345, 1000.0);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());
        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}

