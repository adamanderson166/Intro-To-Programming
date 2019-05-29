/*
Adam Anderson
5/28/2019
(Chat) Write a program that enables two users to chat. Implement one user as the server and the other as the client.

The server has two text areas: one for entering text and the other (non-editable) for displaying the history of the conversation. When the user presses the Enter key, the current line is sent to the client and the text area is cleared.

The client has two text areas: one (non-editable) for displaying the history of the conversation. When the user presses the Enter key, the current line is sent to the server and the text area is cleared. 
**/

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;
import javafx.application.Platform;
import javafx.scene.text.Text;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javafx.scene.shape.Shape;

public class Exercise31_09Client extends Application {
  
  DataOutputStream toServer = null;
  DataInputStream fromServer = null;
  
  private TextArea taServer = new TextArea();
  private TextArea taClient = new TextArea();
 
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    taServer.setWrapText(true);
    taClient.setWrapText(true);
    //taServer.setDisable(true);

    BorderPane pane1 = new BorderPane();
    pane1.setTop(new Label("History"));
    pane1.setCenter(new ScrollPane(taServer));
    BorderPane pane2 = new BorderPane();
    pane2.setTop(new Label("New Message"));
    pane2.setCenter(new ScrollPane(taClient));
    
    VBox vBox = new VBox(5);
    vBox.getChildren().addAll(pane1, pane2);

    // Create a scene and place it in the stage
    Scene scene = new Scene(vBox, 200, 200);
    primaryStage.setTitle("Exercise31_09Client"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage

    // SetOnKeyPressed Enter Listener
    taClient.setOnKeyPressed(event -> {
      if(event.getCode() == KeyCode.ENTER) {
        //System.out.println(taClient.getText());
        String taClientNew = taClient.getText();
        taClient.setText("\b");
        taClient.setText(null);
        try {
          toServer.writeUTF(taClientNew);
        }
        catch (IOException ex) {
          
        }
      }
    });
    
    
    new Thread(() -> {
      try {
        // Create a socket to connect to the server
        Socket socket = new Socket("localhost", 8000);
        // Create an input stream to receive data from the server
        fromServer = new DataInputStream(socket.getInputStream());
        
        // Create an output stream to send data to the server
        toServer = new DataOutputStream(socket.getOutputStream());
        
        while (true) {
          //receive info from server
          String taClient = fromServer.readUTF();
          
          // Send info back to server
          //toServer.writeUTF(taClient.getText());
          
          Platform.runLater(() -> {
            taServer.appendText("C: " + taClient + "\n");
          });
        }
        
      }
      catch (IOException ex) {
        taServer.appendText(ex.toString() + '\n');
      }
    }).start();
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
