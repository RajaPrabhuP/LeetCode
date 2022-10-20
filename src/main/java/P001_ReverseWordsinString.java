
public class P001_ReverseWordsinString {

	/*
	Given a string s, reverse the order of characters in each word within a 
	sentence while still preserving whitespace and initial word order.
	Example 1:

		Input: s = "Let's take LeetCode contest"
		Output: "s'teL ekat edoCteeL tsetnoc"
		Example 2:

	Input: s = "God Ding"
	Output: "doG gniD"
	 * /*
	 * PROBLEM STATEMENT https://leetcode.com/problems/reverse-words-in-a-string-iii/
		 * 1. Did I understand the problem? 
	 * 	yes 
	 * 	If no ask the person to provide
	 * 	with more details with examples 
	 * 	If yes go to the next step What is the
	 * 	input(s)? What is the expected output? 
	 * 
	 * 	Do I have any constraints to solve the
	 * 	problem?  - 
	 * 		1 <= s.length <= 5 * 104
			s contains printable ASCII characters.
			s does not contain any leading or trailing spaces.
			There is at least one word in s.
			All the words in s are separated by a single space.
	 * Do I have all the information to go to the next steps 
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
	/*
	 * +VE -> Str = "I Love Programmeing"
	 * -ve -> " " = " ", 
	 * edge -> "e"= "e"
	 * 
	 * 
	 * BRUTEFORCE:
	 * if str length 0 or 1 means return same string
	 * create result string with empy
	 * split the string using delimiter space and store string arr
	 * Iterate throgh for loop
	 * create new string buffer and reverse the word and append with with whitespace
	 * trim the result string 
	 * */
	//Passed Leetcode
	//Time: n log N
	//space 0[1]
	public static String reverseWordsBruteForce(String s) {
		
		 if(s.length() <=1)
				return s;
			String res = "";
			String[] split = s.split(" ");
			
			for(int i = 0; i < split.length; i++) {
				res = res + new StringBuffer(split[i]).reverse().toString() + " ";
			}
			
			
			return res.trim();   
        
    }
	/*
	 * Pseudo Code
	 * if str length 0 or 1 means return same string
	 * create result string with empy, int start , int end, reversestring
	 * split the string using delimiter space and store string arr
	 * Iterate throgh for loop
	 * 
	 * intialise start = 0, and end = splitword.length;
	 * 
	 * using while loop break condition is start less then end
	 * swap the first and last char in str using temp var
	 * decrement end and increment start 
	 * 
	 * after while result equal to result concat revese string and whitespace
	 * 
	 * return trim whitespace
	 * 
	 * 
	 * */
	public static String reverseWordsTwoPinter(String s) {
		
		 if(s.length() <=1)
				return s;
			String res = "";
			int start, end; char temp; String rev = "";
			String revWord = "";
			String[] split = s.split(" ");
			
			for(int i = 0; i < split.length; i++) {
				
				start = 0;
				end = split[i].length() - 1;
				char[] charArray = split[i].toCharArray();
				
				while(start < end) {
					temp = charArray[start];
					charArray[start] = charArray[end];
					charArray[end] = temp;
					start++;
					end--;
				}
				
				for(int j = 0; j < charArray.length; j++ ) {
					revWord = revWord + String.valueOf(charArray[j]);
					
				}
				
				res = res + revWord + " ";
				revWord = "";
				
				
			}
						
			return res.trim();   
       
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseWordsTwoPinter("I LOVE YOU");
	}

}
