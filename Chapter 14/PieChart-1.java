import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.geometry.Insets;

public class PieChart extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		Pane pane = new Pane();	
	
		Arc arc2 = new Arc(150, 100, 80, 80, 105, 100);
		arc2.setFill(Color.GREEN);
		arc2.setType(ArcType.ROUND);
		pane.getChildren().add(arc2);
		pane.getChildren().add(new Text(20, 100, "Midterm -- 30%"));
		
		Arc arc1 = new Arc(150, 100, 80, 80, 70, 35);
		arc1.setFill(Color.BLUE);
		arc1.setType(ArcType.ROUND);
		pane.getChildren().add(arc1);
		pane.getChildren().add(new Text(130, 15, "Quiz -- 10%"));
		

		Arc arc3 = new Arc(150, 100, 80, 80, 205, 164);
		arc3.setFill(Color.YELLOW);
		arc3.setType(ArcType.ROUND);
		pane.getChildren().add(arc3);
		pane.getChildren().add(new Text(170, 170, "Final -- 40%"));
		
		
		Arc arc4 = new Arc(150, 100, 80, 80, 0, 70);
		arc4.setFill(Color.RED);
		arc4.setType(ArcType.ROUND);
		arc4.setStroke(Color.RED);
		pane.getChildren().add(arc4);
		pane.getChildren().add(new Text(190, 70, "Project -- 20%"));
		

		
		Scene scene = new Scene(pane, 300, 200);
		primaryStage.setTitle("Pie Scene");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		double[] pieScores = {10, 20, 30, 40};
		
		String[] grades = {"Project", "Quiz", "Midterm", "Final"};
		
	}
}
/**
Arc arc2 = new Arc(150, 100, 80, 80, 105, 100);
arc2.setFill(Color.GREEN);
arc2.setType(ArcType.ROUND);
pane.getChildren().add(new Text(190, 70, "Project -- 20%"));
pane.getChildren().add(arc2);

Arc arc1 = new Arc(150, 100, 80, 80, 70, 35);
arc1.setFill(Color.BLUE);
arc1.setType(ArcType.ROUND);
pane.getChildren().add(new Text(130, 15, "Quiz -- 10%"));
pane.getChildren().add(arc1);

Arc arc3 = new Arc(150, 100, 80, 80, 205, 164);
arc3.setFill(Color.YELLOW);
arc3.setType(ArcType.ROUND);
pane.getChildren().add(new Text(20, 100, "Midterm -- 30%"));
pane.getChildren().add(arc3);

Arc arc4 = new Arc(150, 100, 80, 80, 0, 70);
arc4.setFill(Color.RED);
arc4.setType(ArcType.ROUND);
arc4.setStroke(Color.RED);
pane.getChildren().add(new Text(170, 170, "Final -- 40%"));
pane.getChildren().add(arc4);
*/