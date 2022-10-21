import org.junit.Test;

import junit.framework.Assert;

public class P007_ReverseOnlyLetters {

	/*
	 * https://leetcode.com/problems/reverse-only-letters/
	 * 
	 * Given a string s, reverse the string according to the following rules:

All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.

/*
	 * 1. Did I understand the problem? 
	 * 	yes or no 
	 * 	If no ask the person to provide
	 * 	with more details with examples 
	 * 	If yes go to the next step What is the
	 * 	input(s)? What is the expected output? 
	 * 
	 * 	Do I have any constraints to solve the
	 * 	problem? Do I have all the information to go to the next steps 
	 * 	How big is your test data set will be? 
	 * 
	 * 2. Test data set Minimum 3 data set including positive, negative and edge
	 * Validate with the interviewer if the data set is fine by his/ her assumptions
	 * 
	 * 
	 * 3. Do I know to solve it? 
	 * 	Yes- great is there an alternate ? 
	 * 	No - can I break the problem into sub problems?
	 * 
	 * 
	 * 4. Ask for hint (if you dont know how to solve
	 * this) 
	 * 
	 * 5. Do I know alternate solutions as well Yes- what are those? No- that
	 * is still fine, proceed to solve by what you know 
	 * 
	 * 6. If you know the alternate
	 * solution find out the O-notations (performance) 
	 * 
	 * 
	 * 7. Then, explain either both are the best (depends on
	 * the time) 
	 * 	Approach 1:- start with the worst-> improve (optimize) -> End up
	 * with the best 
	 * 	Approach 2: Write down the options and benefits and code the
	 * best 
	 * 
	 * 8. Start always with the Pseudo code 
	 * 
	 * 9. Test against different test data
	 * 
	 * 10. If it fails then debug to solve it
	 */
     /*Test Data
      * 
      * +ve - abcdefgh - hgfedcba
      * edge - -a = -a
      * negativ - 12345656a - 12345656a
      * 			,.;AV' - ,.;VA'
      * 
      * 
      * */
	
	/*Pseudo code:
	 * if length of the string less then or equal to one
	 * 		return string
	 * 
	 * initialize start and end value and temp also
	 * string convert into charArray
	 * 
	 * using while and breaking condition is start less the end
	 * 
	 * if arr start is not alphabetic increment start
	 * if arr end is not alphabetic decrement end
	 * if arr start and arr end is alhabetic swap two character
	 * 
	 * return the string using method String.valueof
	 *  * 
	 * 
	 * 
	 * */
	
	public static String ReverseOnlyLetters(String s) {
		
				
		if(s.length() <= 1)
			return s;
		
		int start = 0, end = s.length() - 1;
		char temp;
		char[] charArray = s.toCharArray();
		
		while(start < end ) {
			
			if(!Character.isAlphabetic(charArray[start])) {
				start++;
			}
			if(!Character.isAlphabetic(charArray[end])) {
				end--;
			}
			if(Character.isAlphabetic(charArray[end]) && Character.isAlphabetic(charArray[start])) {
				temp = charArray[start];
				charArray[start] = charArray[end];
				charArray[end] = temp;
				start++;
				end--;
			}
			}
			return String.copyValueOf(charArray);
		}
		
			
	
	@Test
	public void edge2() {
		//Negative Test Data
		String s = "-12343421348";
		String output = "-12343421348";
		Assert.assertEquals(ReverseOnlyLetters(s), output);
	}
	@Test
	public void example1() {
		//Positive Test Data
		String s = "ab-cd";
		String output = "dc-ba";
		Assert.assertEquals(ReverseOnlyLetters(s), output);
	}
	
	@Test
	public void edge() {
		//Edge Case Test Data
		String s = "-a";
		String output = "-a";
		Assert.assertEquals(ReverseOnlyLetters(s), output);
	}
	
	@Test
	public void negative() {
		//Negative Test Data
		String s = "-a@b$cABC";
		String output = "-C@B$Acba";
		Assert.assertEquals(ReverseOnlyLetters(s), output);
	}
	
	@Test
	public void positive2() {
		//Negative Test Data
		String s = "abc1234e";
		String output = "ecb1234a";
		Assert.assertEquals(ReverseOnlyLetters(s), output);
	}
	

}
