package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P001_most_common_word {

	//https://leetcode.com/problems/most-common-word/description/
	/*
	 * 1. Banned word array stored into Hashset
	 * 2. Paragarah should convert into lowercase and replace all the special character and split the staring with delimiter space
	 * 3. create Map with key as String and value is Int
	 * 3. using for loop iterate through the string array
	 * 4. if the word is not present in the hashset and it stored to hmap
	 * 5. after that we can get all the value and sort to identify the maximum word
	 * 
	 * */
	public static String most_common_word(String paragraph, String[] banned) {
		
		
			HashSet<String> bannedSet = new HashSet<String>();
			HashMap<String, Integer> hmapWordtoCount = new HashMap<String, Integer>();
			for (String word : banned)
				bannedSet.add(word.toLowerCase());
				
		String[] paraWords = paragraph.toLowerCase().replaceAll("[!?',;.]", "").split(" ");
				
		for (String eachWordinPara : paraWords) {
			if(!bannedSet.contains(eachWordinPara.trim()))
				hmapWordtoCount.put(eachWordinPara, hmapWordtoCount.getOrDefault(eachWordinPara, 0) + 1);
		}
		
		Collection<Integer> values = hmapWordtoCount.values();
		ArrayList<Integer> value = new ArrayList<Integer>(values);
		Collections.sort(value);
		 
		for(Map.Entry<String, Integer> entry : hmapWordtoCount.entrySet()) {
			if(entry.getValue() == value.get(value.size() - 1)){
				
				
				System.out.println(entry.getKey());
				return entry.getKey();
			}
		}
		   
				System.out.println(value.get(value.size() - 1));
				return paragraph;
		
		
	}
	
	
	public static void main(String[] args) {
	
		most_common_word("Bob hit a ball, the hit BALL flew far after it was hit.", new String[] {"hit"});
		
		
		

	}

}
