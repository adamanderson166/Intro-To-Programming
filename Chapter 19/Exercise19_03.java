/*
Author: Adam Anderson
Date: 4/8/2019

Description: Write the following method that returns a new ArrayList. The new list contains the non-duplicate elements from the original list. Use Exercise19_03.javaPreview the document as the test class.
 */
import java.util.ArrayList;

public class Exercise19_03 {
  public static void main(String[] args) {
    
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(14);
    list.add(24);
    list.add(14);
    list.add(42);
    list.add(25);

    ArrayList<Integer> fixed = removeDuplicates(list);
    
    System.out.println("The old list contains:" + list);
    System.out.println("The adjusted list contains:" + fixed);
  }
  
  // This remove duplicates function removes any duplicates
  
  public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
    ArrayList<E> fixed = new ArrayList<>();
    for (int i = 0; i < list.size(); i++)
      if (!fixed.contains(list.get(i))) 
        fixed.add(list.get(i));
        return fixed;

  }
}