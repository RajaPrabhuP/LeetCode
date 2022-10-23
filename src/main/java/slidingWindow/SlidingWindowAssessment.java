package slidingWindow;

import java.util.ArrayList;

public class SlidingWindowAssessment {

	/*Given a string s and a number k, find the maximum number of vowels in substring of size k.
	String: "workaattech"
	k: 3*/
	
	/*
	 * Test Data:
	 * 
	 * +ve ->  workaattech ->
	 * 
	 * Brute Force :
	 * 
	 * 1. Iterate throgh for loop and start less then k val
	 * 2. store it in substr and count the vowels for each word and update max value
	 * 3. retuen the max
	 * 
	 * 
	 * 
	 * */
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

public static boolean isVowel(char c) {
	
	return isVowelList().contains(c);
}
	public static int SlidingWindowAssessmentBruteForce(String s, int k) {
		int max = Integer.MIN_VALUE;
		String subStr;
		int cnt = 0;
		for(int i = 0; i <= s.length() - k; i++) {
			subStr = s.substring(i, i + k);
			System.out.println(subStr);
			for(int j = 0; j < subStr.length(); j++ ) {
				
				if(isVowel(subStr.charAt(j))) {
					cnt++;
				}
			}
			
			max = Math.max(max, cnt );
			cnt = 0;
			
		}
		
		return max;
	}
	
	
	public static void SlidingWindowAssessment(String s, int k) {
		int max = Integer.MIN_VALUE;
		String subStr;
		int cnt = 0;
		int start = 0, end = 0;
		
		while(start < k) {
			if(isVowel(s.charAt(start++))) {
				cnt++;
			}
		}
		
		max = Math.max(max, cnt);
		cnt = 0;
		
		while(k < s.length()) {
			String substring = s.substring(start, k);
			System.out.println(substring);
			if(isVowel(substring.charAt(start))) {
				cnt--;
			}
			if(isVowel(substring.charAt(k))) {
				cnt++;
			}
			
			start++;
			end++;
		}
		
		
		System.out.println(max);
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SlidingWindowAssessmentBruteForce("ABCDEFGHJIK", 3);
		SlidingWindowAssessment("ABCDEFGHJIK", 3);
	}

}
