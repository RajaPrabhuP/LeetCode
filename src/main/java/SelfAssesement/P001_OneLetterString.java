package SelfAssesement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class P001_OneLetterString {
		
		/*
		 * Create 2 set and identify unique and duplicate char
		 * if duplicate not contains each char and hsetadd each char
		 * 	add to unique cha
		 * else remove the char from unique set and add duplicate set.
		 * */
		//7.20
		public static String oneCharacterString(String str) {
			
			HashSet<Character> uniqueSet = new HashSet<Character>();
			HashSet<Character> duplicate = new HashSet<Character>();
			
			for(int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if(!duplicate.contains(ch) && uniqueSet.add(ch)) {
					uniqueSet.add(ch);
				}else {
					uniqueSet.remove(ch);
					duplicate.add(ch);
				}
			}
			System.out.println(duplicate);
			ArrayList<Character> list = new ArrayList<>(duplicate);
			if(duplicate.size() > 0)
				return String.valueOf(list.get(0));
			//System.out.println(duplicate);
			return "";
			
		}
		
		/*
		 * 1. Using to identify all the Hashmap and identify occurence
		 * 2. EACH char adding intohashmap if the key already have the value retuurn that char
		 * add the each char into map and identify the number
		 * 5 min for code 10 min for logic
		 * */
		public static String oneCharacterStringUsingMap(String str) {
			
			HashMap<Character, Integer> hmap = new HashMap<>();
			
			for(int i = 0; i < str.length(); i++) {
				
				if(hmap.containsKey(str.charAt(i)))
					return String.valueOf(str.charAt(i));
				
				hmap.put(str.charAt(i), 1);
			}
			
			return "";
				
		}
		
		/*Iterate through 2 for loop 
		 * if the character i and j is same return that character*/
		public static String BruteForce(String str) {
			
			for(int i = 0; i < str.length() - 1; i++) {
				for(int j = i + 1; j < str.length(); j++ ) {
					if(str.charAt(i) == str.charAt(j))
						return String.valueOf(str.charAt(i));
				}
			}
			return "";
				
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(oneCharacterString("aabc"));
//		System.out.println(oneCharacterString("abc"));
		
		System.out.println(BruteForce("aav"));
	}

}
