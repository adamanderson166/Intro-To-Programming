/*
Author: Adam Anderson
Date: 2/13/2018
This program creates a triangle class and geometric object class and constructs a triangle using the classes.
*/

import java.util.Scanner;


public class Triangle extends GeometricObject {
	Scanner input = new Scanner(System.in);

	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;

	public Triangle() {
		this(1,1,1);	
	}
	
	
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getside1() {
		return side1;
	}
	
	public double getside2() {
		return side2;
	}
	
	public double getside3() {
		return side3;
	}
	
	public double getArea() {
		return (Math.sqrt((side1 + side2 + side3) / 2));
	}
	
	public double getPerimeter() {
		return (side1 + side2 + side3);
	}
	
	public String toString() {
		return ("Triangle: side1 = " + side1 + " side 2 = " + side2 + " side 3 = " + side3);
	}

}