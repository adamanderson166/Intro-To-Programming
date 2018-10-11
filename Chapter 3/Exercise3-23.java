/*
Author: Adam Anderson
Date: 10/9/2018
This program prompts the user to enter the points of a rectangle and check if they are within the bounds of a given rectangle”
*/

import java.util.Scanner;

class PointInRectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter x:");
		double x = input.nextDouble();
		System.out.println("Enter y: ");
		double y = input.nextDouble();
		double givenRectangleX = (10 / 2);
		double givenRectangleY = (5 / 2);
		
		if ((x <= givenRectangleX) && (y <= givenRectangleY)){
			System.out.println("Point (" + x + "," + y + ") is in the rectangle");
		}
		else {
			System.out.println("Point (" + x + "," + y + ") is not in the rectangle");
		}	
	
	
	input.close();
	}
}