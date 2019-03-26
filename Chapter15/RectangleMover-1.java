/* 
Adam Anderson
3/20/2019
This Program animates a rectangle moving along the outline of a pentagon. Enable the user to resume/pause the animation with a click on the left/right mouse button. The rectangle's opacity should change as it moves around the pentagon.
**/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.collections.ObservableList;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.util.Duration;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.input.MouseButton;
import javafx.scene.input.KeyCode;
import javafx.animation.FadeTransition;
import java.awt.*;

public class RectangleMover extends Application {
	
	
	public void start(Stage primaryStage) {
		
		// create a pane
		Pane pane = new Pane();
		
		// create a rectangle
		Rectangle r1 = new Rectangle(25, 10, 60, 30);
		r1.setStroke(Color.BLACK);
		r1.setFill(Color.WHITE);
		pane.getChildren().add(r1);
		
		Polygon p1 = new Polygon();
		p1.setStroke(Color.RED);
		p1.setFill(Color.GREEN);
		pane.getChildren().add(p1);
		ObservableList<Double> list = p1.getPoints();
		
		final double WIDTH = 200, HEIGHT = 200;
		double centerX = WIDTH /2, centerY = HEIGHT / 2;
		double radius = Math.min(WIDTH, HEIGHT) * 0.4;
		
		// add points to polygon list
		for (int i = 0; i < 6; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / 6));
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / 6));
		}
		
		// Create a path transition
		PathTransition pt = new PathTransition();
		pt.setPath(p1);
		pt.setNode(r1);
		pt.setOrientation(
			PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		pt.setCycleCount(Timeline.INDEFINITE);
		pt.setAutoReverse(false);
	//	pt.play();
		
		// pane pause
		
		pane.setOnMouseClicked(e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				pt.play();
			}	 
			else if (e.getButton() == MouseButton.SECONDARY) {
				pt.pause();
			}
		});
		
		// Make Polygon fade using fade transition
		FadeTransition ft = new FadeTransition(Duration.millis(1000), p1);
		ft.setFromValue(1.0);
		ft.setToValue(0.5);
		ft.setCycleCount(Timeline.INDEFINITE);
		ft.setAutoReverse(true);
		ft.play();
		
		
		// create a scene and place things in the stage
		Scene scene = new Scene(pane, 250, 200);
		primaryStage.setTitle("RectangleMover");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
}