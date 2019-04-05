import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.control.Label;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import java.util.ArrayList;
import java.util.Scanner;

public class HealthSurvey extends Application {
	
	Scanner input = new Scanner(System.in);
	
	Text questionLabel = new Text("Click the enter button to begin");
	int i = 0;
	String[] questionList = new String[] {
		"On a scale of 1 - 10, what is your stress level?",
		"What are some stress triggers you have been feeling today?",
		"What coping mechanisms have you tried",
		"What is your plan to cope through your stress?",
		"What have you tried to do to cope with your stress?",
		"What is something you can do to prevent stress from happening?"
	};

	@Override
	public void start(Stage primaryStage) {
		
		questionLabel.setFont(Font.font("Verdana", 20));

		HBox hBoxQuestion = new HBox();
		hBoxQuestion.setAlignment(Pos.CENTER);
		TextField centerTextField = new TextField();
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
			System.out.println(changedQuestion);
			
			Text changedQuestionText = new Text(changedQuestion);
			questionLabel.setText(changedQuestion);
			//questionLabel = changedQuestion[i];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Congrats you've completed the survey!");
		}
	}
	
	public void changeQuestionBackward() {
		try {
			Scanner input = new Scanner(System.in);
			String changedQuestion = questionLabel.toString();
			changedQuestion = questionList[i - 1];
			System.out.println(changedQuestion);
			// breaks String answer = input.nextLine(); // breaks
			i -= 1;
			Text changedQuestionText = new Text(changedQuestion);
			questionLabel = changedQuestionText;
			questionLabel.setText(changedQuestion);
			//questionLabel = changedQuestion[i]; not working
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("You cannot go back further");
		} 
	}
	
	public static void main(String[] args) {
		launch(args);	
	}
}