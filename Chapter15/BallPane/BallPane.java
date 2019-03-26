import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class BallPane extends Pane {
	Circle circle = new  Circle(50, 50, 50);
	
	public BallPane() {
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.YELLOW);
		getChildren().add(circle);
	}
	
	public void moveLeft() {
		if( circle.getCenterX() - circle.getRadius() - 10 < 0) return;
		circle.setCenterX(circle.getCenterX() - 10) ;
	}
	
	public void moveRight() {
		if( circle.getCenterX() - circle.getRadius() + 10 > getWidth()) return;
		circle.setCenterX(circle.getCenterX() + 10) ;
	}
	
	public void moveUp() {
		if( circle.getCenterY() - circle.getRadius() - 10 < 0) return;
		circle.setCenterY(circle.getCenterY() - 10) ;
	}
	
	public void moveDown() {
		if( circle.getCenterY() - circle.getRadius() + 10 > getHeight()) return;
		circle.setCenterY(circle.getCenterY() + 10) ;
	}
}