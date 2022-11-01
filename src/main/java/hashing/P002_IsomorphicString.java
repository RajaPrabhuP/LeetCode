package hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class P002_IsomorphicString {
	 public static boolean isIsomorphic(String s, String t) {
		
		 if(s.length() != t.length())
			 return false;
		 
		 HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
		 HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();
		 
		 for(int i = 0; i < s.length(); i++) {
			 
			 sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
			 tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
		 }
		 System.out.println(sMap.values());
		 System.out.println(tMap.values());
		 return new ArrayList(sMap.values()).equals(new ArrayList(tMap.values()));	 
	        
	    }
	
	 
	 public static boolean isIsomorphicOptimized(String s, String t) {
			
		 if(s.length() != t.length())
			 return false;
		 
		 HashMap<Character, Character> sMap = new HashMap<Character, Character>();
		 HashMap<Character, Character> tMap = new HashMap<Character, Character>();
		 
		 for(int i = 0; i < s.length(); i++) {
			 char sChar = s.charAt(i);
			 char tChar = t.charAt(i);
			if(sMap.containsKey(sChar) && sMap.get(sChar) != tChar) {
				return false;
			}
			if(tMap.containsKey(tChar) && tMap.get(tChar) != sChar) {
				return false;
			}
			
			sMap.put(sChar, tChar);
			tMap.put(tChar, sChar);
			
		 }
		return true;
		 
	        
	    }
	 
	 public static boolean isIsomorphicOptimizedSingleMap(String s, String t) {
			
		 if(s.length() != t.length())
			 return false;
		 
		 HashMap<Character, Character> sMap = new HashMap<Character, Character>();
				 
		 for(int i = 0; i < s.length(); i++) {
			 char sChar = s.charAt(i);
			 char tChar = t.charAt(i);
			if((sMap.containsKey(sChar) && sMap.get(sChar) != tChar) || (sMap.containsKey(tChar) && sMap.get(tChar) != sChar)) {
				return false;
			}
			sMap.put(sChar, tChar);
			sMap.put(tChar, sChar);
		 }
		return true;
		 
	        
	    }
	public static void main(String[] args) {
		System.out.println(isIsomorphicOptimized("egg","add"));
		System.out.println(isIsomorphicOptimized("foo", "bar"));
		System.out.println(isIsomorphicOptimized("bbbaaaba", "aaabbbba"));
		
		System.out.println(isIsomorphicOptimizedSingleMap("egg","add"));
		System.out.println(isIsomorphicOptimizedSingleMap("foo", "bar"));
		System.out.println(isIsomorphicOptimizedSingleMap("bbbaaaba", "aaabbbba"));
	
		System.out.println(isIsomorphicOptimized("paper", "title"));

	}

}
