/*
Author: Adam Anderson
Date: 10/16/2018
This program finds the four perfect numbers less than 10,000...
*/

class PerfectNumberFinder {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10000; i++) {
			for (int j = 1; j <= i / 2; j++){
				if (i % j == 0) {
					sum += j;	
				}
			}
			if (i == sum) {
				System.out.print(i + " ");
			}	
			sum = 0;	
		}
	}
}