/*
Author: Adam Anderson
Date: 2/1/2018
This program creates 10 distinct arrays and uses an object to populate a variety of variables.
*/

import java.util.Scanner;



class AccountTest {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	
		Account[] atm = new Account[10];
		
		for(int i = 0; i < 10; i++) {
			atm[i] = new Account(i, 100);
		}
		
		System.out.println("Enter an id: ");
		int choice1 = input.nextInt();
		
			if ( choice1 == 0 || choice1 == 1 || choice1 == 2 || choice1 == 3 || choice1 == 4 || choice1 == 5 || choice1 == 6 || choice1 == 7 || choice1 == 8 || choice1 == 9) {
				
				System.out.println("Main menu");
				System.out.println("1: check balance");
				System.out.println("2: withdraw");
				System.out.println("3: deposit");
				System.out.println("4: exit");
				int choice2 = input.nextInt();
				
				while (choice2 != 4) {
				
					if (choice2 == 1) {
						System.out.println("The balance is: " + atm[choice1].getBalance());
						
					}
					
					else if (choice2 == 2) {
						System.out.print("Enter an amount to withdraw: ");
						double withdrawAmount = input.nextDouble();
						atm[choice1].withdraw(withdrawAmount);
						
					}
					
					else if (choice2 == 3) {
						
						System.out.println("Enter an amount to deposit: ");
						double depositAmount = input.nextDouble();
						atm[choice1].deposit(depositAmount);
						
						
					}
					System.out.println("\nMain menu");
					System.out.println("1: check balance");
					System.out.println("2: withdraw");
					System.out.println("3: deposit");
					System.out.println("4: exit");
					choice2 = input.nextInt();
				}
			}
			
			else {
				System.out.println("Enter Correct id: ");
			}
			
	}
}