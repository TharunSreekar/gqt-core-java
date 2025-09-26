package gqt375;
/**
 * @author tharun
 */
abstract class BankAccount1 {
	protected double balance;
	public BankAccount1(double balance) {
		this.balance = balance;
	}
	abstract void deposit(double amount);
	abstract void withdraw(double amount);
}
class SavingsAccount extends BankAccount1 {
	public SavingsAccount(double balance) {
		super(balance);
	}
	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited " + amount + " in Savings Account. New Balance: " + balance);
	}
	@Override
	public void withdraw(double amount) {
		if (balance - amount >= 500) {
			balance -= amount;
			System.out.println("Withdrawn " + amount + " from Savings Account. New Balance: " + balance);
		} else {
			System.out.println("Insufficient balance in Savings Account.");
		}
	}
}
class CurrentAccount extends BankAccount1 {
	private double overdraftLimit = 1000;
	public CurrentAccount(double balance) {
		super(balance);
	}
	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited " + amount + " in Current Account. New Balance: " + balance);
	}
	@Override
	public void withdraw(double amount) {
		if (balance + overdraftLimit >= amount) {
			balance -= amount;
			System.out.println("Withdrawn " + amount + " from Current Account. New Balance: " + balance);
		} else {
			System.out.println("Overdraft limit reached in Current Account.");
		}
	}
}
public class Program210 {
	public static void main(String[] args) {
		SavingsAccount savingsAccount = new SavingsAccount(1000.0);
		CurrentAccount currentAccount = new CurrentAccount(2000.0);
		savingsAccount.deposit(500.0);
		savingsAccount.withdraw(200.0);
		savingsAccount.withdraw(1500.0);
		currentAccount.deposit(1000.0);
		currentAccount.withdraw(2500.0);
		currentAccount.withdraw(500.0);
	}}