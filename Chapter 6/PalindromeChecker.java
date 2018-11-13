/*
	Author: Adam Anderson
	Date: 10/31/2018
	This program prompts the user to enter an integer and reports whether the integer is a palindrome...
	*/

import java.util.Scanner;
class PalindromeChecker {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter numbers: ");
		int number = input.nextInt();
		
		if (isPalindrome(number)){
			System.out.println(number + " is a palindrome");
		}
		else {
			System.out.println(number + " is not a palindrome");
		}
		input.close();
		
	}
		
	public static int reverse(int number) {
		int a = 0;
		do {
			int b = number % 10;
			a = a * 10 + b;
			number /= 10;
		} while (number != 0);
		return a;
	}
	
	public static boolean isPalindrome(int number){
		return (number == reverse(number));
	}
}