/*
Adam Anderson
4/7/2019
(setToList) Write the following method that returns an ArrayList from a set.
public static <E> ArrayList<E> setToList(Set<E> s)
**/

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Ex_27_11 {
	public static void main(String[] args) {
		//Create a set of strings
		Set<String> elementSet = new HashSet<>();
		elementSet.add("Uranium");
		elementSet.add("Sodium");
		elementSet.add("Nitrogen");
		elementSet.add("Hyrdogen");
		elementSet.add("Carbon");
		elementSet.add("Titanium");
		elementSet.add("Potassium");
		//Print out the elements in the set
		
		ArrayList<String> elementList = setToList(elementSet);
		//print the elementList
		System.out.println("The ArrayList contains the following indices: ");
		System.out.println(elementList);
	}
	
	public static <E> ArrayList<E> setToList(Set<E> element) {
		//ArrayList assigned from assignment
		ArrayList<E> elementList = new ArrayList<>();
		//for each loop that traverses through the array list
		for (E e: element) {
			elementList.add(e);
		}
		return elementList;
	}
}