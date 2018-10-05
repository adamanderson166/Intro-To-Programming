/*
Author: Adam Anderson
Date: 10/4/2018
This program will convert degrees in celsius to degrees in fahrenheit:
*/

import java.util.Scanner;

class CelsiustoFahrenheit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter degrees in celsius: ");
		double celsius = input.nextDouble();
		double fahrenheit = (9.0 / 5.0) * celsius + 32;
		
		System.out.print("Fahrenheit in degrees = " + fahrenheit);
		
		input.close();
		
			
			
		}
		
		
}