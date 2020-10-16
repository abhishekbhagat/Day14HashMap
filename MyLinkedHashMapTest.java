package com.bridgelabz.problemday14;

import org.junit.Assert;

import org.junit.Test;

public class MyLinkedHashMapTest {
	@Test
	public void givenASentenceWhenWordAreAddedToListShouldReturnFrequency() {
		String sentence = "Paranoids are not paranoid because they are paranoid because they keep putting themselves deliberately into paranoid avoidable situations";
		String words[] = sentence.split(" ");
		MyLinkedHashMap<String, Integer> myLinkedHashMap = new MyLinkedHashMap<>();
		for (String word : words) {
			if (myLinkedHashMap.get(word) == null)
				myLinkedHashMap.add(word, 1);
			else {
				int frequency = myLinkedHashMap.get(word);
				frequency++;
				myLinkedHashMap.add(word, frequency);
			}
		}
		int frequency = myLinkedHashMap.get("paranoid");
		Assert.assertEquals(3, frequency);
	}
}
