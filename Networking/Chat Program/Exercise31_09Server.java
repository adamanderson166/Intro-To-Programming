/*
Adam Anderson
5/28/2019
(Chat) Write a program that enables two users to chat. Implement one user as the server and the other as the client.

The server has two text areas: one for entering text and the other (non-editable) for displaying the history of the conversation. When the user presses the Enter key, the current line is sent to the client and the text area is cleared.

The client has two text areas: one (non-editable) for displaying the history of the conversation. When the user presses the Enter key, the current line is sent to the server and the text area is cleared. 
**/

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.net.*;
import java.util.Date;
import java.util.*;
import javafx.application.Platform;
import java.io.*;
import javafx.scene.input.KeyCode;
import java.net.Socket;
import java.net.ServerSocket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Formatter;

public class Exercise31_09Server extends Application {

  DataOutputStream outputToClient = null;
  DataInputStream inputFromClient = null;
  
  private TextArea taServer = new TextArea();
  private TextArea taClient = new TextArea();
 
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    taServer.setWrapText(true);
    taClient.setWrapText(true);
    //taClient.setDisable(true);

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
    primaryStage.setTitle("Exercise31_09Server"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
    // SetOnKeyPress Enter Listener
    taClient.setOnKeyPressed(e -> {
      if(e.getCode() == KeyCode.ENTER) {
        //System.out.println(taClient.getText());
        String taClientNew = taClient.getText().trim();
        taClient.setText("");
        try {
          outputToClient.writeUTF(taClientNew); // maybe add the getText to taServerNew??
          taServer.appendText("S: " + taClientNew.toString() + "\n");
        }
        catch (IOException ex) {
        }
      }
    });


    new Thread(() -> {
      try {
        // Create a server socket
        ServerSocket serverSocket = new ServerSocket(8000);
        Platform.runLater(() ->
          taServer.appendText("Server started at " + new Date() + '\n'));
          
          // Listen for a connection request
          Socket socket = serverSocket.accept();
          
          // Create data input and output streams
          inputFromClient = new DataInputStream(socket.getInputStream());
          outputToClient = new DataOutputStream(socket.getOutputStream());
          
          while (true) {
            // Receive info from the client
            String taClient = inputFromClient.readUTF().trim();
            
            // Send info back to the client
           //outputToClient.writeUTF(taServer.getText());

            
            Platform.runLater(() -> {
              taServer.appendText("C: " + taClient + "\n");
            });
          }
      }
      catch(IOException ex) {
        ex.printStackTrace();
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
