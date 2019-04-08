/*
Adam Anderson
4/6/2019
This Health Survey helps patients with anxiety and depression cope with problems they face. This is my final project for Object Oriented Programming. After the survey is completed, it saves an output.txt document to the computer, which can be handled by a therapist or parent.
**/

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintStream;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.awt.*;

public class HealthSurveyFinalv1 extends Application {
	
	Scanner input = new Scanner(System.in);
	TextField centerTextField = new TextField();
	Text questionLabel = new Text("\n\nWelcome to Life Launch Center's Resilience Model.\n                   Enter your name below:");
	int i = 0;
	
	// ArrayList that holds answerInput (to print later)
	ArrayList<String> answerInput = new ArrayList<String>();
	
	String[] questionList = new String[] {
		"\nPlease enter your name: ",
		"\nPlease enter today's date: ",
		"\nWhat are some stress triggers you have been feeling today?",
		"\nWhat is your plan to cope through your stress?",
		"\nWhat have you tried to do to cope with your stress?",
		"\nWhat is something you can do to prevent stress from happening?",
		"\nCongrats, you've completed the Resilience Model!"
	};

	@Override
	public void start(Stage primaryStage) {
		
		questionLabel.setFont(Font.font("Verdana", 20));

		HBox hBoxQuestion = new HBox();
		hBoxQuestion.setAlignment(Pos.CENTER);
		centerTextField.setAlignment(Pos.CENTER);
		hBoxQuestion.getChildren().addAll(questionLabel);
		
		HBox hBoxCenter = new HBox();
		hBoxCenter.setAlignment(Pos.CENTER);
		hBoxCenter.getChildren().addAll(centerTextField);
		
		HBox topBox = new HBox();
		topBox.setAlignment(Pos.CENTER);
		topBox.getChildren().add(questionLabel);
		
		
		// Create a button box and create the listeners
		HBox buttonBox = new HBox();
		buttonBox.setAlignment(Pos.CENTER);
		Button btLeft = new Button("Go Back");
		Button btRight = new Button("Enter");
		buttonBox.getChildren().addAll(btLeft, btRight);
	
		btLeft.setOnAction(e -> changeQuestionBackward());
		btRight.setOnAction(e -> changeQuestionForward());

		BorderPane pane = new BorderPane();
		pane.setCenter(hBoxQuestion);
		pane.setCenter(hBoxCenter);
		pane.setBottom(buttonBox);
		pane.setTop(topBox);
		
		Scene scene = new Scene(pane, 800, 400);
		primaryStage.setTitle("Resilience Model");
		primaryStage.setScene(scene);
		primaryStage.show();		
	}
		
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
					
					//Trying to make a for loop that will print question, then answerInput
					
					/*
					for (i = 0; i < questionList.length; i++) {
							for (j = 0; answerInput.size(); j++) {
							outputStream.println(questionList[i] + answerInput[j]);
							}
					}
					**/
					
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
	
	public void changeQuestionBackward() {
		try {
			Scanner input = new Scanner(System.in);
			String changedQuestion = questionLabel.toString();
			changedQuestion = questionList[i - 1];
			i -= 1;
			
			String getTextInput = new String(centerTextField.getText());
			answerInput.add(getTextInput);
			questionLabel.setText(changedQuestion);
			System.out.println(getTextInput.toString());
			//Text changedQuestionText = new Text(changedQuestion);
			System.out.println(changedQuestion);
			centerTextField.setText("");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("You cannot go back further");
		} 
		
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		launch(args);	
		//this print stream should save as the user's name, along with the date
		
	}	
}		