/*

Author: Adam Anderson

Date: 11/28/2018

This program displays a list of distinct numbers, and numbers that aren't duplicates

*/

import java.util.Scanner;

class NumberDisplayer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] myList = new int[10];
		int[] myListTwo = new int[10];
		int numberOfDistinctValues = 10;
		int counter = 0;

		System.out.print("Enter 10 numbers separated by a space: ");	

		boolean myListCheck = true;

		for (int i = 0; i < myList.length; i++) {
			myList[i] = input.nextInt();
		}

		for (int j = 0; j < myList.length; j++) {
			for (int k = 0; k < myList.length; k++){
				if (myList[j] == myListTwo[k]){
					myListCheck = false;
					numberOfDistinctValues--;
				}
				
			}
			if (myListCheck) {
				myListTwo[counter] = myList[j];
				counter++;
				
			}
			myListCheck = true;
		}
		System.out.println("The number of distinct numbers is " + numberOfDistinctValues);
		System.out.print("List without duplicates is: ");
		for (int i = 0; i < myListTwo.length; i++)
			if (myListTwo[i] != 0) {
			System.out.print(myListTwo[i] + " ");
			}
	}
}