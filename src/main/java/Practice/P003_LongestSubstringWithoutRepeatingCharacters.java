package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class P003_LongestSubstringWithoutRepeatingCharacters {
	
	 public static int lengthOfLongestSubstring(String s) {
		if(s.length() == 1)
			return 1;
		 int left = 0, right = 0;
		 String subStr = "";
		 HashSet<Character> hset = new HashSet<Character>();
		 int max = 0;
		 
		 while(right < s.length()) {
			 
			 if(hset.contains(s.charAt(right))) {
				 max = Math.max(max, right - left);
				 hset.remove(s.charAt(left++));				
			 }else {
				 hset.add(s.charAt(right++));
			 }
			 max = Math.max(max, right - left );
			
			 
		 }
		 System.out.println(max);
		 return max;
		 
	 }
	 
	 public static int lengthOfLongestSubstringUma(String s) {
			
			List<String> substrings = new ArrayList<>();
			
			
			for(int i=0; i< s.length();i++) {
				int end =i+1;
				   while(end<=s.length()) {
					   substrings.add(s.substring(i,end));
					   end++;
				   }
			}
			  // System.out.println(substrings);
			   
			   int size=0;
			   for (String string : substrings) {
				   HashSet<Character> schar =new HashSet<>();
				   for (Character character : string.toCharArray()) 
					   schar.add(character);
				   if(schar.size() == string.length())
					  size =Math.max(size, schar.size());
			}
			//System.out.println(size);
			return size;
		        
		    }
	
	
	public static void main(String[] args) {
		lengthOfLongestSubstring("abcabcbb");
		lengthOfLongestSubstring("bbbbb");
		lengthOfLongestSubstring("pwwkew");
		lengthOfLongestSubstring(" ");
		lengthOfLongestSubstring("au");
		lengthOfLongestSubstring("dvdf");
		lengthOfLongestSubstring("dvddddddvfghif");
		
		
		
		
		//lengthOfLongestSubstringUma("abcabcbb");
		
		

	}

}
