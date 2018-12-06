/*

Author: Adam Anderson
Date: 12/6/2018
This program finds out which lockers are open, after different sets of students change them...
*/

import java.util.Scanner;

class LockerCounter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean[] lockers = new boolean[100];
		for (int student = 1; student <= lockers.length; student++) {
			for (int locker2 = student - 1; locker2 < lockers.length; locker2 += student){
				lockers[locker2] = !lockers[locker2];
			}			
		}
		for (int locker3 = 0; locker3 < lockers.length; locker3++) {
			if (lockers[locker3] == true)
			System.out.println("Locker " + (locker3 + 1) + " is open");
		}
		
	}
}