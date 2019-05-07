/*
Adam Anderson
4/5/2019
(Display tree) Write a new view class that displays the tree horizontally with the root on the left as shown in Figure 25.23.
**/

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class BST_Animation extends Application {
	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		BST<Integer> tree = new BST<>(); // create a new tree
		
		BorderPane pane = new BorderPane();
		BTView view = new BTView(tree);
		pane.setCenter(view);
		
		TextField tfKey = new TextField();
		tfKey.setPrefColumnCount(3);
		tfKey.setAlignment(Pos.BASELINE_RIGHT);
		Button btInsert = new Button("Insert");
		Button btDelete = new Button("Delete");
		HBox hBox = new HBox(5);
		hBox.getChildren().addAll(new Label("Enter a key: "), 
				tfKey, btInsert, btDelete);
		hBox.setAlignment(Pos.CENTER);
		pane.setBottom(hBox);
		
		btInsert.setOnAction(e -> {
			int key = Integer.parseInt(tfKey.getText());
			if (tree.search(key)) {
				view.displayTree();
				view.setStatus(key + " is inserted in the tree");
			} else {
				tree.insert(key); //insert a new key
				view.displayTree();
				view.setStatus(key + " is inserted in the tree");
			}
		});
		
		btDelete.setOnAction(e -> {
			int key = Integer.parseInt(tfKey.getText());
			if (!tree.search(key)) {
				view.displayTree();
				view.setStatus(key + " is deleted from the tree");
			} else {
				tree.insert(key);
				view.displayTree();
				view.setStatus(key + " is deleted from the tree");
			}
		});
		
		// Create a scene and place the pane in the stage
		Scene scene = new Scene(pane, 450, 250);
		primaryStage.setTitle("BSTAnimation");
		primaryStage.setScene(scene);
		primaryStage.show();	
	}

	public static void main(String[] args) {
		launch(args);
	}
}
