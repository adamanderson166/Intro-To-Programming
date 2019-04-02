/*
Adam Anderson
3/29/2019
(Compute greatest common divisor using recursion) The gcd(m, n) can also be defined recursively as follows:

If m%n is 0, gcd(m, n) is n.
Otherwise, gcd(m, n) is gcd(n, m%n).

Write a recursive method to find the GCD. Write a test program that prompts the user to enter two integers and displays their GCD.
*/

import java.util.Scanner; 

public class GCD_Recursive {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int max = input.nextInt();
		int min = input.nextInt();
		System.out.println("GCD is " + gcd(max, min));
	}
	
	public static int gcd(int max, int min){
		if (max % min == 0)
			return min;
		else
			return gcd(min, max % min);	
	}
}	