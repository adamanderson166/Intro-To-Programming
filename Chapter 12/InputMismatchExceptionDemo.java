/*
Author: Adam Anderson
Date: 2/20/2018
This program has an exception handler that deals with nonnumeric operands; then write another program without using an exception handler to achieve the same objective. 
*/

import java.util.Scanner;
import java.util.*;

	public class InputMismatchExceptionDemo {
		public static void main(String[] args) {
			Scanner input = new Scanner (System.in);
			boolean continueInput = true;
			
			do {
				try {
					System.out.print("Enter two integers: ");
					int number1 = input.nextInt();
					int number2 = input.nextInt();
					
					System.out.println("The numbers entered are: " + number1 + " and " + number2);
					
					continueInput = false;
				}
				catch (InputMismatchException ex) {
					System.out.println("Try again, you're using the wrong operand type");
					input.nextLine();
				}
		} while (continueInput);
	}
}