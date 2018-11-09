/*
Author: Adam Anderson
Date: 11/8/2018
This program contains a method that converts milliseconds to hours, minutes, and seconds...
*/

import java.util.Scanner;

class MillisecondCoverter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		while (true) {
			System.out.print("Enter milliseconds: ");
			long number = input.nextLong();
			System.out.println("Time is " + convertMillis(number));
			break;
		}
		System.out.println("Stops");
		}
		
		public static String convertMillis(long millis) {
			long totalMilliseconds = millis;
			long totalSeconds = totalMilliseconds / 1000;
			long currentSecond = totalSeconds % 60;
			long totalMinutes = totalSeconds / 60;
			long currentMinute = totalMinutes % 60;
			long totalHours = totalMinutes / 60;
			
			return totalHours + ":" + currentMinute + ":" + currentSecond;
		}
}