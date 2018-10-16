/*
Author: Adam Anderson
Date: 10/16/2018
This program prompts the user to enter a year and the first three letters of a month name (with the first letter in uppercase) and displays the number of days in the month.
*/

import java.util.Scanner;

class MonthAndYearFormula {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		System.out.print("Enter a month: ");
		String month = input.next();
		
			if (month.equals("Feb"))
			{
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					System.out.print("Feb " + year + " has 28 days");
				}
				else {
					System.out.print("Feb " + year + " has 29 days");
				}
			}
			
			else if (month == "Sep" || month == "Apr" || month == "Jun" || month == "Nov"){ 
					System.out.print(month + year + "has 30 days");
			}
			
			else {
				System.out.print(month + " " + year + " has 31 days");
			}
			
		
		input.close();
	}
}