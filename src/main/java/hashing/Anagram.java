package hashing;

import java.util.Arrays;

public class Anagram {

	
	/*Given two strings s and t, return true if t is an anagram of s, and false otherwise. 
	 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
	 * typically using all the original letters exactly once. Constrains: 
	 * s and t consist of lowercase English letters. Input: s = "anagram", t = "nagaram" Output: true*/
	
	public static boolean AnagramWithOutMapSet(String s, String t){
		
		if(s.length() != t.length()) {
			return false;
		}
		
		int[] sArr = new int[26];
		int[] tArr = new int[26];
		
		for(int i = 0; i < s.length(); i++) {
			sArr[s.charAt(i) - 'a']++;
			tArr[t.charAt(i) - 'a']++;
		}
		
		System.out.println(Arrays.toString(sArr));
		System.out.println(Arrays.toString(tArr));
		
		return Arrays.equals(sArr, tArr );	
	}
	public static void main(String[] args) {
		System.out.println(AnagramWithOutMapSet("aaaa", "bbbb"));

	}

}
