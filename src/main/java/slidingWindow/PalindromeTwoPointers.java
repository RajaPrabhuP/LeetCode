package slidingWindow;

public class PalindromeTwoPointers {

	/*https://leetcode.com/problems/valid-palindrome-ii/*/
	public static boolean PalindromeTwoPointers(String s){
		
		int start = 0, end = s.length() - 1;
		
		while(start < end) {
			
			if(s.charAt(start++) != s.charAt(end--)) {
				return false;
			}
			
		}
		return true;
		
	}
	
public static boolean isPalindromeAfterRemoval(String s, int start, int end){
		
		System.out.println(start);
		System.out.println(end);
		while(start < end) {
			
			if(s.charAt(start++) != s.charAt(end--)) {
				return false;
			}
			
		}
		return true;
		
	}
	
public static boolean PalindromeTwoPointerII(String s){
		
		int start = 0, end = s.length() - 1;
		
		while(start < end) {
			
			if(s.charAt(start) != s.charAt(end)) {
				return isPalindromeAfterRemoval(s, start + 1, end );
			}
			start++;
			end--;
		}
		return true;
		
	}
	
public static boolean PalindromeTwoPointersCenterWithExpansion(String s){
		
		int left  = (s.length() / 2) - (s.length() % 2);
		int right = (s.length() / 2) + (s.length() % 2);
		
		if(left == right)
			left--;
		
		while(left >= 0) {
			
			if(s.charAt(left--) != s.charAt(right++)) {
				return false;
			}
			
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		
		//System.out.println(PalindromeTwoPointers("RADAR"));
		//System.out.println(PalindromeTwoPointers("madam"));
		System.out.println(PalindromeTwoPointerII("abca"));
	}

}
