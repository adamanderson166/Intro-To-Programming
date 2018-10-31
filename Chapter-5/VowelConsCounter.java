/*
	Author: Adam Anderson
	Date: 10/31/2018
	This program prompts the user to enter a string and displays the number of vowels and consonants in the string....
	*/

import java.util.Scanner;
class VowelConsCounter {
	public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				System.out.print("Enter letters: ");
				String letters = input.nextLine();
				letters = letters.toUpperCase();
				int vowelCounter = 0;
				int consCounter = 0;
				for (int i = 0; i < letters.length(); i++) {
					if (letters.charAt(i) == 'A' || letters.charAt(i) == 'E' || letters.charAt(i) == 'I' || letters.charAt(i) == 'O' || letters.charAt(i) == 'U'){
						vowelCounter++;
					}
					else{
						consCounter++; 
					}
				}
				System.out.println("There are " + vowelCounter + " vowels " + consCounter + " consonants");
				
				input.close();
				
	}
}