/*
Author: Adam Anderson
Date: 11/13/2018
The method returns a string for the number with one or more prefix 0s....
*/

import java.util.Scanner;


class NumberWidthMethod {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = input.nextInt();
		System.out.println("Enter width: ");
		int width = input.nextInt();
		String output = format(number, width);
		System.out.println(output);	
	}
	
		public static String format(int number, int width) {
		String s = "";
		for (int a = 0; a < width - lengthnumber(number); a++) {
			s += "0";
			}
			s += number;
			return s;
		}
		
		public static int lengthnumber(int number){
			int lengthnumber = 0;
			while (number != 0) {
				number = number / 10;
				lengthnumber += 1;	
			}
			return lengthnumber;	
		}
	
	
}