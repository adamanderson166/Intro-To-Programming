/*
Author: Adam Anderson
Date: 10/4/2018
This program will display the cost of a trip, using mpg, ppg, and driving distance:
*/

import java.util.Scanner;

class costOfTripFormula {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the driving distance: ");
		double drivingDistance = input.nextDouble();
		System.out.print("Enter the miles per gallon: ");
		double milesPerGallon = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		double pricePerGallon = input.nextDouble();
		double costOfDriving = (drivingDistance / milesPerGallon) * pricePerGallon;
		
		System.out.print("The cost of driving is $" + costOfDriving);

		input.close();
	}
}