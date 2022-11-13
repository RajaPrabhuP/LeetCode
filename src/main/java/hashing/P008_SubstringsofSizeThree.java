package hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class P008_SubstringsofSizeThree {

	//https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/
	
	 public static int countGoodSubstrings(String s) {
		if(s.length() < 3)
			return -1;
		 
		 String subStr = "";
		int counter = 0;
		
		 for(int i = 0; i < s.length() - 2; i++) {
			 subStr = s.substring(i, i+3);
			 System.out.println(subStr);
			 HashSet<Character> hset = new HashSet<Character>();
			
			 for(int j = 0; j < subStr.length(); j++) {
				 hset.add(subStr.charAt(j));
			 }
			 if(hset.size() == 3 )
				 counter++;
			 hset.clear();
			 }
		 System.out.println(counter);
		 return counter;
	        
	    }
	 
	 
	 public static int slidinWindow(String s) {
		 
		 int winSize = 0, counter = 0, start = 0;
	 
		 HashSet<Character> hset = new HashSet<Character>();
		 
		 for(int i = 0; i < s.length(); i++) {
			 winSize++;
			 if(!hset.add(s.charAt(i))) {
				 
				 while(start <= i) {
					 hset.remove(s.charAt(start));
					 winSize++;
					 start++;
				 }
				 
			 }else if(winSize == 3) {
				 hset.remove(s.charAt(start));
				 counter++;
				 start++;
				 winSize--;
			 }
			 
			 
		 }
		 
		 
		 return 0;
			
		        
		    }
	public static void main(String[] args) {
		
		countGoodSubstrings("aababcabc");
		countGoodSubstrings("a");
	}

}
