/*
Author: Adam Anderson
Date: 4/10/2018
(Guessing the capitals ) Rewrite Programming Exercise 8.37Preview the document to store the pairs of states and capitals so that the questions are displayed randomly.
*/

import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

class Exercise_20_03 {
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
			
			// This creates a new List
			List<String[]> stateCapList = Arrays.asList(stateCapitals);
			// This shuffles the newly created list
			Collections.shuffle(stateCapList);
			
			
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