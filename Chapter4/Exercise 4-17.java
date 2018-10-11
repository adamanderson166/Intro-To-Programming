/*
Author: Adam Anderson
Date: 10/11/2018
This program prompts the user to enter a year and the first three letters of a month name (with the first letter in uppercase) and displays the number of days in the month.
*/

import java.util.Scanner;

class MonthAndYearFormula {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		double year = input.nextDouble();
		System.out.print("Enter a month: ");
		String month = input.next();
		
			if (year % 4 == 0 && year % 100 == 0 && year % 400) {
				System.out.print(month + year + "has 366 days");
			
				 (year % 100 ==0){ 
					System.out.print(month + year + "has 365 days");
				}
			else {
				System.out.print(month + year + "has 365 days")
			}
			
		
		input.close();
	}
}