/*
Author: Adam Anderson
Date: 12/17/2018
This survey asks users a variety of questions pertaining to STEM. After the user takes the quiz, the survey will recommend whether the user should focus their education on Science, Technology, Engineering, or Mathematics.
*/

import java.util.Scanner;

class CapitalQuiz {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int scienceCount = 0;
			int techCount = 0;
			int engineeringCount = 0;
			int mathCount = 0;
			int[] stemCount = {1,2,3,4};
			String[] stemQuestions = 
			{"I love learning about rockets. ",
			"I really enjoy drawing. ",
			"I like watching science fiction movies. ",
			"I like working with computers. ",
			"I am very interested in robots and how they work. ",
			"I like learning about nature. ",
			"I like working with numbers. ",
			"I have fun working with pen and paper. ",
			"I like thinking about the future and new inventions. ",
			"I like to learn about space travel. ",
			"I like performing experiments. ",
			"I like doing addition and subtraction. ",
			"I am good at multipling and dividing numbers",
			};
						
			int[] questionClass = {2,2,0,1,2,0,3,2,1,0,0,3,3};
			
		
			
			System.out.print("Enter Y or N to the following questions: ");
			
			
			
			for (int i = 0; i < stemQuestions.length; i++) {
				System.out.println(stemQuestions[i]);
				String answer = input.nextLine();
				
				if (answer.equals("y")) {
				
					if (questionClass[i] == 0) {
					scienceCount = scienceCount + 1;
					}
					else if (questionClass[i] == 1) {
					techCount = techCount + 1;
					}
					else if (questionClass[i] == 2) {
					engineeringCount = engineeringCount + 1;
					}
					else {
					mathCount = mathCount + 1;
					}
				}
			}
			System.out.println(scienceCount);
			System.out.println(techCount);
			System.out.println(engineeringCount);
			System.out.println(mathCount);
			if (scienceCount >= techCount && scienceCount >= engineeringCount && scienceCount >= mathCount) {
				System.out.print("You have an affinity towards Science!");
			}
			else if (techCount >= scienceCount && techCount >= engineeringCount && techCount >= mathCount) {
				System.out.print("You have an affinity towards Technology!");
			}
			else if (engineeringCount >= scienceCount && engineeringCount >= techCount && engineeringCount >= mathCount) {
				System.out.print("You have an affinity towards Engineering!");
			}
			else {
				System.out.print("You have an affinity towards Mathematics!");
			}
	}
}