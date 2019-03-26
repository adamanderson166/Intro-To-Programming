import javafx.application.Application;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.control.ContentDisplay;

public class ComboGrapeShifter extends Application {	
	Label grapeLabel = new Label("Grapes", new ImageView("grapes.gif"));
	
	@Override // Override the start method
	public void start(Stage primaryStage) {
	
	// Declare array of strings
	String[] grapeLocation = {"top", "bottom", "left", "right"};
	
	// Declare text field
	TextField textGap = new TextField();
	textGap.setOnAction(e -> {
		grapeLabel.setGraphicTextGap(Integer.parseInt(textGap.getText()));
		primaryStage.sizeToScene();
	});
	
	// Create a combobox for selecting positions
	
	ComboBox<String> cbo = new ComboBox<>();
	cbo.setValue("top");
	cbo.getItems().addAll(grapeLocation);
	cbo.setOnAction(e -> {
		update(cbo.getValue());
		primaryStage.sizeToScene();
	});
	
	
	// Declare ImageView
	Label cboLabel = new Label("ContentDisplay:", cbo);
	cboLabel.setContentDisplay(ContentDisplay.RIGHT);
	Label textLabel = new Label("graphicTextGap:", textGap);
	textLabel.setContentDisplay(ContentDisplay.RIGHT);
	
	HBox top = new HBox(5);
	top.setAlignment(Pos.CENTER);
	top.getChildren().addAll(cboLabel, textLabel);
	
	// center Pane
	
	grapeLabel.setAlignment(Pos.CENTER);
	StackPane centerPane = new StackPane();
	centerPane.getChildren().add(grapeLabel);

		
	// Add combo box and description pane to scene
		
	BorderPane pane = new BorderPane();
	BorderPane paneForComboBox = new BorderPane();
	pane.setTop(top);
	pane.setCenter(centerPane);
	
	// Create the scene to show
	
	Scene scene = new Scene(pane, 400, 400);
	primaryStage.setTitle("Grape Shiter");
	primaryStage.setScene(scene);
	primaryStage.show();
	
	}
	
	public void update(String switcher) {
		switch (switcher) {
			case "top": grapeLabel.setContentDisplay(ContentDisplay.TOP);
			break;
			case "bottom": grapeLabel.setContentDisplay(ContentDisplay.BOTTOM);
			break;
			case "right": grapeLabel.setContentDisplay(ContentDisplay.RIGHT);
			break;
			case "left": grapeLabel.setContentDisplay(ContentDisplay.LEFT);
			break;
		}
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
}