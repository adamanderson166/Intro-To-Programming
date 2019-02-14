/*
Author: Adam Anderson
Date: 2/14/2018
This program creates a Savings Account that extends from the Account parent class
*/
	
	public class SavingsAccount extends Account {
		
		public SavingsAccount() {
			super();
		}
		
		public SavingsAccount(int id, double balance) {
			super(id, balance);
		}
		
		public SavingsAccount(int id, double balance, double annualInterestRate) {
			super(id, balance, annualInterestRate);
		}
		
		@Override
		public void withdraw(double amount) {
			if (amount > getBalance()) {
				System.out.print("Your account has an overdrawn limit!");
			}
			
			else {
				super.withdraw(amount);
			}
		}

}