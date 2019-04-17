/*
Author: Adam Anderson
Date: 4/9/2019

Description: (Sort ArrayList) Write the following method that sorts an ArrayList. Use Exercise19_03.java as the test class.
*/
import java.util.ArrayList;

public class Exercise19_09 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(14);
    list.add(24);
    list.add(4);
    list.add(42);
    list.add(5);
    
    System.out.println("Here's what the first Array List looks like: " + list);
    Exercise19_09.<Integer>sort(list);
    System.out.println("");
    System.out.println("Here's what the sorted Array List looks like: " + list);
  }
  
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        
        //declaring the currentMin variable
        E currentMin;
        //declaring min variable
        int min;
        for (int i = 0; i < list.size(); i++) {
          currentMin = list.get(i);
          min = i;
          for(int j = i + 1; j < list.size(); j++) {
            if(currentMin.compareTo(list.get(j)) > 0) {
              min = j;
              currentMin = list.get(j);
            }
        }
        
        if (min != i) {
          list.set(min, list.get(i));
          list.set(i, currentMin);
        }
      }
    }
}
