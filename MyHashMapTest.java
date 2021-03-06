package com.bridgelabz.problemday14;

import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTest {
	/**
	 * uc1
	 * 
	 */
	@Test
	public void givenASentenceWhenWordAreAddedToListShouldReturnFrequency() {
		String sentence = "To be or not to be";
		String words[] = sentence.split(" ");
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		for (String word : words) {
			if (myHashMap.get(word) == null)
				myHashMap.add(word, 1);
			else {
				int frequency = myHashMap.get(word);
				frequency++;
				myHashMap.add(word, frequency);
			}
		}
		int frequency = myHashMap.get("be");
		Assert.assertEquals(2, frequency);
	}

	/**
	 * uc3
	 * 
	 */
	@Test
	public void givenASentenceWhenWordAreRemoveToListShouldReturnFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid because they keep putting themselves deliberately into paranoid avoidable situations";
		String words[] = sentence.split(" ");
		MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
		for (String word : words) {
			if (myHashMap.get(word) == null)
				myHashMap.add(word, 1);
			else {
				int frequency = myHashMap.get(word);
				frequency++;
				myHashMap.add(word, frequency);
			}
		}
		int frequency = myHashMap.remove("avoidable");
		Assert.assertEquals(null, myHashMap.get("avoidable"));

	}

}
