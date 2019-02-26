/*
Author: Adam Anderson
Date: 2/21/2018
This program creates a file named Exercise12_15.txt if it does not exist. Write 100 integers created randomly into the file using text I/O.
*/
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

class Ex12_15 {
	public static void main(String[] args) throws Exception {
		File file = new File("Exercise12_15.txt");
		
		writeFile(file);
		readFile(file);

//		int[] intsSort = new int[100];		
//		Arrays.sort(intsSort);
//		System.out.println(intsSort);
		
	}
	
	public static void writeFile(File file) throws IOException {
		if (file.exists()) {
			System.out.println("File already exists");
			return;
		
		}
		try (
			java.io.PrintWriter output = new java.io.PrintWriter(file);	
		) {
		// Random int creation and toString print:
			int[] intsRandom = new int[100];
			for (int i = 0; i < intsRandom.length; i++) {
				intsRandom[i] = (int)(Math.random() * 10);
			}
			for (int i = 0; i < intsRandom.length; i++) {
				output.print(intsRandom[i] + " ");
			}	
		}
	}
	
	public static void readFile(File file) throws IOException {
		Scanner input = new Scanner(file);		
		int[] intsSort = new int[100];
		for (int j = 0; j < intsSort.length; j++) {
			intsSort[j] = input.nextInt();
		}
		Arrays.sort(intsSort);
		System.out.println(Arrays.toString(intsSort));
	}
}



