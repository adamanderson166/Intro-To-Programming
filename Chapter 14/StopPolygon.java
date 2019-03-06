/*
Author: Adam Anderson
Date: 3/5/2018
This is a program that displays a STOP sign, as shown below. The octagon is in red and the sign is in white
*/

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.scene.text.*;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontPosture;
import javafx.scene.text.TextAlignment;

public class StopPolygon extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane, a polygon, and a place polygon to pane
		
		Text text = new Text(39, 110, "STOP");
		text.setFill(Color.WHITE);
		text.setTextAlignment(TextAlignment.JUSTIFY);
		text.setFont(new Font("Times New Roman", 50));	
		
		Polygon polygon = new Polygon();
		Pane pane = new Pane();
		pane.getChildren().clear();
		pane.getChildren().add(polygon);
		pane.getChildren().add(text);
		polygon.setFill(Color.RED);
		polygon.setStroke(Color.RED);
		ObservableList<Double> list = polygon.getPoints();
		
		final double WIDTH = 200, HEIGHT = 200;
		double centerX = WIDTH / 2, centerY = HEIGHT / 2;
		double radius = Math.min(WIDTH, HEIGHT) * 0.4;
		

		
		
		// Add points to polygon list
		for (int i = 0; i < 8; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 6));
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 6));
		}
		
		//Create a scene and place it in the stage
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("Stop Polygon");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}