/*
Adam Anderson
4/1/2019
Write a recursive method that displays a string reversely on the console using the following header:
**/

import java.util.Scanner;

public class StringReversal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string: ");
		String stringValue = input.nextLine();
		
		reverseDisplay(stringValue);
	}
	
	public static void reverseDisplay(String stringValue) {
		if (stringValue.length() != 0) {
			System.out.print(stringValue.charAt(stringValue.length() - 1));
			reverseDisplay(stringValue.substring(0, stringValue.length() - 1));
		}
	}
	
}