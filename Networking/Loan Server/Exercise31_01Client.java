/*
Adam Anderson
5/24/2019
(Loan server) Write a server for a client. The client sends loan information (annual interest rate, number of years, and loan amount) to the server. The server creates a Loan object to compute monthly payment and total payment, and sends those numbers back to the client.
**/

// Exercise31_01Client.java: The client sends the input to the server and receives
// result back from the server
import java.net.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;import java.io.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;


public class Exercise31_01Client extends Application {
  

  
  DataOutputStream toServer = null;
  DataInputStream fromServer = null;
  
  // Text field for receiving radius
  private TextField tfAnnualInterestRate = new TextField();
  private TextField tfNumOfYears = new TextField();
  private TextField tfLoanAmount = new TextField();
  private Button btSubmit= new Button("Submit");

  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
   
    GridPane gridPane = new GridPane();
    gridPane.add(new Label("Annual Interest Rate"), 0, 0);
    gridPane.add(new Label("Number Of Years"), 0, 1);
    gridPane.add(new Label("Loan Amount"), 0, 2);
    gridPane.add(tfAnnualInterestRate, 1, 0);
    gridPane.add(tfNumOfYears, 1, 1);
    gridPane.add(tfLoanAmount, 1, 2);
    gridPane.add(btSubmit, 2, 1);
    
    // Text area to display contents
    TextArea ta = new TextArea();
    
    tfAnnualInterestRate.setAlignment(Pos.BASELINE_RIGHT);
    tfNumOfYears.setAlignment(Pos.BASELINE_RIGHT);
    tfLoanAmount.setAlignment(Pos.BASELINE_RIGHT);
    
    tfLoanAmount.setPrefColumnCount(5);
    tfNumOfYears.setPrefColumnCount(5);
    tfLoanAmount.setPrefColumnCount(5);
            
    
    BorderPane pane = new BorderPane();
    pane.setCenter(new ScrollPane(ta));
    pane.setTop(gridPane);

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 400, 250);
    primaryStage.setTitle("Exercise31_01Client"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
    
    btSubmit.setOnAction(e -> {
      try {
      
       // Get the radius from the text field
        double interestRate = Double.parseDouble(tfAnnualInterestRate.getText().trim());
        double numberOfYears = Double.parseDouble(tfNumOfYears.getText().trim());
        double amount = Double.parseDouble(tfLoanAmount.getText().trim());
        // Send the radius to the server
        toServer.writeDouble(interestRate);
        toServer.writeDouble(numberOfYears);
        toServer.writeDouble(amount);
        toServer.flush();
        

        
        Double monthlyPayment = fromServer.readDouble();
        Double totalPayment = fromServer.readDouble();

        // Display to the text area
        ta.appendText("Annual Interest Rate: " + interestRate + "\n");
        ta.appendText("Number of years:  " + numberOfYears + "\n");
        ta.appendText("Loan Amount: " + amount + "\n");
        ta.appendText("totalPayment: " + totalPayment + "\n");
        ta.appendText("monthlyPayment: " + monthlyPayment + "\n");
      }
      catch (IOException ex) {
        System.err.println(ex);
      }
    });
    
    try {
      // Create a socket to connect to the server
      Socket socket = new Socket("localhost", 8000);
      
      // Create an input stream to receive data from the server
      fromServer = new DataInputStream(socket.getInputStream());
      
      // Create an output stream to send data to the server
      toServer = new DataOutputStream(socket.getOutputStream());
    }
    catch (IOException ex) {
      ta.appendText(ex.toString() + '\n');
    }
  }
  
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
