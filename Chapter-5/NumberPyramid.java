/*
Author: Adam Anderson
Date: 10/16/2018
This program prompts the user to enter an integer from 1 to 15 and displays a pyramid...
*/

import java.util.Scanner;

class NumberPyramid {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int number = input.nextInt();
		
		if (number < 1 || number > 15) {
			System.out.print("Number is not valid");
		}
		else {
			for (int i = 1; i <= number; i++) {
				for (int space = 1; space <= number - i; space++){
					System.out.print("   ");
				}
				
				for (int left = i; left >=1; left--){
					if (left > 9){
						System.out.print(" " + left);
					}
					else {
						System.out.print("  " + left);
					}
				}
				for (int right = 2; right <= i; right++){
					if (right > 9){
						System.out.print(" " + right);
					}
					else {
						System.out.print("  " + right);
					}
				
				}
				System.out.println();
			}
		}
		input.close();
	}
}