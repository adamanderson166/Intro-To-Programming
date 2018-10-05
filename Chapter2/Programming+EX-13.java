/*
Author: Adam Anderson
Date: 10/3/2018
This program prompts a user to enter their monthly savings amount and displays the value after 6 months:
*/

import java.util.Scanner;

class monthlySavingsProgram {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your monthly saving amount: ");
		double investment = input.nextDouble();
		
		double interestRate = (0.00417);
		double value = 100 * (1 + interestRate);
		double savings = investment + value;
		
		double savingsMonthOne = value;
		double savingsMonthTwo = (100 + savingsMonthOne) * (1 + (0.00417));
		double savingsMonthThree = (100 + savingsMonthTwo) * (1 + (0.00417));
		double savingsMonthFour = (100 + savingsMonthThree) * (1 + (0.00417));
		double savingsMonthFive = (100 + savingsMonthFour) * (1 + (0.00417));
		double savingsMonthSix = (100 + savingsMonthFive) * (1 + (0.00417));
		
		System.out.println("Your savings after 6 months = " + savingsMonthSix);
		System.out.println("Your savings after 3 months = " + savingsMonthThree);
		input.close();
		
	}
}