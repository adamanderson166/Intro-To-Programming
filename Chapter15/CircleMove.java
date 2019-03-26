import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;

public class CircleMove extends Application {

	double width = 100;
	double height = 100;
	Circle circle = new Circle(50, 50, 50);

	@Override
	public void start(Stage primaryStage) {
		Pane pane = new Pane(circle);

			pane.setOnKeyPressed(e -> {
				switch (e.getCode()) {
					case UP: moveUp(); 
					break;
					case DOWN: moveDown(); 
					break;
					case LEFT: moveLeft(); 
					break;
					case RIGHT: moveRight(); 
					break;
				}
			});

		primaryStage.setScene(new Scene(pane, 400, 400));
		primaryStage.setTitle("Use the mouse keys to move");
		primaryStage.show();
		pane.requestFocus();
	}

	private void moveLeft() {
		circle.setCenterX(width -= 5);
	}
	private void moveRight() {
		circle.setCenterX(width += 5);
	}
	private void moveUp() {
		circle.setCenterY(height -= 5);
	}
	private void moveDown() {
		circle.setCenterY(height += 5);
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}