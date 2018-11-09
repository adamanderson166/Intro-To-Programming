/*
Author: Adam Anderson
Date: 11/7/2018
This program prompts the user to enter n and displays an n-by-n matrix...
*/

import java.util.Scanner;

class MatrixPrinter {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter n: ");
	int n = input.nextInt();
	printMatrix(n);
	
	}

	
	public static void printMatrix(int n) {
		for (int a = 0; a < n; a++){
			for (int b = 0; b < n; b++){
				System.out.print(intRandom(0,1) + " ");
			}
			System.out.println();
		}
	}
	public static int intRandom(int lower, int upper) {
		return (int) (lower + Math.random() * (upper - lower + 1));
	}	
}