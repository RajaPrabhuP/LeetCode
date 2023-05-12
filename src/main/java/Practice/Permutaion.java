package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class Permutaion {
		/*Input: s1 = "ab", s2 = "eidbaooo"
			Output: true
			Explanation: s2 contains one permutation of s1 ("ba").*/
	/*
	 * Test Data:
	 * +ve = s1 = "ab" s2 = "abab"
	 * -ve = s1 = "ab" s2 = "a"
	 * edge s1 = "" s2 = "ava"
	 * */
	
	public static boolean permutationOdString(String s1, String s2) {
		HashMap<Character, Integer> tempMap = new HashMap<>();
		for(int i = 0; i < s1.length(); i++)
				tempMap.put(s1.charAt(i), tempMap.getOrDefault(s1.charAt(i), 0) + 1);
		
		for(int i = 0; i <= s2.length() - s1.length(); i++) {
			String subStr = s2.substring(i, i + 2);
			HashMap<Character, Integer> map = new HashMap<>();
			for(int j = 0; j < subStr.length(); j++)
				map.put(s2.charAt(j), map.getOrDefault(s2.charAt(j), 0) + 1);
//			System.out.println(tempMap);
//			System.out.println(map);
			if(tempMap.equals(map))
				return true;
			
		}
			
		
		return false;
		
	}
	
	public static boolean optimizedPermutation(String s1, String s2) {
		HashMap<Character, Integer> tempMap = new HashMap<>();
		for(int i = 0; i < s1.length(); i++)
				tempMap.put(s1.charAt(i), tempMap.getOrDefault(s1.charAt(i), 0) + 1);
		
		char[] s2Arr = s2.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i < s2.length(); i++) {
			
			
			
		}
		
		return false;
		
	}
	
	public static boolean permutationIsPresent(String s1, String s2) throws Exception{
		if(s1.length() > s2.length())
			throw new Exception("S1 Length is greater then S2.");

		HashMap<Character, Integer> hmap = new HashMap<>();

		for(int j = 0; j < s1.length(); j++){
		hmap.put(s1.charAt(j), hmap.getOrDefault(s1.charAt(j), 0) + 1);
		}

		char[] chArr = s2.toCharArray();
		
		HashMap<Character, Integer> tMap = new HashMap<>();
		 
		for(int k = 0; k < s1.length(); k++){
			tMap.put(s2.charAt(k), tMap.getOrDefault(s2.charAt(k), 0) + 1);
		}
		
		if(hmap.equals(tMap))
			return true;

		for(int l = s1.length() + 1; l < s2.length(); l++){
			tMap.put(s2.charAt(l), tMap.getOrDefault(s2.charAt(l), 0) + 1);
			char ch = s2.charAt(l - s1.length());
			if(tMap.get(ch) == 1){
				tMap.remove(ch);
			}else{
				tMap.put(ch , tMap.get(ch) - 1);	
			}

			if(tMap.equals(hmap))
				return true;
			
		}

		return false;

		}
	
	public static void objLearn() {
		Object[] obj = new Object[2];
		ArrayList<String> L = new ArrayList<>();
		
		LinkedList<String> al = new LinkedList<>();
		al.
		
		obj[0] = 1;
		obj[1] = "ss";
		System.out.println(Arrays.toString(obj));
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		System.out.println(permutationIsPresent("xu", "ababab"));
//		//System.out.println(permutationIsPresent("abc", "a"));
//		System.out.println(permutationIsPresent("xu", "ababab"));
//		System.out.println(permutationIsPresent("ab", "ababab"));
		objLearn();
	}

}
