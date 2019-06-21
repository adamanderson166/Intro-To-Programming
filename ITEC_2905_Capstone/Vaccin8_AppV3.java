/*Adam Anderson
Vaccin8 - With all the debate and controversy surrounding Vaccinations, I thought it would be a good idea to create a tool that can helps new parents with the vaccination process. My tool will provide parents with a vaccination schedule as well as provide them with resources which help them learn about vaccinations.
6/9/2019
**/

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.stage.Window;
import javafx.scene.layout.*;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.geometry.Pos;
import javafx.scene.text.TextAlignment;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.DatePicker;
import java.time.*; 
import java.time.chrono.*; 
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.*; 
import javafx.scene.text.Font; 
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight; 
import javafx.scene.text.Text;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;
import javax.naming.directory.*;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import java.util.Arrays;
import java.util.List;
import javax.xml.soap.*;
import javafx.scene.control.Hyperlink;
import java.util.Collection;
import java.util.ArrayList;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.scene.effect.DropShadow;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;


public class Vaccin8_AppV3 extends Application {
	
	// Create various scenes
	Scene scene1;
	Scene scene2;
	Scene scene3;
	Scene scene4;
	Scene scene5;
	Scene scene6;
	Scene sceneVaccine;
	LocalDate datePickerStored = LocalDate.now();
	TextField nameField = new TextField();
	TextField emailField = new TextField();
	Button btnBottom3;
	String childNameStored;
	String bloodTypeStored;
	int childHeightStored;
	int childWeightStored;
	String hepatitisA;
	String hepatititsB;
	String meningococcal;
	String polio;
	String diphteria;
	String haemophilus;
	String rotavirus;
	String influenza;
	String chickenPox1;
	String chickenPox2;
	String mmr;
	String chickenpox1Stored;
	String chickenpox2Stored;
	String diphteriaStored;
	String haemophilusStored;
	String hepatitisAStored;
	String hepatitisBStored;
	String influenzaStored;
	String mmrStored;
	String meningStored;
	String polioStored;
	String rotavirusStored;
	String loadChildStored;
	CreateChild child1;
	String fileChildName;
	String fileName;
	String loadedChild;
	GridPane vaccineGrid = new GridPane();
	GridPane gridPane6 = new GridPane();
	
	

	
	//Convert LocalDates to strings
	LocalDate chickenPox1Date = datePickerStored.plusDays(360);
	String chickenPox1String = chickenPox1Date.toString();
	
	LocalDate chickenPox2Date = datePickerStored.plusDays(360);
	String chickenPox2String = chickenPox2Date.toString();
	
	LocalDate diphteriaDate = datePickerStored.plusDays(60);
	String diphteriaString = diphteriaDate.toString();
	
	LocalDate haemophilusDate = datePickerStored.plusDays(60);
	String haemophilusString = haemophilusDate.toString();

	LocalDate hepatitisADate = datePickerStored.plusDays(360);
	String hepatitisAString = hepatitisADate.toString();

	LocalDate hepatitisBDate = datePickerStored.plusDays(30);
	String hepatitisBString = hepatitisBDate.toString();

	LocalDate influenzaDate = datePickerStored.plusDays(180);
	String influenzaString = influenzaDate.toString();

	LocalDate mmrDate = datePickerStored.plusDays(360);
	String mmrString = mmrDate.toString();

	LocalDate meningococcalDate = datePickerStored.plusDays(30);
	String meningococcalString = meningococcalDate.toString();
	
	LocalDate polioDate = datePickerStored.plusDays(60);
	String polioString = meningococcalDate.toString();
	
	LocalDate rotavirusDate = datePickerStored.plusDays(60);
	String rotavirusString = rotavirusDate.toString();	
	
	@Override
	public void start(Stage primaryStage) {
	
		primaryStage.setTitle("Vaccin8 - Vaccine Solutions");

		
		//Scene 1 GridPane
		GridPane gridPane1 = new GridPane();
		gridPane1.setAlignment(Pos.CENTER);
		gridPane1.setPadding(new Insets(20, 20, 20, 20));
		gridPane1.setHgap(20);
		gridPane1.setVgap(20);

		//Scene 2 GridPane2
		GridPane gridPane2 = new GridPane();
		gridPane2.setAlignment(Pos.CENTER);
		gridPane2.setPadding(new Insets(20, 20, 20, 20));
		gridPane2.setHgap(20);
		gridPane2.setVgap(20);	
		
		//Scene 3 GridPane3
		GridPane gridPane3 = new GridPane();
		gridPane3.setAlignment(Pos.CENTER);
		gridPane3.setPadding(new Insets(20, 20, 20, 20));
		gridPane3.setHgap(20);
		gridPane3.setVgap(20);	
			
		//Scene 4 GridPane4
		GridPane gridPane4 = new GridPane();
		gridPane4.setAlignment(Pos.CENTER);
		gridPane4.setPadding(new Insets(20, 20, 20, 20));
		gridPane4.setHgap(5);
		gridPane4.setVgap(5);
		
		//Scene 5 GridPane5
		GridPane gridPane5 = new GridPane();
		gridPane5.setAlignment(Pos.CENTER);
		gridPane5.setPadding(new Insets(20, 20, 20, 20));
		gridPane5.setHgap(5);
		gridPane5.setVgap(5);	
		
		BorderPane borderPane5 = new BorderPane();
		
		gridPane6 = new GridPane();
		gridPane6.setAlignment(Pos.CENTER);
		gridPane6.setPadding(new Insets(20, 20, 20, 20));
		gridPane6.setHgap(5);
		gridPane6.setVgap(5);	
		
		//Vaccine Grid must use child creator submit on this page
		vaccineGrid = new GridPane();
		vaccineGrid.setAlignment(Pos.CENTER);
		vaccineGrid.setPadding(new Insets(20, 20, 20, 20));
		vaccineGrid.setHgap(5);
		vaccineGrid.setVgap(5);	
		
		//BorderPane Button sizers


		Button btnBottom1 = new Button("Back");
		btnBottom1.setPrefHeight(40);
		btnBottom1.setDefaultButton(true);
		btnBottom1.setPrefWidth(100);
		btnBottom1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		btnBottom1.setOnAction(e -> {
			primaryStage.setScene(scene3);	
		});	
		

		/*
		Button btnBottom2 = new Button("Information");
		btnBottom2.setPrefHeight(40);
		btnBottom2.setDefaultButton(true);
		btnBottom2.setPrefWidth(100);
		btnBottom2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		btnBottom2.setOnAction(e -> {
			primaryStage.setScene(scene4);	
		});	
		**/
		btnBottom3 = new Button("Export Schedule");
		Font button3font3 = new Font(20);
		btnBottom3.setFont(button3font3);

		btnBottom3.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		btnBottom3.setPrefHeight(60);
		btnBottom3.setDefaultButton(true);
		btnBottom3.setPrefWidth(210);
		btnBottom3.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		
		
		
		Button btnBottom4 = new Button("Close Program");
		btnBottom4.setPrefHeight(40);
		btnBottom4.setDefaultButton(true);
		btnBottom4.setPrefWidth(150);
		btnBottom4.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		btnBottom4.setOnAction(e -> {
			System.exit(0);	
		});	
		
		HBox hbox = new HBox(5);
		//hbox.setPadding(new Insets(10, 50, 50, 50));
		hbox.setSpacing(10);

		hbox.getChildren().addAll(btnBottom1,btnBottom4);
		
		borderPane5.setBottom(hbox);
			
		//SCENE 1
		DropShadow dropShadow = new DropShadow(3.0d, 2.0d, 2.0d, Color.rgb(0, 0, 0, 0.6d));
		dropShadow.setColor(Color.BLACK);
		
		Label label1= new Label("Vaccin8");
		label1.setTextFill(Color.web("#ffffff"));
		label1.setEffect(dropShadow);
		label1.setTextAlignment(TextAlignment.CENTER);
		label1.setContentDisplay(ContentDisplay.TOP);
		label1.setFont(Font.font("rockwell", 80));
		gridPane1.add(label1, 0, 0, 2, 2);
		
		Button button1= new Button("Add Child");
		Font button1font = new Font(20);
		button1.setFont(button1font);
		button1.setEffect(dropShadow);
		button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		button1.setPrefHeight(60);
		button1.setDefaultButton(true);
		button1.setPrefWidth(150);
		
		Button buttonLoad= new Button("Load Child");
		Font button2font = new Font(20);
		buttonLoad.setFont(button1font);
		buttonLoad.setEffect(dropShadow);
		buttonLoad.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		buttonLoad.setPrefHeight(60);
		buttonLoad.setDefaultButton(true);
		buttonLoad.setPrefWidth(150);
		GridPane.setHalignment(buttonLoad, HPos.CENTER);
		
		buttonLoad.setOnAction(e -> {
			// determine how to read child name
			
			//showAlert(Alert.AlertType.CONFIRMATION, gridPane1.getScene().getWindow(), "Load Successful!", "Welcome ");
			primaryStage.setScene(scene6);
		});
		
		//SCENE 3
		btnBottom3.setOnAction(e -> {
				//FileWriter and PrintWriter
				try{
					String fileName = "VaccineSchedule.txt";
					FileWriter fw = new FileWriter(fileName);
					PrintWriter outputStream = new PrintWriter(fw);
				
				
				outputStream.println("Your Child's Vaccination Schedule:");
				outputStream.println("");
				outputStream.println("---------------------------------------------------------");
				outputStream.println(childNameStored + "'s" + " Information:");
				outputStream.println("Child Name: " + childNameStored); 
				outputStream.println("Birth Date: " + datePickerStored);
				outputStream.println("Blood Type: " + bloodTypeStored);
				outputStream.println("Child Height: " + childHeightStored);
				outputStream.println("Child Weight: " + childWeightStored);
				outputStream.println("");
				outputStream.println("---------------------------------------------------------");		
				outputStream.println("Below is a list of Vaccination due dates for" + childNameStored + ":");
				outputStream.println("Hepatitis B shot due: " + hepatitisBString);
				outputStream.println("Meningococcal shot due: " + meningococcalString);
				outputStream.println("Polio shot due: " + polioString);
				outputStream.println("Diphteria shot due: " + diphteriaString);
				outputStream.println("Haemophilus shot due :" + haemophilusString);
				outputStream.println("Rotavirus shot due: " + rotavirusString);
				outputStream.println("Influenza shot due: " + influenzaString);
				outputStream.println("ChickenPox 1 shot due: " + chickenPox1String);
				outputStream.println("ChickenPox 2 shot due: " + chickenPox2String);	
				outputStream.println("Hepatitis A shot due: " + hepatitisAString);
				outputStream.println("MMR shot due: " + mmrString);
				outputStream.close();
				}catch(FileNotFoundException ex) {
					System.out.println("File not found");
				}catch(IOException ex) {
					System.out.println("IOException;");
				}
			});

		
		Button button8 = new Button("Home");
		button8.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		Font button8font8 = new Font(20);
		button8.setFont(button8font8);
		button8.setEffect(dropShadow);
		button8.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		button8.setPrefHeight(60);
		button8.setDefaultButton(true);
		button8.setPrefWidth(150);
		
		Button buttonLoad2= new Button("Load Child");
		Font button2font2 = new Font(20);
		buttonLoad2.setFont(button2font2);
		buttonLoad2.setEffect(dropShadow);
		buttonLoad2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		buttonLoad2.setPrefHeight(60);
		buttonLoad2.setDefaultButton(true);
		buttonLoad2.setPrefWidth(150);
		GridPane.setHalignment(buttonLoad2, HPos.CENTER);
		TextField loadChildField = new TextField();
		Label loadChildLabel = new Label("Enter Child Name:");
		loadChildLabel.setAlignment(Pos.CENTER);
		gridPane6.add(loadChildLabel, 0, 2, 2, 2);
		gridPane6.add(loadChildField, 0, 5, 2, 2);
				
		//buttonLoad action
		

		button8.setOnAction(ex -> {
			//String userInfo = nameField.getText();
			//String emailInfo = emailField.getText();
		
			//showAlert(Alert.AlertType.CONFIRMATION, gridPane1.getScene().getWindow(), "Registration Successful!", "Welcome " + nameField.getText());
			primaryStage.setScene(scene1);

		});  
		
		
		gridPane1.add(button1, 0, 2, 2, 2);
		gridPane1.add(buttonLoad, 0, 3, 2, 2);
		GridPane.setHalignment(button1, HPos.CENTER);
		GridPane.setHalignment(buttonLoad, HPos.CENTER);	
		GridPane.setMargin(button1, new Insets(20, 0,20,0));
		GridPane.setMargin(buttonLoad, new Insets(60, 0,60,0));
		
	 
		VBox layout1 = new VBox(10);   
		layout1.getChildren().addAll(gridPane1);
		scene1= new Scene(layout1, 480, 720);
		
		VBox layout2= new VBox(20);
		//layout2.setAlignment(Pos.CENTER); 
		layout2.getChildren().addAll(gridPane2);
		scene2= new Scene(layout2,480,720);	
		
		VBox layout3 = new VBox(20);  
		layout3.setAlignment(Pos.CENTER);    
		layout3.getChildren().addAll(gridPane3);
		scene3= new Scene(layout3, 480, 720);
		
		VBox layout4 = new VBox(20);
		layout4.setAlignment(Pos.CENTER);      
		layout4.getChildren().addAll(gridPane4);
		scene4= new Scene(layout4, 480, 720);
		
		VBox layout5 = new VBox();
		//layout5.setAlignment(Pos.CENTER);      
		layout5.getChildren().addAll(borderPane5);
		scene5 = new Scene(layout5, 480, 720);
		
		VBox vaccineLayout = new VBox();
		vaccineLayout.setAlignment(Pos.CENTER);      
		vaccineLayout.getChildren().addAll(vaccineGrid);
		sceneVaccine = new Scene(vaccineLayout, 480, 720);
		
		Label vaccineLabel= new Label("Vaccine Check: y/n");
		vaccineLabel.setTextFill(Color.web("#ffffff"));
		vaccineLabel.setEffect(dropShadow);
		vaccineLabel.setTextAlignment(TextAlignment.CENTER);
		vaccineLabel.setContentDisplay(ContentDisplay.TOP);
		vaccineLabel.setFont(Font.font("rockwell", 35));
		vaccineGrid.add(vaccineLabel, 0, 0, 2, 2);
		
		
		Button buttonVaccine = new Button("Submit");
		buttonVaccine.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		Font buttonVac = new Font(20);
		buttonVaccine.setFont(buttonVac);
		buttonVaccine.setEffect(dropShadow);
		buttonVaccine.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		buttonVaccine.setPrefHeight(60);
		buttonVaccine.setDefaultButton(true);
		buttonVaccine.setPrefWidth(150);
		//Vaccine Grid
		vaccineGrid.add(buttonVaccine, 0, 16, 2, 2);
		GridPane.setHalignment(buttonVaccine, HPos.CENTER);
		GridPane.setMargin(buttonVaccine, new Insets(20, 0,20,0));
		
		
		// Saved Children UX and UI
		VBox layout6 = new VBox();
		//layout6.setAlignment(Pos.CENTER);      
		layout6.getChildren().addAll(gridPane6);
		scene6 = new Scene(layout6, 480, 720);
		
		Button lastHomeButton = new Button("Home");
		lastHomeButton.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		Font lastHome = new Font(20);
		lastHomeButton.setFont(lastHome);
		lastHomeButton.setEffect(dropShadow);
		lastHomeButton.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		lastHomeButton.setPrefHeight(60);
		lastHomeButton.setDefaultButton(true);
		lastHomeButton.setPrefWidth(150);
		GridPane.setHalignment(lastHomeButton, HPos.CENTER);
		
		Label label6= new Label("Saved Children");
		label6.setTextFill(Color.web("#ffffff"));
		label6.setEffect(dropShadow);
		label6.setTextAlignment(TextAlignment.CENTER);
		label6.setContentDisplay(ContentDisplay.TOP);
		label6.setFont(Font.font("rockwell", 35));
		gridPane6.add(label6, 0, 0, 2, 2);
		gridPane6.add(lastHomeButton, 0, 10, 2 ,2);
		gridPane6.add(buttonLoad2, 0, 8, 2, 2);
		GridPane.setHalignment(lastHomeButton, HPos.CENTER);
		
		lastHomeButton.setOnAction(e -> {

			primaryStage.setScene(scene1);

		});  

		
		// Set the background with an IO image
			try {
			// create a input stream 
			FileInputStream input1 = new FileInputStream("momAndBaby.jpg"); 
			// create a image 
			Image image1 = new Image(input1);
			
			FileInputStream input2 = new FileInputStream("backgroundpink.jpg"); 
			// create a image 
			Image image2 = new Image(input2);
			
			


			// create a background image for cover
			BackgroundImage backgroundimage = new BackgroundImage(image1,  BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,  BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT); 
			// create Background 
			Background background = new Background(backgroundimage); 
			
			// create a background image for rest of pages
			BackgroundImage backgroundimage2 = new BackgroundImage(image2,  BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,  BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT); 
			// create Background 
			Background background2 = new Background(backgroundimage2); 

			// set background 
			layout1.setBackground(background);
			layout2.setBackground(background2);
			layout3.setBackground(background2);
			layout4.setBackground(background2);
			layout5.setBackground(background2);
			layout6.setBackground(background2);
			vaccineLayout.setBackground(background2);

			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}


	
	
		//button1 action
		button1.setOnAction(e -> {
		//String userInfo = nameField.getText();
		//String emailInfo = emailField.getText();
		
			//showAlert(Alert.AlertType.CONFIRMATION, gridPane1.getScene().getWindow(), "Registration Successful!", "Welcome " + nameField.getText());
			primaryStage.setScene(scene2);

		});  
		/*
		//button2 action
		buttonLoad.setOnAction(e -> {

		primaryStage.setScene(scene6);
		//trying to implement the CsvReader here
		CsvReader.readCsvFile(fileName);
		});  
		**/
		
		
		//SCENE 2
		// Date Picker in scene 2
		DatePicker datePicker = new DatePicker();
		Label label2= new Label("");
		label2.setTextAlignment(TextAlignment.CENTER);
		label2.setContentDisplay(ContentDisplay.TOP);	
		label2.setFont(Font.font("helvetica", 30));
		gridPane2.add(label2, 0, 0, 2, 2);	
		
		Button button2= new Button("Next");
		button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		Font buttonNextFont = new Font(20);
		button2.setFont(buttonNextFont);
		button2.setEffect(dropShadow);
		button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		button2.setPrefHeight(60);
		button2.setDefaultButton(true);
		button2.setPrefWidth(150);

		//add button to vaccine grid instead of gridPane2
		gridPane2.add(button2, 0, 8, 2, 2);
		GridPane.setHalignment(button2, HPos.CENTER);
		GridPane.setMargin(button2, new Insets(20, 0,20,0));
		
		// create a background fill 

		
		//Scene 2 UI controls
		Label spacer = new Label("Please Enter Your Child's Information");
		spacer.setWrapText(true);
		spacer.setEffect(dropShadow);
		gridPane2.add(spacer, 0,1,3,2);
		spacer.setTextAlignment(TextAlignment.CENTER);
		spacer.setFont(new Font("rockwell", 45));
		spacer.setTextFill(Color.web("#FFFFFF"));
		

		
		Label childName = new Label("Child's Name: ");
		childName.setAlignment(Pos.CENTER_RIGHT);
		childName.setEffect(dropShadow);
		childName.setFont(new Font("helvetica", 20));
		childName.setTextFill(Color.web("#ffffff"));
		gridPane2.add(childName, 0,3);

		TextField childNameField = new TextField();
		childNameField.setPrefHeight(40);
		gridPane2.add(childNameField, 1,3);
		
		Label childDate = new Label("Child's Date of Birth");
		childDate.setEffect(dropShadow);
		childDate.setAlignment(Pos.CENTER_RIGHT);
		childDate.setFont(new Font("helvetica", 20));
		childDate.setTextFill(Color.web("#ffffff"));	
		gridPane2.add(childDate, 0,4);
		gridPane2.add(datePicker, 1,4);
		
		Label childWeight = new Label("Child's Weight (lbs.)");
		childWeight.setEffect(dropShadow);
		childWeight.setAlignment(Pos.CENTER_RIGHT);
		childWeight.setFont(new Font("helvetica", 20));
		childWeight.setTextFill(Color.web("#ffffff"));
		gridPane2.add(childWeight,0,5);	
		
		TextField childWeightField = new TextField();
		childWeightField.setPrefHeight(40);
		gridPane2.add(childWeightField,1,5);
		
		Label childHeight = new Label("Child's Height (inches)");
		childHeight.setEffect(dropShadow);
		childHeight.setAlignment(Pos.CENTER_RIGHT);
		childHeight.setFont(new Font("helvetica", 20));
		childHeight.setTextFill(Color.web("#ffffff"));
		gridPane2.add(childHeight,0,6);	
		
		TextField childHeightField = new TextField();
		childHeightField.setPrefHeight(40);
		gridPane2.add(childHeightField,1,6);
		
		TextField bloodTypeField = new TextField();
		bloodTypeField.setPrefHeight(40);
		gridPane2.add(bloodTypeField,1,7);

		Label bloodType = new Label("Blood Type");
		bloodType.setEffect(dropShadow);
		bloodType.setAlignment(Pos.CENTER_RIGHT);
		bloodType.setFont(new Font("helvetica", 20));
		bloodType.setTextFill(Color.web("#ffffff"));
		gridPane2.add(bloodType,0,7);	

		//VaccineGrid Information:
		Label chickenPoxLabel = new Label("Chickenpox1 ");
		chickenPoxLabel .setAlignment(Pos.CENTER_RIGHT);
		chickenPoxLabel .setEffect(dropShadow);
		chickenPoxLabel .setFont(new Font("helvetica", 20));
		chickenPoxLabel .setTextFill(Color.web("#ffffff"));
		vaccineGrid.add(chickenPoxLabel, 0,3);

		TextField chickenPoxField = new TextField();
		chickenPoxField.setPrefHeight(40);
		vaccineGrid.add(chickenPoxField, 1,3);
		
		Label chickenPox2Label = new Label("Chickenpox2 ");
		chickenPox2Label.setEffect(dropShadow);
		chickenPox2Label.setAlignment(Pos.CENTER_RIGHT);
		chickenPox2Label.setFont(new Font("helvetica", 20));
		chickenPox2Label.setTextFill(Color.web("#ffffff"));	
		vaccineGrid.add(chickenPox2Label, 0,4);
		
		TextField chickenPox2Field = new TextField();
		chickenPox2Field.setPrefHeight(40);
		vaccineGrid.add(chickenPox2Field,1,4);

		Label diphteriaLabel = new Label("Diphteria ");
		diphteriaLabel.setEffect(dropShadow);
		diphteriaLabel.setAlignment(Pos.CENTER_RIGHT);
		diphteriaLabel.setFont(new Font("helvetica", 20));
		diphteriaLabel.setTextFill(Color.web("#ffffff"));
		vaccineGrid.add(diphteriaLabel,0,6);	
		
		TextField diphteriaField = new TextField();
		diphteriaField.setPrefHeight(40);
		vaccineGrid.add(diphteriaField,1,6);
		
		Label haemophilusLabel = new Label("Haemophilus ");
		haemophilusLabel.setEffect(dropShadow);
		haemophilusLabel.setAlignment(Pos.CENTER_RIGHT);
		haemophilusLabel.setFont(new Font("helvetica", 20));
		haemophilusLabel.setTextFill(Color.web("#ffffff"));
		vaccineGrid.add(haemophilusLabel,0,7);	
		
		TextField haemophilusField = new TextField();
		haemophilusField.setPrefHeight(40);
		vaccineGrid.add(haemophilusField,1,7);

		Label hepatitisALabel = new Label("Hepatitis A");
		hepatitisALabel.setEffect(dropShadow);
		hepatitisALabel.setAlignment(Pos.CENTER_RIGHT);
		hepatitisALabel.setFont(new Font("helvetica", 20));
		hepatitisALabel.setTextFill(Color.web("#ffffff"));
		vaccineGrid.add(hepatitisALabel,0,8);
		
		TextField hepatitisAField = new TextField();
		hepatitisAField.setPrefHeight(40);
		vaccineGrid.add(hepatitisAField, 1, 8);
		
		Label hepatitisBLabel = new Label("Hepatitis B");
		hepatitisBLabel.setEffect(dropShadow);
		hepatitisBLabel.setAlignment(Pos.CENTER_RIGHT);
		hepatitisBLabel.setFont(new Font("helvetica", 20));
		hepatitisBLabel.setTextFill(Color.web("#ffffff"));
		vaccineGrid.add(hepatitisBLabel,0,9);
		
		TextField hepatitisBField = new TextField();
		hepatitisBField.setPrefHeight(40);
		vaccineGrid.add(hepatitisBField, 1, 9);
		
		Label influenzaLabel = new Label("Influenza");
		influenzaLabel.setEffect(dropShadow);
		influenzaLabel.setAlignment(Pos.CENTER_RIGHT);
		influenzaLabel.setFont(new Font("helvetica", 20));
		influenzaLabel.setTextFill(Color.web("#ffffff"));
		vaccineGrid.add(influenzaLabel,0,10);
		
		TextField influenzaField = new TextField();
		influenzaField.setPrefHeight(40);
		vaccineGrid.add(influenzaField, 1, 10);
		
		Label mmrLabel = new Label("MMR ");
		mmrLabel.setEffect(dropShadow);
		mmrLabel.setAlignment(Pos.CENTER_RIGHT);
		mmrLabel.setFont(new Font("helvetica", 20));
		mmrLabel.setTextFill(Color.web("#ffffff"));
		vaccineGrid.add(mmrLabel,0,11);
		
		TextField mmrField = new TextField();
		mmrField.setPrefHeight(40);
		vaccineGrid.add(mmrField, 1, 11);
		
		Label meningLabel = new Label("Meningococcal ");
		meningLabel.setEffect(dropShadow);
		meningLabel.setAlignment(Pos.CENTER_RIGHT);
		meningLabel.setFont(new Font("helvetica", 20));
		meningLabel.setTextFill(Color.web("#ffffff"));
		vaccineGrid.add(meningLabel,0,12);
		
		TextField meningField = new TextField();
		meningField.setPrefHeight(40);
		vaccineGrid.add(meningField, 1, 12);
		
		Label polioLabel = new Label("Polio ");
		polioLabel.setEffect(dropShadow);
		polioLabel.setAlignment(Pos.CENTER_RIGHT);
		polioLabel.setFont(new Font("helvetica", 20));
		polioLabel.setTextFill(Color.web("#ffffff"));
		vaccineGrid.add(polioLabel,0,13);
		
		TextField polioField = new TextField();
		polioField.setPrefHeight(40);
		vaccineGrid.add(polioField, 1, 13);
		
		Label rotaLabel = new Label("Rotavirus ");
		rotaLabel.setEffect(dropShadow);
		rotaLabel.setAlignment(Pos.CENTER_RIGHT);
		rotaLabel.setFont(new Font("helvetica", 20));
		rotaLabel.setTextFill(Color.web("#ffffff"));
		vaccineGrid.add(rotaLabel,0,14);
		
		TextField rotaField= new TextField();
		rotaField.setPrefHeight(40);
		vaccineGrid.add(rotaField, 1, 14);
				
		//retrieved information for later

		//get information from date datePicker
		
		// button set on action
		button2.setOnAction(e -> {
			primaryStage.setScene(sceneVaccine);
		
		});
		
		buttonVaccine.setOnAction(e -> {
			chickenpox1Stored = chickenPoxField.getText();
			chickenpox2Stored = chickenPox2Field.getText();
			diphteriaStored = diphteriaField.getText();
			haemophilusStored = haemophilusField.getText();
			hepatitisAStored = hepatitisAField.getText();
			hepatitisBStored = hepatitisBField.getText();
			influenzaStored = influenzaField.getText();
			mmrStored = mmrField.getText();
			meningStored = meningField.getText();
			polioStored = polioField.getText();
			rotavirusStored = rotaField.getText();
			
			primaryStage.setScene(scene3);
			datePickerStored = datePicker.getValue();
			DateTimeFormatter datePickerString = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			String dateString = datePickerStored.format(datePickerString);
			
			
			childNameStored = childNameField.getText();
			bloodTypeStored = bloodTypeField.getText();
			childHeightStored = Integer.parseInt(childHeightField.getText());
			childWeightStored = Integer.parseInt(childWeightField.getText());
			
			
			//create a child class from the CreateChild class
			child1 = new CreateChild(childNameStored, dateString, childWeightStored, childHeightStored, bloodTypeStored, chickenpox1Stored, chickenpox2Stored, diphteriaStored, haemophilusStored, hepatitisAStored, hepatitisBStored, influenzaStored, mmrStored, meningStored, polioStored, rotavirusStored);
			

			

			System.out.println(childNameStored + "'s" + " Information:");
			System.out.println("Child Name: " + childNameStored); 
			System.out.println("Birth Date: " + datePickerStored);
			System.out.println("Blood Type: " + bloodTypeStored);
			System.out.println("Child Height: " + childHeightStored);
			System.out.println("Child Weight: " + childWeightStored);
			System.out.println("");
			System.out.println("---------------------------------------------------------");		
			System.out.println("Below is a list of Vaccination due dates for " + childNameStored + ":");
			System.out.println("Hepatitis B shot due: " + hepatitisBString);
			System.out.println("Meningococcal shot due: " + meningococcalString);
			System.out.println("Polio shot due: " + polioString);
			System.out.println("Diphteria shot due: " + diphteriaString);
			System.out.println("Haemophilus shot due :" + haemophilusString);
			System.out.println("Rotavirus shot due: " + rotavirusString);
			System.out.println("Influenza shot due: " + influenzaString);
			System.out.println("ChickenPox 1 shot due: " + chickenPox1String);
			System.out.println("ChickenPox 2 shot due: " + chickenPox2String);	
			System.out.println("Hepatitis A shot due: " + hepatitisAString);
			System.out.println("MMR shot due: " + mmrString);
		
		});

		
		TableView<Vaccine> table = new TableView<Vaccine>();
		final ObservableList<Vaccine> data = FXCollections.observableArrayList(
			new Vaccine("Chickenpox1", chickenPox1String, "(800) 338-2382"),
			new Vaccine("Chickenpox2", chickenPox2String, "(800) 338-2382"),
			new Vaccine("Diphteria", diphteriaString, "(800) 338-2382"),
			new Vaccine("Haemophilus", haemophilusString, "(800) 338-2382"),
			new Vaccine("Hepatitis A", hepatitisAString, "(800) 338-2382"),
			new Vaccine("Hepatitis B", hepatitisBString, "(800) 338-2382"),
			new Vaccine("Influenza", influenzaString, "(800) 338-2382"),
			new Vaccine("MMR", mmrString, "(800) 338-2382"),
			new Vaccine("Meningococcal", meningococcalString, "(800) 338-2382"),
			new Vaccine("Polio", polioString, "(800) 338-2382"),
			new Vaccine("Rotavirus", rotavirusString, "(800) 338-2382")
		);

		TableColumn columnOne = new TableColumn<>("Vaccine");
		columnOne.setCellValueFactory(new PropertyValueFactory<Vaccine, String>("vaccineName"));
		TableColumn columnTwo = new TableColumn<>("Due Date");
		columnTwo.setCellValueFactory(new PropertyValueFactory<Vaccine, String>("vaccineDate"));
		TableColumn columnThree = new TableColumn<>("Contact");
		columnThree.setCellValueFactory(new PropertyValueFactory<Vaccine, String>("vaccineContact"));
		

		table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
		table.setItems(data);
		table.getColumns().addAll(columnOne, columnTwo, columnThree);
		//tableView.setItems(details2);
		
		gridPane3.add(table, 1,2);
		
		
		Label label = new Label("Vaccine Schedule");
		label.setTextAlignment(TextAlignment.CENTER);
		label.setEffect(dropShadow);
		//label.setAlignment(Pos.CENTER);
		label.setFont(new Font("rockwell", 44));
		label.setTextFill(Color.web("#FFFFFF"));
		table.setEditable(true);

		final VBox vbox = new VBox();
		vbox.setSpacing(5);
		vbox.setPadding(new Insets(10, 0, 0, 10));
		vbox.getChildren().addAll(label);
		


			
		Button button3= new Button("Export Schedule");
		button3.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		Font button2font3 = new Font(20);
		button3.setFont(button2font3);
		button3.setEffect(dropShadow);
		button3.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		button3.setPrefHeight(60);
		button3.setDefaultButton(true);
		button3.setPrefWidth(210);
		
		Button buttonHome= new Button("Home");
		buttonHome.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		Font buttonHomeFont = new Font(20);
		buttonHome.setFont(buttonHomeFont);
		buttonHome.setEffect(dropShadow);
		buttonHome.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		buttonHome.setPrefHeight(60);
		buttonHome.setDefaultButton(true);
		buttonHome.setPrefWidth(210);
		
		Button buttonSave= new Button("Save Child Info");
		button3.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		Font buttonSaver = new Font(20);
		buttonSave.setFont(buttonSaver);
		buttonSave.setEffect(dropShadow);
		buttonSave.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		buttonSave.setPrefHeight(60);
		buttonSave.setDefaultButton(true);
		buttonSave.setPrefWidth(210);
		
		gridPane3.add(vbox, 1,1);
		gridPane3.add(button3, 0, 3, 2, 2);
		gridPane3.add(buttonSave, 0, 5, 2, 2);
		gridPane3.add(buttonHome, 0, 7, 2, 2);
		gridPane3.setHalignment(button3, HPos.CENTER);
		gridPane3.setHalignment(buttonSave, HPos.CENTER);
		gridPane3.setHalignment(buttonHome, HPos.CENTER);
		GridPane.setMargin(button3, new Insets(20, 0,20,0));
		GridPane.setMargin(buttonSave, new Insets(20, 0,20,0));
		GridPane.setMargin(buttonHome, new Insets(20, 0, 20, 0));
		
		buttonHome.setOnAction(e -> {
			primaryStage.setScene(scene1);
		});
		
		
		button3.setOnAction(e -> {
				primaryStage.setScene(scene4);
				showAlert(Alert.AlertType.CONFIRMATION, gridPane1.getScene().getWindow(), "Congrats", "Your File Has Been Exported!\nHere are some more helpful resources:");
				//FileWriter and PrintWriter
				try{
					fileName = "VaccineSchedule.txt";
					FileWriter fw = new FileWriter(fileName);
					PrintWriter outputStream = new PrintWriter(fw);
				
				
				outputStream.println("Your Child's Vaccination Schedule:");
				outputStream.println("");
				outputStream.println("---------------------------------------------------------");
				outputStream.println(childNameStored + "'s" + " Information:");
				outputStream.println("Child Name: " + childNameStored); 
				outputStream.println("Birth Date: " + datePickerStored);
				outputStream.println("Blood Type: " + bloodTypeStored);
				outputStream.println("Child Height: " + childHeightStored);
				outputStream.println("Child Weight: " + childWeightStored);
				outputStream.println("");
				outputStream.println("---------------------------------------------------------");		
				outputStream.println("Below is a list of Vaccination due dates for " + childNameStored + ":");
				outputStream.println("Hepatitis B shot due: " + hepatitisBString);
				outputStream.println("Meningococcal shot due: " + meningococcalString);
				outputStream.println("Polio shot due: " + polioString);
				outputStream.println("Diphteria shot due: " + diphteriaString);
				outputStream.println("Haemophilus shot due :" + haemophilusString);
				outputStream.println("Rotavirus shot due: " + rotavirusString);
				outputStream.println("Influenza shot due: " + influenzaString);
				outputStream.println("ChickenPox 1 shot due: " + chickenPox1String);
				outputStream.println("ChickenPox 2 shot due: " + chickenPox2String);	
				outputStream.println("Hepatitis A shot due: " + hepatitisAString);
				outputStream.println("MMR shot due: " + mmrString);
				outputStream.close();
				}catch(FileNotFoundException ex) {
					System.out.println("File not found");
				}catch(IOException ex) {
					System.out.println("IOException;");
				}
		
		}); 
		
		// Button save needs to implement the CSVWriter
		buttonSave.setOnAction(e -> {
				//having trouble adding pulling from my method
				CreateChild childWriter = new CreateChild(child1.getFirstName(), child1.getAge(), child1.getHeight(), child1.getWeight(), child1.getBloodType(), child1.getChickenpox1(), child1.getChickenpox2(), child1.getDiphteria(), child1.getHaemophilus(), child1.getHepatitisA(), child1.getHepatitisB(), child1.getInfluenza(), child1.getMmr(), child1.getMening(), child1.getPolio(), child1.getRotavirus());
				
				fileChildName = child1.getFirstName()+".csv";
				System.out.println(fileChildName);
				CsvFile file = new CsvFile();
				file.writeCsv(childWriter);
				primaryStage.setScene(scene4);
				showAlert(Alert.AlertType.CONFIRMATION, gridPane1.getScene().getWindow(), "Congrats", "Your Child's Information Has Been Saved!\nHere are some more helpful resources:");

		});   
		
		
		buttonLoad2.setOnAction(e -> {

				loadedChild = loadChildField.getText();
				loadChildField.setText("");
				System.out.println(loadedChild);
				CsvFile file = new CsvFile();
				CreateChild childCreator = file.readCsvFile(loadedChild);
				///import code to import the text
				TextArea labelAdder = new TextArea();
				double height = 500;
				double width = 400;
				labelAdder.setPrefHeight(height);
				labelAdder.setPrefWidth(width);
				gridPane6.add(labelAdder, 0,3);
				labelAdder.appendText("Child Name: " + childCreator.getFirstName() + "\n");
				labelAdder.appendText("Age: " + childCreator.getAge() + "\n");
				labelAdder.appendText("Height: " + childCreator.getHeight() + "\n");
				labelAdder.appendText("Weight: " + childCreator.getWeight() + "\n");
				labelAdder.appendText("Blood Type: " + childCreator.getBloodType() + "\n");
				labelAdder.appendText("\n");
				labelAdder.appendText("Received Chickenpox1 Vaccination? " + childCreator.getChickenpox1() + "\n");
				labelAdder.appendText("Received Chickentpox2 Vaccination? " + childCreator.getChickenpox2() + "\n");
				labelAdder.appendText("Received Diphteria Vaccination? " + childCreator.getDiphteria() + "\n");
				labelAdder.appendText("Received Haemophilus Vaccination? " + childCreator.getHaemophilus() + "\n");
				labelAdder.appendText("Received Hepatitis A Vaccination?: " + childCreator.getHepatitisA() + "\n");
				labelAdder.appendText("Received Hepatitis B Vaccination? " + childCreator.getHepatitisB() + "\n");
				labelAdder.appendText("Received Influenza Vaccination? " + childCreator.getInfluenza() + "\n");
				labelAdder.appendText("Received MMR Vaccination? " + childCreator.getMmr() + "\n");
				labelAdder.appendText("Received Meningitis Vaccination? " + childCreator.getMening() + "\n");
				labelAdder.appendText("Received Polio Vaccination? " + childCreator.getPolio() + "\n");
				labelAdder.appendText("Received Rotavirus Vaccination? " + childCreator.getRotavirus() + "\n");
				

			primaryStage.setScene(scene6);

		});
		

		//SCENE 4
		Label label4= new Label("Helpful Resources");
		label4.setEffect(dropShadow);
		label4.setTextFill(Color.web("#FFFFFF"));
		label4.setFont(Font.font("rockwell", 44));
		label4.setAlignment(Pos.CENTER);
		//gridPane4.add(label4, 0, 0, 2, 2);
		gridPane4.add(label4, 0,0);

		//webViewer and webEngine
		final WebView browser = new WebView();
		browser.setPrefSize(200,350);
		final WebEngine webEngine = browser.getEngine();

		Hyperlink resource1 = new Hyperlink("Center for Disease Control");
		webEngine.load("https://www.cdc.gov/vaccines/parents/resources/index.html");
		gridPane4.add(browser, 0,6);
		
		resource1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				webEngine.load("https://www.cdc.gov/vaccines/parents/resources/index.html");
				gridPane4.add(browser, 0,6);
			}
		});
		
		Hyperlink resource2 = new Hyperlink("National Foundation for Infectious Diseases");
		
		resource2.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				webEngine.load("http://www.nfid.org/links/vaccines");
				gridPane4.add(browser, 0,6);
			}
		});	
		
		Hyperlink resource3 = new Hyperlink("National Vaccine Information Center");

		resource3.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				webEngine.load("https://www.nvic.org/resource-center.aspx");
				gridPane4.add(browser, 0,6);
			}
		});	

		Hyperlink resource4 = new Hyperlink("Immunize.org");
		resource4.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				webEngine.load("http://www.immunize.org/resources/");
				gridPane4.add(browser, 0,6);
			}
		});	

		Hyperlink resource5 = new Hyperlink("VaccineInformation.org");

		resource5.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				webEngine.load("http://www.vaccineinformation.org/trusted-sources/");
				gridPane4.add(browser, 0,6);
			}
		});	

		gridPane4.add(resource1, 0,1);
		gridPane4.add(resource2, 0,2);
		gridPane4.add(resource3, 0,3);
		gridPane4.add(resource4, 0,4);
		gridPane4.add(resource5, 0,5);


		
		HBox bottomBox = new HBox();
		bottomBox.setAlignment(Pos.CENTER);
		bottomBox.getChildren().addAll(btnBottom1, btnBottom4);
		gridPane4.add(bottomBox, 0,7);
		

		
		
		Button button4= new Button("Continue");
		button4.setAlignment(Pos.CENTER);
		button4.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
		button4.setPrefHeight(40);
		button4.setDefaultButton(true);
		button4.setPrefWidth(90);
		
		//gridPane4.add(button4, 0, 7, 2, 2);
		GridPane.setHalignment(button4, HPos.CENTER);
		GridPane.setMargin(button1, new Insets(10, 0,10,0));
		
		button4.setOnAction(e -> primaryStage.setScene(scene5));   

		primaryStage.setScene(scene1);
		primaryStage.show();
	}
	
	
	
	
	private void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
		Alert alert = new Alert(alertType);
	
		alert.setTitle(title);
		alert.setHeaderText(null);
		alert.setContentText(message);
		alert.initOwner(owner);
		alert.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

