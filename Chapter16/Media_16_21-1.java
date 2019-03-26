import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;
import javafx.scene.layout.GridPane;
import javafx.animation.Timeline;
import javafx.util.Duration;
import javafx.animation.KeyFrame;

public class Media_16_21 extends Application {
	
	private static final String MEDIA_URL = "https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3";
		// Create media player
		Media media = new Media(MEDIA_URL);
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		MediaView mediaView = new MediaView(mediaPlayer);
		
		// Create the TextField
		TextField countDown = new TextField("0");
		//
		Timeline animation = new Timeline(
			new KeyFrame(Duration.millis(1000), e -> {
			int countDownTimer = Integer.parseInt(countDown.getText());
			if (countDownTimer > 0) {
			countDownTimer--;
			countDown.setText(countDownTimer + "");		
			}
//			animation.stop();
		}));

	
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {

		animation.setCycleCount(Timeline.INDEFINITE);
		countDown.setAlignment(Pos.CENTER);
		countDown.setOnAction(e -> {
			animation.play();
			mediaPlayer.play();
		});
		
		// Setup the BorderPane
		BorderPane pane = new BorderPane();
		pane.setCenter(mediaView);
		pane.setTop(countDown);
	
		// Make a scene
		Scene scene = new Scene(pane, 600, 500);
		primaryStage.setTitle("Media_16_21");
		primaryStage.setScene(scene);
		primaryStage.show();	
		
	}
	
	public static void main(String args) {
		launch(args);
	}

}