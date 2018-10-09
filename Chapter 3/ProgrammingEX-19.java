/*
Author: Adam Anderson
Date: 10/9/2018
This program reads three edges for a triangle and computes the perimeter if the input is valid. Otherwise, it displays that the input is invalid. The input is valid if the sum of every pair of two edges is greater than the remaining edge.
*/

import java.util.Scanner;

class ThreeEdgeTriangleReader {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Edge 1 =");
		double edge1 = input.nextDouble();
		System.out.print("Edge 2 =");
		double edge2 = input.nextDouble();
		System.out.print("Edge 3 =");
		double edge3 = input.nextDouble();
		
		if ((edge1 + edge2 > edge3) || (edge2 + edge3 > edge1) || (edge3 + edge1 > edge2)){
			System.out.print("Input is valid");
		}
			else if ((edge1 + edge2 < edge3) || (edge2 + edge3 < edge1) || (edge3 + edge1 < edge2)){
					System.out.print("Input is invalid");
		}
		
		
		
		input.close();
		
	}
}