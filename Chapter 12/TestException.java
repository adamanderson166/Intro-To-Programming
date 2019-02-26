/*
Author: Adam Anderson
Date: 2/20/2018
This program creates an array with 100 randomly chosen integers. Then the program prompts the user to enter
the index of the array, then displays the corresnding element value.
*/

import java.util.Scanner;

public class TestException {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean continueInput = true;	
		int[] intsRandom = new int[100];
		for (int i = 0; i < intsRandom.length; i++) {
			intsRandom[i] = (int)(Math.random() * 10);
		}
		do {
			try {
				System.out.print("Enter an index of the array: ");
				int userChoice = input.nextInt();
				System.out.println("The array at index " + userChoice + " is equal to " + intsRandom[userChoice]);
				continueInput = false;
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Out of Bounds");
			}
		}	while (continueInput);	
	}
}