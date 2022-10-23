import org.junit.Test;

import junit.framework.Assert;

public class P008_ReversePrefixofWord {
	
	/*
	 * https://leetcode.com/problems/reverse-prefix-of-word/
	 * 
	 * Given a 0-indexed string word and a character ch, reverse the segment of word that starts at 
	 * index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch 
	 * does not exist in word, do nothing.

	For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 
	and ends at 3 (inclusive). The resulting string will be "dcbaefd".
	Return the resulting string.
	 * 
	 * 
	 * Test Data
	 * +ve hello -> l -< lehlo
	 * -ve abcde - Z -> abcde
	 * Edge - abcd - d -> dcba
	 * 
	 * BruteForce Pseudo code:
	 * 1. if s length equal to 1 and idx of search char is -1(not availabe) means return the string
	 * 2. if s.length  - 1 and idx of search char also -1 return s
	 * 3.	else condition is 
	 * 			split the string into two substring 
	 * 			first one is 0 to idx + 1
	 * 			second string is start from idx +1
	 * 	return reverse of first one concat second substr
	 * */
	
	public static String ReversePrefixofWord(String word, char ch) {
		
		int idx = word.indexOf(ch);
		
		if(word.length() == 1 || idx == -1  )
			return word;
		if(word.length() - 1 == idx)
            return new StringBuffer(word).reverse().toString();
		
            String Firstsubstring = word.substring(0, idx + 1);
		    String Secondsubstring = word.substring(idx + 1, word.length());
		
		return new StringBuffer(Firstsubstring).reverse().toString() + Secondsubstring ;
	}
	
	/*Two Pointer
	 *  1. if s length equal to 1 and idx of search char is -1(not availabe) means return the string
	 *  2. if s.length - 1 equal to  idx return call revese method
	 *  3.	else condition is 
	 * 			split the string into two substring 
	 * 			first one is 0 to idx + 1
	 * 			second string is start from idx +1
	 * 	return reverse of first one concat second substr
	 *  
	 * 
	 * */
	public static String reverseWord(String word) {
		
		int start = 0, end = word.length() - 1;
		char ch;
		char[] charArray = word.toCharArray();
		while(start < end) {
			ch = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = ch;
			start++;
			end--;
		}
		
		return String.copyValueOf(charArray);
		
	}
public static String ReversePrefixofWordTwo(String word, char ch) {
		
		int idx = word.indexOf(ch);
		
		if(word.length() == 1 || idx == -1  )
			return word;
		if(word.length() - 1 == idx)
            return new StringBuffer(word).reverse().toString();
		
            String Firstsubstring = word.substring(0, idx + 1);
		    String Secondsubstring = word.substring(idx + 1, word.length());
		
		return new StringBuffer(Firstsubstring).reverse().toString() + Secondsubstring ;
	}
	

public static String ReversePrefixofWordTwoPointer(String word, char ch) {
		
		int idx = word.indexOf(ch);
		
		if(word.length() == 1 || idx == -1  )
			return word;
		if(word.length() - 1 == idx)
            return reverseWord(word);
		
            String Firstsubstring = word.substring(0, idx + 1);
		    String Secondsubstring = word.substring(idx + 1, word.length());
		
		return reverseWord(Firstsubstring) + Secondsubstring ;
	}
	
	@Test
	public void positive2() {
		
		String s = "hello";
		char ch = 'l';
		String output = "lehlo";
		Assert.assertEquals(ReversePrefixofWord(s, ch), output);
		Assert.assertEquals(ReversePrefixofWordTwoPointer(s, ch), output);
	}
	
	@Test
	public void negativ() {
		
		String s = "abcdef";
		char ch = 'z';
		String output = "abcdef";
		Assert.assertEquals(ReversePrefixofWord(s, ch), output);
		Assert.assertEquals(ReversePrefixofWordTwoPointer(s, ch), output);
	}
	
	@Test
	public void edge() {
		
		String s = "abcdef";
		char ch = 'f';
		String output = "fedcba";
		Assert.assertEquals(ReversePrefixofWord(s, ch), output);
		Assert.assertEquals(ReversePrefixofWordTwoPointer(s, ch), output);
	}
	public void edge1() {
		//Edge Case Test Data
		String s = "dabcefgd";
		char ch = 'd';
		String output = "dabcefgd";
		Assert.assertEquals(ReversePrefixofWord(s, ch), output);
		Assert.assertEquals(ReversePrefixofWordTwoPointer(s, ch), output);
	}
	@Test
	public void edge2() {
		//Positive Test Data
		String word = "a";
		char ch = 'd';
		String output = "a";
		Assert.assertEquals(ReversePrefixofWord(word, ch), output);
		Assert.assertEquals(ReversePrefixofWordTwoPointer(word, ch), output);
	}
}
