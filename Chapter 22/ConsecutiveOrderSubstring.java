/*
Adam Anderson
4/23/2019
(Maximum consecutive increasingly ordered substring ) Write a program that prompts the user to enter a string and displays the maximum consecutive increasingly ordered substring. Analyze the time complexity of your program.
*/

import java.util.Scanner;

class ConsecutiveOrderSubstring {
	public static void main(String[] args) {
		int stringMaxLength = 1;
		int stringMaxInd = 0;
		int stringLength = 1;
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your string: ");
		String entry = input.next();
		
		for (int i = 1; i < entry.length(); i++) {
			if (entry.charAt(i-1) <= entry.charAt(i)) {
				stringLength++;
			}
			else {
				stringLength = 1;
			}
			if(stringMaxLength < stringLength) {
				stringMaxLength = stringLength;
				stringMaxInd = i - stringMaxLength + 1;
			}
		}
		
		System.out.println("The maximum consecutive ordered substring is: ");
		System.out.println(entry.substring(stringMaxInd, stringMaxInd + stringMaxLength));
		
		
	}
}