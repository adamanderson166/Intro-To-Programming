/* 
Adam Anderson
3/19/2019
This program creates radiobuttons, a toggle group and action-buttons, that perform functions on "Programming is fun"
**/

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ProgrammingFunChallenge extends Application {
	
	public void start(Stage primaryStage) {
	
	Text text = new Text(20, 20, "Programming is fun");
	text.setFont(Font.font("Times New Roman"));
	Pane centerPane = new Pane();
	centerPane.getChildren().add(text);
	
	// radio buttons
	RadioButton radioButtonRed = new RadioButton("Red");
	RadioButton radioButtonBlack = new RadioButton("Black");
	RadioButton radioButtonOrange = new RadioButton("Orange");
	RadioButton radioButtonYellow = new RadioButton("Yellow");
	RadioButton radioButtonGreen = new RadioButton("Green");
	
	// toggle group buttons
	ToggleGroup toggleGroup = new ToggleGroup(); 
	radioButtonRed.setToggleGroup(toggleGroup);
	radioButtonBlack.setToggleGroup(toggleGroup);
	radioButtonYellow.setToggleGroup(toggleGroup);
	radioButtonGreen.setToggleGroup(toggleGroup);
	radioButtonOrange.setToggleGroup(toggleGroup);
	
	//  action buttons
	
	radioButtonRed.setOnAction(e -> text.setFill(Color.RED));
	radioButtonBlack.setOnAction(e -> text.setFill(Color.BLACK));
	radioButtonYellow.setOnAction(e -> text.setFill(Color.BLACK));
	radioButtonGreen.setOnAction(e -> text.setFill(Color.GREEN));
	radioButtonOrange.setOnAction(e -> text.setFill(Color.ORANGE));
	
	// add buttons to toggle group
	
	radioButtonRed.setToggleGroup(toggleGroup);
	radioButtonBlack.setToggleGroup(toggleGroup);
	radioButtonGreen.setToggleGroup(toggleGroup);
	radioButtonYellow.setToggleGroup(toggleGroup);
	radioButtonOrange.setToggleGroup(toggleGroup);
	
	// action-button actions
	radioButtonOrange.setOnAction(e -> text.setFill(Color.ORANGE));
	radioButtonRed.setOnAction(e -> text.setFill(Color.RED));
	radioButtonBlack.setOnAction(e -> text.setFill(Color.BLACK));
	radioButtonGreen.setOnAction(e -> text.setFill(Color.GREEN));
	radioButtonYellow.setOnAction(e -> text.setFill(Color.YELLOW));
	
	HBox upperBox = new HBox(5);
	upperBox.setAlignment(Pos.CENTER);
	
	upperBox.getChildren().addAll(radioButtonRed, radioButtonBlack, radioButtonYellow, radioButtonGreen, radioButtonOrange);
	
	HBox lowerBox = new HBox(5);
	lowerBox.setAlignment(Pos.CENTER);
	
	Button btLeft = new Button("<=");
	Button btRight = new Button("=>");
	
	btLeft.setOnAction(e -> text.setX(text.getX() - 50));
	btRight.setOnAction(e -> text.setX(text.getX() + 50));
	
	lowerBox.getChildren().addAll(btLeft, btRight);
	
	// set the panes
	
	BorderPane mainPane = new BorderPane();
	mainPane.setTop(upperBox);
	mainPane.setCenter(centerPane);
	mainPane.setBottom(lowerBox);
	
	Scene scene = new Scene(mainPane, 400, 400);
	primaryStage.setTitle("Programming Fun Challenge");
	primaryStage.setScene(scene);
	primaryStage.show();
	
	}
}