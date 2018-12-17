/*
Author: Adam Anderson
Date: 12/14/2018
This program asks users to play a guessing game, in relation to states and their respective capitals...
*/

import java.util.Scanner;

class CapitalQuiz {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int correctCount = 0;
			String[][] stateCapitals = 
			{{"Alabama", "Montgomery"},
			{"Alaska", "Juneau"},
			{"Arizona", "Phoenix"},
			{"Arkansas", "Little Rock"},
			{"California", "Sacramento"},
			{"Colorado", "Denver"},
			{"Connecticut", "Hartford"},
			{"Delaware", "Dover"},
			{"Florida", "Tallahassee"},
			{"Georgia", "Atlanta"}};
			
			
			for (int i = 0; i < stateCapitals.length; i++) {
				System.out.println("What is the capital of " + stateCapitals[i][0] + "? ");
				String answer = input.nextLine();
				
				if (answer.toLowerCase().equals(stateCapitals[i][1].toLowerCase())) {
				System.out.println("Correct!");
				correctCount = correctCount + 1;
				}
				else {
				System.out.println("Incorrect! The answer is " + stateCapitals[i][1]);
				}
			}
			System.out.println();	
			System.out.println("You got " + correctCount + " out of 10 correct!");
		
	}
}