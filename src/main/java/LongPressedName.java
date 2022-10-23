
public class LongPressedName {
	
	
				/*
				 * Your friend is typing his name into a keyboard.
				 *  Sometimes, when typing a character c, the key might get long pressed, 
				 *  and the character will be typed 1 or more times.
			
			You examine the typed characters of the keyboard. 
			Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.
			
			Example 1:
			
			Input: name = "alex", typed = "aaleex"
			Output: true
			Explanation: 'a' and 'e' in 'alex' were long pressed.
			Example 2:
			
			Input: name = "saeed", typed = "ssaaedd"
			Output: false
			Explanation: 'e' must have been pressed twice, but it was not in the typed output.
			+ve -> "abcd" "aabbccdd" return true
			-edge -> "abcd" "a" false
			-ve   -> "aaavvv" "" return false
			Pseudo code for @ pointer
			
			Pseudo code:
			
			declare left and right initiate zero
			
			if typeOF is len less then actual string return false
			
			iterate through while loop break condition is start is less than name.length() and  Right index is less the typed
			
			 if name[start] CHAR equal to typeOf [right]
			 	right++;
			 	continue
			 if name[start] != str[end]
			 	start++;
			 if start == star1.length && end != typeof.length
			 	return false;
			 else 
			 	return trye;
			
				 * */
	
	/*https://leetcode.com/problems/long-pressed-name/
	 * PseudoCode:
	 * 1. Create 2 pointer p1 and p2 and temp
	 * 2. temp val can store previous p1 value
	 * 3. if p1 and p2 is not equal 
	 * 		then if temp value is equal to p2 increment p2
	 * 	  else return false
	 * 4. p1 and p2 is equal increment both p1 and p2
	 * 		and temp value previous
	 * 5. if p1 is equal to name.length
	 * 
	 * */
	
	public static boolean LongPressedNameTwo(String name, String typeOf) {
		
		if(typeOf.length() < name.length()) {
			return false;
		}
		
		int left = 0, right = 0;
		
		while(left < name.length() && right < typeOf.length()) {
			if(name.charAt(left) == typeOf.charAt(right) ) {
				right++;
				continue;
			}
			
			if(name.charAt(left) != typeOf.charAt(right) ) {
				left++;
				//continue;
			}
			if(left == name.length() - 1 && right == typeOf.length() - 1 ) {
				return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println(LongPressedNameTwo("a", "aaaa"));
		//System.out.println(LongPressedNameTwo("ab", "aabbc"));
		
		System.out.println(LongPressedNameTwo("abc", "abb"));
	}

}
