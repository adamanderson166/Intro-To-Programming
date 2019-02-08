import java.util.ArrayList;
import java.util.Date;

public class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getId() {
		return this.id;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public Account() {
		dateCreated = new Date();
	}
	
	public Account(int id, double balance) {
		dateCreated = new Date();
		this.id = id;
		this.balance = balance;
	}
	
	public Account (int id, double balance, double annualInterestRate) {
		dateCreated = new Date();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	
	public double getMonthlyInterestRate() {
		return balance * ((annualInterestRate / 100) / 12);
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public Date getDateCreated() {
		return this.dateCreated;
	}
	
}