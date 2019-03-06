import java.util.Scanner;

public class TestTriangle {
	public static void main (String[] args) {
	Scanner input = new Scanner(System.in);	
		
		
		System.out.print("Enter side 1 of the triangle: ");
		Double side1 = input.nextDouble();
		
		System.out.print("Enter side 2 of the triangle: ");
		Double side2 = input.nextDouble();
		
		System.out.print("Enter side 3 of the triangle: ");
		Double side3 = input.nextDouble();
		
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