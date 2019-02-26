/*
Author: Adam Anderson
Date: 2/19/2018
This program writes a method that removes the duplicate elements from an array list of integers
*/

import java.util.ArrayList;
import java.util.Scanner;

class RemoveDuplicate {
	public static void main(String[] args) {
	ArrayList<Integer> list = new ArrayList<>();
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter ten integers: ");
	for (int i = 0; i < 10; i++) {
		list.add(input.nextInt());
	}		
	removeDuplicate(list);
	
	
	
	}
	
	public static void removeDuplicate(ArrayList<Integer> list) {
		ArrayList<Integer> listTemp = new ArrayList<>();
		
		int value = 0;
		for (int j = 0; j < list.size(); j++) {
			if (!listTemp.contains(list.get(j))){
				listTemp.add(list.get(j));
			}	
		}
		System.out.print("The distinct integers are: " + listTemp.toString() + " ");
	}
}

	
	