/*
Adam Anderson
4/22/2019
(Revise Listing 21.9, CountOccurrenceOfWords.java) Rewrite Listing 21.9 to display the words in ascending order of occurrence counts.
(Hint: Create a class named WordOccurrence that implements the Comparable interface. The class contains two fields, word and count. The compareTo method compares the counts. For each pair in the hash set in Listing 21.9, create an instance of WordOccurrence and store it in an array list. Sort the array list using the Collections.sort method. What would be wrong if you stored the instances of WordOccurrence in a tree set?)
*/

import java.util.*;

public class CountOccurrenceOfWords_Ascending {
	public static void main(String[] args) {
		// Set text in a string
		String text = "Good morning. Have a good class. " +
			"Have a good visit. Have fun!";

		// Create a TreeMap to hold words as key and count as value
		Map<String, Integer> map = new TreeMap<>();

		String[] words = text.split("[\\s+\\p{P}]");
		for (int i = 0; i < words.length; i++) {
			String key = words[i].toLowerCase();
			
			if (key.length() > 0) {
				if (!map.containsKey(key)) {
					map.put(key, 1);
				}
				else {
					int value = map.get(key);
					value++;
					map.put(key, value);
				}
			}
		}

		// Display key and value for each entry
		
		List<WordOccurrence> list = new ArrayList<>();
		map.forEach((k, v) -> list.add(new WordOccurrence(k, v)));
		Collections.sort(list);
		list.forEach((word) -> System.out.println(word.word + "\t" + word.count));
	}
	
	//Implemenets a comparable
	private static class WordOccurrence implements Comparable<WordOccurrence> {
		int count;
		String word;
		
		//Setup the WordOccurrence with appropriate parameters
		public WordOccurrence(String word, Integer count) {
			this.word = word;
			this.count = count;
		}
		//Create an override
		@Override
		public int compareTo(WordOccurrence check) {
			if (check.count > count)
				return -1;
			else if (check.count < count)
				return 1;
			else
				return 0;	
		}
		
	}
	
}