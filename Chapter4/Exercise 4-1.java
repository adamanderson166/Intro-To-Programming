/*
Author: Adam Anderson
Date: 10/11/2018
This program prompts the user to enter the length from the center of a pentagon to a vertex and computes the area of the pentagon.
*/

import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length from the cetner to the vertex:");
		double r = input.nextDouble();
		
		double side = (2 * r) * Math.sin(Math.PI / 5);
		double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
		
		System.out.printf("The area of the pentagon is %.2f", area);
		
	input.close();
		
	}
}