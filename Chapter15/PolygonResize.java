/*
Author: Adam Anderson
Date: 3/5/2018
This is a program that displays a STOP sign, as shown below. The octagon is in red and the sign is in white
*/

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.scene.text.*;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontPosture;
import javafx.scene.text.TextAlignment;

public class PolygonResize extends Application {
	double width = 200, height = 200;
	Polygon polygon = new Polygon();
	ObservableList<Double> list = polygon.getPoints();
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane, a polygon, and a place polygon to pane
		
		Text text = new Text("STOP");
		text.setFill(Color.WHITE);
		//text.setTextAlignment(TextAlignment.JUSTIFY);
		text.setFont(new Font("Times New Roman", 50));	
		
		StackPane pane = new StackPane();
		polygon.setFill(Color.RED);
		pane.getChildren().addAll(polygon, text);
		polygon.setStroke(Color.RED);

		double centerX = width / 2, centerY = height / 2;
		double radius = Math.min(width, height) * 0.4;
		
		// Add points to polygon list
		for (int i = 0; i < 8; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8 - Math.PI / 8));
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 8 - Math.PI / 8));
		}

		//Create a scene and place it in the stage
		Scene scene = new Scene(pane, width, height);
		primaryStage.setTitle("Stop Polygon");
		primaryStage.setScene(scene);
		primaryStage.show();

		scene.widthProperty().addListener(ov -> {
			width = pane.getWidth();
			createPolygon();
		});
		
		scene.heightProperty().addListener(ov -> {
			height = pane.getHeight();
			createPolygon();
		});
	}
	public void createPolygon() {
		double centerX = width / 2, centerY = height / 2;
		double radius = Math.min(width, height) * 0.4;
		
		// Add points to polygon list
		list.clear();
		for (int i = 0; i < 8; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 8 - Math.PI / 8));
			list.add(centerX + radius * Math.sin(2 * i * Math.PI / 8 - Math.PI / 8));
	}}
}