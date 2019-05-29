/*
Adam Anderson
5/24/2019
(Loan server) Write a server for a client. The client sends loan information (annual interest rate, number of years, and loan amount) to the server. The server creates a Loan object to compute monthly payment and total payment, and sends those numbers back to the client.
**/

// Exercise31_01Server.java: The server can communicate with
// multiple clients concurrently using the multiple threads
import java.net.*;
import java.util.Date;
import java.util.*;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;import java.io.*;
import java.awt.*;
import java.awt.event.*;


public class Exercise31_01Server extends Application {
  // Text area for displaying contents
  private TextArea ta = new TextArea();

  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    ta.setWrapText(true);
   
    // Create a scene and place it in the stage
    Scene scene = new Scene(new ScrollPane(ta), 400, 200);
    primaryStage.setTitle("Exercise31_01Server"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
    new Thread(() -> {
      try {
        // Create a server socket
        ServerSocket serverSocket = new ServerSocket(8000);
        Platform.runLater(() ->
          ta.appendText("Server started at " + new Date() + '\n'));
          
          // Listen for a connection request
          Socket socket = serverSocket.accept();
          
          // Create data input and output streams
          DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
          DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());
          
          while (true) {
            // Receive radius from the client
            double tfAnnualInterestRateNew = inputFromClient.readDouble();
            double tfNumbOfYearsNew = inputFromClient.readDouble();
            double tfLoanAmountNew = inputFromClient.readDouble();
            
            double monthlyInterest = tfAnnualInterestRateNew / 1200;
            double monthlyPayment = tfLoanAmountNew * monthlyInterest / (1 - 1 / Math.pow(1 + monthlyInterest, tfNumbOfYearsNew * 12));
            double totalPayment = monthlyPayment * tfNumbOfYearsNew * 12;
            
            outputToClient.writeDouble(monthlyPayment);
            outputToClient.writeDouble(totalPayment);
            
            // Send info back to the client
            outputToClient.writeDouble(tfAnnualInterestRateNew);
            outputToClient.writeDouble(tfNumbOfYearsNew);
            outputToClient.writeDouble(tfLoanAmountNew);
            
            Platform.runLater(() -> {
              ta.appendText("Annual Interest Rate: " + tfAnnualInterestRateNew + "\n");
              ta.appendText("Number of years:  " + tfNumbOfYearsNew + "\n");
              ta.appendText("Loan Amount: " + tfLoanAmountNew + "\n");
              ta.appendText("monthlyPayment: " + monthlyPayment + "\n");
              ta.appendText("totalPayment: " + totalPayment + "\n");
            });
          }
      }
      catch(IOException ex) {
        ex.printStackTrace();
      }
    }).start();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
