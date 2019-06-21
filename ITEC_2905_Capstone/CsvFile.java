import java.io.*; 
import javafx.scene.control.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CsvFile {
	//Delimiter used in CSV file
	private final String DELIMITER = ",";
	
	//Child attributes indexes
	private final int CHILDNAME = 0;
	private final int CHILDAGE = 1;
	private final int CHILDHEIGHT = 2;
	private final int CHILDWEIGHT = 3; 
	private final int CHILDBLOODTYPE = 4;
	private final int CHICKEN1 = 5;
	private final int CHICKEN2 = 6;
	private final int DIPHTERIA = 7;
	private final int HAEMOPHILUS = 8; 
	private final int HEPA = 9;
	private final int HEPB = 10;
	private final int INFLUENZA = 11;
	private final int MMR = 12;
	private final int MENING = 13; 
	private final int POLIO = 14;
	private final int ROTAVIRUS = 15;
	private final String SEPARATOR = "\n";
	private final String HEADER = "firstName, age, height, weight, bloodType, chickenPox1, chickenPox2, diphteria, haemophilus, hepatitisA, hepatitisB, influenza, mmr, mening, polio, rotavirus";
		
	public CsvFile () {
	}

	public void writeCsv(CreateChild childWriter) {

		try {
			FileWriter fileWriter = new FileWriter(childWriter.getFirstName() + "child.csv");

			//Write the CSV file header
			fileWriter.append(HEADER.toString());

			//Add a new line separator after the header
			fileWriter.append(SEPARATOR);

			//Write a new child object list to the CSV file
			fileWriter.append(childWriter.getFirstName());
			fileWriter.append(DELIMITER);
			fileWriter.append(String.valueOf(childWriter.getAge()));
			fileWriter.append(DELIMITER);
			fileWriter.append(String.valueOf(childWriter.getWeight()));
			fileWriter.append(DELIMITER);
			fileWriter.append(String.valueOf(childWriter.getHeight()));
			fileWriter.append(DELIMITER);
			fileWriter.append(childWriter.getBloodType());
			fileWriter.append(DELIMITER);
			fileWriter.append(childWriter.getChickenpox1());
			fileWriter.append(DELIMITER);
			fileWriter.append(childWriter.getChickenpox2());
			fileWriter.append(DELIMITER);
			fileWriter.append(childWriter.getDiphteria());
			fileWriter.append(DELIMITER);
			fileWriter.append(childWriter.getHaemophilus());
			fileWriter.append(DELIMITER);
			fileWriter.append(childWriter.getHepatitisA());
			fileWriter.append(DELIMITER);
			fileWriter.append(childWriter.getHepatitisB());
			fileWriter.append(DELIMITER);
			fileWriter.append(childWriter.getInfluenza());
			fileWriter.append(DELIMITER);
			fileWriter.append(childWriter.getMmr());
			fileWriter.append(DELIMITER);
			fileWriter.append(childWriter.getMening());
			fileWriter.append(DELIMITER);
			fileWriter.append(childWriter.getPolio());
			fileWriter.append(DELIMITER);
			fileWriter.append(childWriter.getRotavirus());
			fileWriter.append(SEPARATOR);
			//trying to append the vaccine information
			//fileWriter.append(Vaccine.getVaccineName());

			System.out.println("CSV file created successfully");
			
			
			fileWriter.flush();
			fileWriter.close();

		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter");
			e.printStackTrace();
		}
	}
	
	public CreateChild readCsvFile(String name) {
		
		CreateChild child = new CreateChild();
	 
		try {
			
			String line = "";
			//Create the file reader
			BufferedReader fileReader = new BufferedReader(new FileReader(name + "child.csv"));
			

			fileReader.readLine();

			String[] checker = line.split(DELIMITER);
			
			System.out.println("Print child");
			
			for (int i = 0; i < checker.length; i++) {
				System.out.println("'" + checker[i] + "', ");
			}
			
			if (checker.length > 0) {
				
				//Parsing String!!
				//Create a new child object and insert data
				child.setFirstName(checker[CHILDNAME]);
				child.setAge(checker[CHILDAGE]);
				child.setHeight(Integer.parseInt(checker[CHILDHEIGHT]));
				child.setWeight(Integer.parseInt(checker[CHILDWEIGHT]));
				child.setBloodType(checker[CHILDBLOODTYPE]);
				child.setChickenpox1(checker[CHICKEN1]);
				child.setChickenpox2(checker[CHICKEN2]);
				child.setDiphteria(checker[DIPHTERIA]);
				child.setHaemophilus(checker[HAEMOPHILUS]);
				child.setHepatitisA(checker[HEPA]);
				child.setHepatitisB(checker[HEPB]);
				child.setInfluenza(checker[INFLUENZA]);
				child.setMmr(checker[MMR]);
				child.setMening(checker[MENING]);
				child.setPolio(checker[POLIO]);
				child.setRotavirus(checker[ROTAVIRUS]);
				
			}
			
			//Print the new child list
			System.out.println(child.toString());
			
			fileReader.close();
		} 
		catch (Exception e) {
			System.out.println("Error in CsvReader");
			e.printStackTrace();
		} 
		
		return child;
	}

}