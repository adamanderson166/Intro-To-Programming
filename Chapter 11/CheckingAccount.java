/*
Author: Adam Anderson
Date: 2/14/2018
This program creates a Checking Account that extends from the Account parent class
*/


public class CheckingAccount extends Account {
	
	public CheckingAccount() {
		super();
	}
	
	public CheckingAccount(int id, double balance) {
		super(id, balance);
	}
	
	public CheckingAccount(int id, double balance, double annualInterestRate) {
		super(id, balance, annualInterestRate);
	}
	
	@Override
	public void withdraw(double amount) {
		if (amount > (getBalance() - 500)) {
			System.out.print("Your account has an overdrawn limit!");
		}
		
		else {
			super.withdraw(amount);
		}
	}
	
		

}