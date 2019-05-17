/*
Adam Anderson
4/7/2019
(Implement hashCode for string) Write a method that returns a hashcode for string using the approach described in Section 27.3.2 with b value 31. The function header is as follows:
public static int hashCodeForString(String s)
**/

public class HashCodeString {
	public static void main(String[] args) {
		//String of elements (periodic table)
		String[] elementList = {"Uranium", "Sodium", "Nitrogen", "Oxygen", "Aluminum"};
		// for each loop that traverse through the elements
		for (String indElement : elementList) {
			System.out.println("Hash code of " + indElement + " is " + HashCodeForString(indElement));
			System.out.println("");
		}
	}
	
	public static int HashCodeForString(String elements) {
		int b = 31;
		int hashCode = 0;
		//Create a for loop that traverses the elements string, then assign the hasCode
		for (int i = 0; i < elements.length(); i++) {
			hashCode = b * hashCode + (int)elements.charAt(i);
		}
		//Create a return for the hashcode int
		return hashCode;
	}	
}