import java.util.ArrayList;

public class P006_ReverseVowelsofaString {
	/*https://leetcode.com/problems/reverse-vowels-of-a-string/
	 * Given a string s, reverse only all the vowels in the string and return it.
	The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower 
	and upper cases, more than once.
	
	*
	*+ve - "hello"   "holle"
	*-ve - "sdfgh"   sdfgh,   "" - "" and "i" - "i"
	*edge  "aeiouAEIOU" "UOIEAuoiea"
	*
	* Pseudo code for Two Pointer
	* 
	* 1. if string length is less then or equal to 1 means return the string
	* 
	* 2. create start and end variable, start equal to zero and end is equal to string lenth
	* using while loop breaking condition is start is less then end
	* 	if str start is not equal to vowel character means increment start
	* 	if str end is not equal to viwel character means decrement end
	* 	if both start and end or vowel character means swap both the character and increment start
	* and decrement end
	*	*
	**/
	/*a - 97, e - 101, i - 105, 0 -111, u - 117
	  A - 65, E - 69,  I - 73 , 0 -79 , U - 85*/
	
	public static String ReverseVowelsofaString(String s) {
		if(s.length() <= 1)
			return s;
		int start = 0, end = s.length() - 1;
		char temp;
		
		Character.isAlphabetic('c');
		
		char[] charArray = s.toCharArray();
		
		while(start < end) {
			
			int startChInt = charArray[start];
			int endChInt   = charArray[end];
			
			if(startChInt != 65 && startChInt != 69 && startChInt != 73 && startChInt != 79 && startChInt != 85 && 
			   startChInt != 97 && startChInt != 101 && startChInt != 105 && startChInt != 111 && startChInt != 117 ) {
					start++;
			}
			if(endChInt != 65 && endChInt != 69 && endChInt != 73 && endChInt != 79 && endChInt != 85 && 
					endChInt != 97 && endChInt != 101 && endChInt != 105 && endChInt != 111 && endChInt != 117 ) {
							end--;
			}
			if((startChInt == 65 || startChInt == 69 || startChInt == 73 || startChInt == 79 || startChInt == 85 || 
					   startChInt == 97 || startChInt == 101 || startChInt == 105 ||startChInt == 111 || startChInt == 117) &&
					(endChInt == 65 || endChInt == 69 || endChInt == 73 || endChInt == 79 || endChInt == 85 || 
					endChInt == 97 || endChInt == 101 || endChInt == 105 || endChInt == 111 || endChInt == 117)
					) {
							temp      = charArray[start];
							charArray[start] = charArray[end];
							charArray[end] =  temp;
							start++;
							end--;
					}
						
		}
	
		return String.copyValueOf(charArray);
	}
	
	public static String ReverseVowelsofaStringUsingArrayList(String s) {
		if(s.length() <= 1)
			return s;
		int start = 0, end = s.length() - 1;
		char temp;
		
		char[] charArray = s.toCharArray();
		
		while(start < end) {
			
			int startChInt = charArray[start];
			int endChInt   = charArray[end];
			
			if(!isVowel(charArray[start]) ) {
					start++;
			}
			if(!isVowel(charArray[end])) {
							end--;
			}
			if( isVowel(charArray[start]) && isVowel(charArray[end])) {
							temp      = charArray[start];
							charArray[start] = charArray[end];
							charArray[end] =  temp;
							start++;
							end--;
					}
						
		}
	
		return String.copyValueOf(charArray);
	}
	public static ArrayList<Character> isVowelList() {
		
		ArrayList<Character> aList = new ArrayList<Character>();
		aList.add('a');
		aList.add('e');
		aList.add('i');
		aList.add('o');
		aList.add('u');
		aList.add('A');
		aList.add('E');
		aList.add('I');
		aList.add('O');
		aList.add('U');
		
		return aList;
		
		
	}
	
	public static String reverseVowelnew() {
		
		int left = 
		
		return null;
		
	}
	
	public static boolean isVowel(char c) {
		
		return isVowelList().contains(c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
