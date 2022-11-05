package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P001_FindAllAnagramsinaString {

	//https://leetcode.com/problems/find-all-anagrams-in-a-string/
	
	//Time => O[n * m]
public static List<Integer> findAnagrams(String s, String p) {
		
		if(s.length() < p.length())
			return null;
		
		List<Integer> result = new ArrayList<Integer>();
		HashMap<Character, Integer> pMap = new HashMap<Character, Integer>();
		String subStr = "";
	
	for(int i = 0; i < p.length(); i++) {
		pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0) + 1);
	}
	
	for(int j = 0; j < s.length() - p.length() + 1;  j++) {
		subStr = s.substring(j, j + p.length());
		HashMap<Character, Integer> tempMap = new HashMap<Character, Integer>();
		System.out.println(subStr);
	
		for(int k = 0;  k < subStr.length(); k++) {
			tempMap.put(subStr.charAt(k), tempMap.getOrDefault(subStr.charAt(k), 0) + 1);
		}
		
		if(pMap.equals(tempMap)) {
			result.add(j);
		}
	}
	System.out.println(result);
	return result;
        
    }

		public static List<Integer> findAnagramsOptimizedSliding(String s, String p) {
			
			if(s.length() < p.length())
				return null;
			
			List<Integer> result = new ArrayList<Integer>();
			HashMap<Character, Integer> pMap = new HashMap<Character, Integer>();
			HashMap<Character, Integer> tempMap = new HashMap<Character, Integer>();
			String subStr = "";
		
		for(int i = 0; i < p.length(); i++) {
			pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0) + 1);
		}
		
		int left = 0, right = 0;
		for(int k = 0;  k < p.length(); k++) {
			tempMap.put(s.charAt(k), tempMap.getOrDefault(s.charAt(k), 0) + 1);
		}
		if(pMap.equals(tempMap)) {
			result.add(left);
		}
		right = p.length();
		//System.out.println(right);
		while(right < s.length()) {
			
			tempMap.put(s.charAt(right), tempMap.getOrDefault(s.charAt(right), 0) + 1);
			if(tempMap.get(s.charAt(left)) == 1) {
				tempMap.remove(s.charAt(left));
			}else {
				tempMap.put(s.charAt(left), tempMap.get(s.charAt(left)) - 1);
			}
			
			if(pMap.equals(tempMap)) {
				result.add(left+1);
			}
			right++;
			left++;
			//System.out.println(tempMap);
			//System.out.println(result);
		}
		//System.out.println(tempMap);
		System.out.println(result);
		return result;
		
		    
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//findAnagrams("cbaebabacd", "abc");
		//findAnagrams("abab", "ab");
		findAnagramsOptimizedSliding("cbaebabacd", "abc");
		//findAnagramsOptimizedSliding("abab", "ab");
	}

}
