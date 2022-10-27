package slidingWindow;

public class P007_LongestPalindromicSubstring {

	
	/*
	 * https://leetcode.com/problems/longest-palindromic-substring/
	 * Given a string s, return the longest palindromic substring in s.

A string is called a palindrome string if the reverse of that string is the same as the original string.
	
	+ve -> "babad" bab
	edge -> aaaaaaaa aaaaaa
	-ve  -> abcdef - ""
 	Pseudo code for BruteForce:
	 * */
	
	public static boolean isPalindrome(String s) {
		
		if(s.length() <= 1)
			return true;
		
		int start = 0, end = s.length() - 1;
		
		while(start < end ) {
			if(s.charAt(start++) != s.charAt(end--))
				return false;
		}
		return true;
		
		
	}
	
	
	 public static String longestPalindrome(String s) {
		
		 String result = "";
		 String substr = "";
		 int max = Integer.MIN_VALUE;
		 
		 for(int i = 0; i < s.length(); i++) {
			 for(int j = s.length(); j > i; j--) {
				 substr = s.substring(i, j);
				if(isPalindrome(substr)) {
				if(substr.length() > max) {	
					max = Math.max(max, substr.length());
					result = substr; 
					System.out.println(substr);
				}
				}
			 }
			 
		 }
		 		 
		 return result; 
	          }
	          
	 /*
	  * odd Palindrome 
	  * 
	  * */
	
	 public static String longestPalindromeTwoPointer(String s) {
		
		 int left = 0, right = 0, center = 0;
		 String subStr = "";
		 
		 while(center < s.length() ) {
			 
					 
			 if(left <= 0) {
				 center++;
				 right++;
				 }else {
					
					 while(left >= 0 && right <= s.length()) {
						 if(s.charAt(left) == s.charAt(right)) {
							 left--;
							 right++;
						 }
					 }
					
			 }
		 }
		 
		 return s;
		
	          }
	
	public static void main(String[] args) {
		
		longestPalindrome("");
	}

}
