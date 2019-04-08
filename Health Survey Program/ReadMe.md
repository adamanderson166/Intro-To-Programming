# Intro-To-Programming

This repository holds my class assignments from CSCI 1105 - Introduction to Programming at Southwest Technical College.

# Final Project Information

## Health Survey
This Health Survey helps patients with anxiety and depression cope with problems they face. This is my final project for Object Oriented Programming. After the survey is completed, it saves an output.txt document to the computer, which can be handled by a therapist or parent.

## Example Run
<img src="ResilienceModelScreenshot.png" />

## Code Example
This code is contains a button listener that allows the user to proceed through the entire survey. If you want to adjust how many questions are in the survey, it is essential that you update if statement (questionList[i] == questionList[6]) to allow more or less than '6'.
```
public void changeQuestionForward() {
	try {
		Scanner input = new Scanner(System.in);
		
		String changedQuestion = questionLabel.toString();
		changedQuestion = questionList[i + 1];
		i += 1;
		
		String getTextInput = new String(centerTextField.getText());
		answerInput.add(getTextInput);
		questionLabel.setText(changedQuestion);
		System.out.println(getTextInput.toString());
		//Text changedQuestionText = new Text(changedQuestion);
		System.out.println(changedQuestion);
		centerTextField.setText("");
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Congrats you've completed the survey! Your file is being saved to a file on your computer!");
	}
		// Once the program reaches the end, I'd like the file to record the data and print it to a file. I'm getting a null in the file however
		
		if (questionList[i] == questionList[6]) {
			int j = 0;
			try{
				// Why is this not working???  String fileName = answerInput[0] + answerInput[1] + ".txt";
				String fileName = "output.txt";
				FileWriter fw = new FileWriter(fileName);
				PrintWriter outputStream = new PrintWriter(fw);
				
				//printer for answers is working
				outputStream.println("Here are the results for " + answerInput.get(0) + " on the date of " + answerInput.get(1));
				outputStream.println("");
				outputStream.println("");
					for (i = 0; i < 6; i ++) {
					outputStream.println(questionList[i]);
					outputStream.println(answerInput.get(i).toString().replace("[", "").replace("]",""));
					outputStream.println("");
					}
				outputStream.close();
				
				
			}catch(FileNotFoundException e) {
				System.out.println("File Not Found");
			}catch(IOException e) {
				System.out.println("IOException");
			}
			System.exit(0);
		}
}
```

## Installation
Download reopository. Enter into HealthSurveyFinal folder and run HealthSurveyFinal.java.

## Contributing
Please make contributions to Github at the location "https://github.com/adamanderson166/Intro-To-Programming/tree/master/HealthSurveyProject"""

## Licence
There is no license to this software
