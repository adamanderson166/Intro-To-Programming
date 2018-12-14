/*

Author: Adam Anderson
Date: 12/12/2018
This program asks the user to input a number, and outputs a corresponding matrix...
*/

import java.util.Scanner;

class MatrixPrinter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 511: ");
		int n = input.nextInt();
		char[] binaryStore = toBinaryChars(n);
		printMatrix(binaryStore);
	}
	
	public static void printMatrix(char[] num) {
		for (int a = 0; a < num.length; a++){
			if(num[a] == '1') {
				System.out.print("T ");
			}
			else {
				System.out.print("H ");
			}
			if((a + 1) % 3 == 0) {
				System.out.println();
			}
		}
	}
	
	public static char[] toBinaryChars(int num) {
		char[] result = new char[9];
		int index = 8;
		while (num != 0) {
			if(num % 2 == 0) {
				result[index]= '0';
			}
			else {
				result[index]= '1';
			}
			num /= 2;
			index--;
		}
		for(int i = index; i >= 0; i--) {
			result[i] = '0';
		}
		return result;
	}	
}