/*
Author: Adam Anderson
Date: 2/13/2018
This program creates a triangle class and geometric object class and constructs a triangle using the classes.
*/

import java.util.Scanner;

class Exercise_11 {
	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);	
		
		
		System.out.print("Enter side 1 of the triangle: ");
		int side1 = input.nextInt();
		
		System.out.print("Enter side 2 of the triangle: ");
		int side2 = input.nextInt();
		
		System.out.print("Enter side 3 of the triangle: ");
		int side3 = input.nextInt();
		
		System.out.println("Enter the color of the triangle: ");
		String colorTriangle = input.next();
		
		System.out.println("Is the triangle filled? ");
		String colorFilled = input.next();
		
		Triangle triangle = new Triangle(side1, side2, side3);
		
		System.out.println("Your triangle " + triangle.toString());
		System.out.println("Your triangle's color is " + triangle.getColor());
		System.out.println("Your triangle's area is " + triangle.getArea());
		System.out.println("Your triangle's perimeter is " + triangle.getPerimeter());
		
	}
}