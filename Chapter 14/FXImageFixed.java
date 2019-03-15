/*
Author: Adam Anderson
Date: 4/4/2018
This program designs displays four images in a grid pane, as shown below.
*/

import javafx.application.Application;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FXImageFixed extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		GridPane pane = new GridPane();
		ImageView view1 = new ImageView("hummingbird.jpg");
		ImageView view2 = new ImageView("bubbles.jpg");
		ImageView view3 = new ImageView("parrot.jpg");
		ImageView view4 = new ImageView("plant.jpg");
		
		pane.add(view1, 0, 0);
		pane.add(view2, 0, 1);
		pane.add(view3, 1, 0);
		pane.add(view4, 1, 1);
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Image Placement");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

