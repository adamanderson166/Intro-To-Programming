/*
Adam Anderson
5/20/2019
(Raise flags) Rewrite Listing 15.13 using a thread to animate a flag being raised.
**/

import javafx.animation.PathTransition; 
import javafx.application.Application; 
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.nio.channels.*;



public class FlagRisingAnimation extends Application {
	
	ImageView imageView = new ImageView("image/us.gif");
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create a pane
		Pane pane = new Pane();
	
		// Add an image view and add it to pane
		
		pane.getChildren().add(imageView);

		// Create a path transition
		//PathTransition pt = new PathTransition(Duration.millis(10000),
		//					new Line(100, 200, 100, 0), imageView); pt.setCycleCount(5);
		//pt.play(); // Start animation
		
		// Create a scene and place it in the stage
		Scene scene = new Scene(pane, 250, 200); 
		primaryStage.setTitle("FlagRisingAnimation"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
		
		//make a thread(with FlagRise in the parameter)
		Thread mover = new Thread(new FlagRise(20));
		mover.start();
	}
	
	public class FlagRise implements Runnable {
		//create a counter that can be used in the run method
		private int count = 1;
		public FlagRise(){}
		public FlagRise(int count) {
			this.count = count;
		}			
		
		public void run() {
			try{
				for (int i = 0; i < count; i++) {
					//setup the imageViews
					imageView.setX(0);
					imageView.setY(50);
					//Create a for loop that runs through the imageView and assigns the movement of y
					for (int j = 1; j <= 100; j++) {
						imageView.setY(imageView.getY() - 1);
						Thread.sleep(100);
					}
				}
				//Catch statement needed for the try statement
			} catch (InterruptedException ex) {}
		}
	} 
}