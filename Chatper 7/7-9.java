/*

Author: Adam Anderson
Date: 11/29/2018
This method finds the smallest element in an array of double values...
*/

import java.util.Scanner;

class MethodSmallNumberFinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers separated by a space: ");
		double[] num = new double[10];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = input.nextDouble();
		}
		System.out.println("Min number is: " + min(num));
	}
	
	public static double min(double[] array) {
		double min = array[0];
		for (int i = 1; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		
		}
		return min;	
	}
}