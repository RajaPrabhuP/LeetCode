package Practice;

import java.util.HashSet;

public class P006_NumberofVowelsinaSubstringofGivenLength {

		
	public static int maxVowels(String s, int k) {
		
		HashSet<Character> vowelSet = new HashSet<Character>();
		vowelSet.add('a');
		vowelSet.add('e');
		vowelSet.add('i');
		vowelSet.add('o');
		vowelSet.add('u');
		
		if(s.length() < k) {
			return 0;
		}
		
		int left = 0, right = 0, max = Integer.MIN_VALUE, counter = 0;
		
		
		while(right < k) {
			if(vowelSet.contains(s.charAt(right))) {
				counter++;
			}
			right++;
		}
		max = Math.max(max, counter);
		
		while(right < s.length()) {
			
			if(vowelSet.contains(s.charAt(right))) {
				counter++;
			}
			if(vowelSet.contains(s.charAt(left))) {
				counter--;
			}
			max = Math.max(max, counter);
			left++;
			right++;
		}
		System.out.println(max);
		return max;
        
    }
	
	
	public static void main(String[] args) {
	
		maxVowels("aeiou", 2);
		maxVowels("leetcode", 3);	
		maxVowels("abciiidef", 3);
		
		
		
	}

}
