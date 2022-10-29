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
 	
 	/*
	 
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
	  * * initialize 2 pointers left and right
	 * iterate through each character in the string twice, this is to find both odd and even palindromic string
	 * for odd palindrome, both left and right starts from same index and expand from that index
	 * for even palindrome, left starts at that index and right starts at left+1 index and expand from there
	 * while expanding, if both left and right characters are not equal, break the loop and find the substring
	 * if the substring length is greater
	  * */
	
	 public static String longestPalindromeTwoPointer(String s) {
		
		 int left = 0, right = 0, center = 0, max = Integer.MIN_VALUE;
		 String subStr = "";
		 
		 for(int i = 0; i < s.length() * 2; i++) {
			 left = i / 2;
			 right = left + i % 2;
			 
			 while((left >= 0 && right < s.length()) && s.charAt(left) == s.charAt(right) ) {
				 left--;
				 right++;
			 }
			 left++;
			 if(max < right - (left + 1)) {
				 max = right - (left + 1);
				 subStr = s.substring(left, right+1);
			 }
		 }
		 return subStr;
		}
	
	public static void main(String[] args) {
		
		longestPalindrome("babad");
	}

}
