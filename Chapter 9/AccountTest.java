class AccountTest {
	public static void main(String[] args) {
		Account account = new Account(1122, 20000);
		
		account.withdraw(2500);
		account.deposit(3000);
		
		System.out.println("The balance is:" + account.getBalance());
		System.out.println("The date this account was created is:" + account.getDateCreated());
		System.out.println("The monthly interest rate is:" + account.getMonthlyInterestRate());
	}
}