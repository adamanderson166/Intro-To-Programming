/*
Author: Adam Anderson
Date: 3/14/2018
This is atest program that displays only the hour and minute hands. The hour and minute values are randomly generated. The hour is between 0 and 11, and the minute is either 0 or 30.
*/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;


public class TestClockPane extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		
		ClockPane clock = new ClockPane((int)(Math.random() * 12), ((int)(Math.random() * 2) == 1 ? 30: 0), 0);
		clock.setSecondHand(false);
		String timeString = clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond();
		Label time = new Label(timeString);
		
		BorderPane pane = new BorderPane();
		pane.setCenter(clock);
		pane.setBottom(time);
		BorderPane.setAlignment(time, Pos.TOP_CENTER);
		
		
		Scene scene = new Scene(pane, 300, 300);
		primaryStage.setTitle("Clock Pane");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}