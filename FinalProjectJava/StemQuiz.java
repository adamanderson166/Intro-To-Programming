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

		//This string contains each individual stem question. If you'd like to add more questions, simply add them towards the bottom of the list.		
			
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
			"I am a skilled artist",
			"I can perform calculations in my head quickly",
			"I am very interested in business",
			"I love learning about airplanes and aerospace",
			"I like to determine what's behind things and how things work",
			"I find it easy to distinguish distances",
			"I can perform long division easily and find it fun",
			"I've always wanted to build a robot",
			"I like reading science fiction novels",
			"I like learning about space travel",
			"I like learning about how the pyramids were built"
			};

		//This array contains a STEM class identifier for each question. 0-Science, 1-Tech, 2-Engineering, 3-Mathematics...
						
		String[] questionClass = {"23", "21", "01", "101", "23", "03", "23", "2", "1", "03", "01", "3", "3", "2", "03", "10", "21", "02", "2", "3", "10", "0", "02", "32"};
			
		
			
		System.out.println("Enter Y or N to the following questions:");
			
		//This for loop runs through the array of questions, and determines the count of each STEM topic. The count relates to whether not the user enters a Yes or No. If Yes, 1 is added to the count.		
			
		for (int i = 0; i < stemQuestions.length; i++) {
			System.out.println(stemQuestions[i]);
			String answer = input.nextLine();
			
			while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
				System.out.print("Please enter a \"Y\" or \"N\": ");
				answer = input.nextLine();
			}
			
			if (answer.equalsIgnoreCase("y")) {

				if (questionClass[i].contains("0")) {
					scienceCount = scienceCount + 1;
				}
				if (questionClass[i].contains("1")) {
					techCount = techCount + 1;
				}
				if (questionClass[i].contains("2")) {
					engineeringCount = engineeringCount + 1;
				}
				if (questionClass[i].contains("3")) {
					mathCount = mathCount + 1;
				}
			}
		}
		if (scienceCount >= techCount && scienceCount >= engineeringCount && scienceCount >= mathCount) {
			System.out.println("You have an affinity towards Science!");
			System.out.println("Here's a list of jobs that might interest you:");
			System.out.println("Biochemist, Neuroscientist, Physicist, Doctor, Genetecist.");
		}
		else if (techCount >= scienceCount && techCount >= engineeringCount && techCount >= mathCount) {
			System.out.println("You have an affinity towards Technology!");
			System.out.println("Here's a list of jobs that might interest you:");
			System.out.println("Information Security Analyst, Software Developer, IT Manager, Computer Systems Analyst, Computer Network Architect.");
		}
		else if (engineeringCount >= scienceCount && engineeringCount >= techCount && engineeringCount >= mathCount) {
			System.out.println("You have an affinity towards Engineering!");
			System.out.println("Here's a list of jobs that might interest you:");
			System.out.println("Civil Engineer, Electrical Engineer, Environmental Engineer, Industrial Engineer, and Mechanical Engineer.");
		}
		else {
			System.out.println("You have an affinity towards Mathematics!");
			System.out.println("Here's a list of jobs that might interest you:");
			System.out.println("Data Analyst, Actuary, Statistician, Game Designer, Data Scientist.");
			
		}
	}
}