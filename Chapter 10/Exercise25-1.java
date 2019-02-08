/*
Author: Adam Anderson
Date: 2/8/2018
This program creates a split method that returns an array of strings split by a delimiter called regex.
*/

public class Exercise25 {
	public static String[] split(String s, String regex){
		String[] split = s.split(regex);
		String[] newSplit;			
		int count = 0;

		if (s.substring(s.length() - 1).equals(regex)) {
			newSplit = new String[split.length * 2];
		}
		else{
			// String[] newSplit = new String[size] 
			newSplit = new String[(split.length * 2) - 1];
		}
		 	
		for (int i = 0; i < split.length; i++){
			newSplit[count] = split[i];
			count+= 2;
		}
		for (int i = 1; i < newSplit.length; i+= 2){
			newSplit[i] = regex;
		}
		return newSplit;
	}
	
	public static void main(String[] args) {
		String[] split = split("ab#12#453", "#");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
	}
}