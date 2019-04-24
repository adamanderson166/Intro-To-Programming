/*
Adam Anderson
4/22/2019
(Pattern matching ) Write a program that prompts the user to enter two strings and tests whether the second string is a substring of the first string. Suppose the neighboring characters in the string are distinct.  (Don’t use the indexOf method in the String class.) Analyze the time complexity of your algorithm. Your algorithm needs to be at least O(n) time.
*/

import java.util.*;

class Exercise22_03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter string: ");
		String string1 = input.nextLine();
		System.out.print("Enter string: ");
		String string2 = input.nextLine();
		
		// Store index of string2
		int index = -1;
		// counterer
		int counter = 0;
		
		// String2 vs String1 tester
		for (int i = 0; i < string1.length(); i++) {
			if (string1.charAt(i) == string2.charAt(0) && counter == 0) {
				index = i;
				counter++;
			}
			else if (string1.charAt(i) == string2.charAt(counter)) {
				counter++;
			}
			else {
				counter = 0;
				index = -1;
			}
			//create a breaker if the counter compares to the second string length
			if (counter == string2.length())
			break;
		} 
		
		
		// create an if else statement that prints out the answer
		
		
		if (index >= 0) {
			System.out.println("These strings match at index: " + index);
		}
		else{
			System.out.println("Zero matches");
		}
	}
}