/*
Author: Adam Anderson
Date: 1/9/2018
This program prints out the area of a rectangle using a class object.
*/

class Rectangle {
	
	double width = 1;
	double height = 1;
	
	public Rectangle() {
	}
	
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}

	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return (width * 2) + (height * 2);
	}
	
}