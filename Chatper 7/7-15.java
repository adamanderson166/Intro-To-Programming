/*

Author: Adam Anderson
Date: 12/5/2018
This method returns a new array by eliminating the duplicate values in the array...
*/

import java.util.Scanner;

class MethodSmallNumberFinder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] myList = new int[10];
		int[] duplicateArray = new int[10];
		System.out.print("Enter 10 numbers separated by a space: ");	
		for (int i = 0; i < myList.length; i++) {
			myList[i] = input.nextInt();
		}
		System.out.print("List without duplicates is: ");
		duplicateArray = eliminateduplicates(myList);
		for (int i = 0; i < duplicateArray.length; i++)
			if (duplicateArray[i] != 0) {
				System.out.print(duplicateArray[i] + " ");
			}
	}
	
	public static int[] eliminateduplicates(int[] myList) {
		int[] myListTwo = new int[10];
		int numberOfDistinctValues = 10;
		int counter = 0;
		boolean myListCheck = true;
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
		return myListTwo;			
	}
}