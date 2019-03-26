import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Ball_15_3 extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		BallPane ballPane = new BallPane();
		
		HBox hBox = new HBox(10);
		hBox.setAlignment(Pos.CENTER);
		
		Button btLeft = new Button("Left");
		Button btRight = new Button("Right");
		Button btUp = new Button("Up");
		Button btDown = new Button("Down");
		hBox.getChildren().addAll(btLeft, btRight, btUp, btDown);
		
		btLeft.setOnAction(event -> ballPane.moveLeft());
		btRight.setOnAction(event -> ballPane.moveRight());
		btUp.setOnAction(event -> ballPane.moveUp());
		btDown.setOnAction(event -> ballPane.moveDown());
		
		BorderPane pane = new BorderPane();
		pane.setCenter(ballPane);
		pane.setBottom(hBox);
		
		Scene scene = new Scene(pane, 400, 400);
		primaryStage.setTitle("Moving the Ball");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}