package Practice;

import java.util.HashMap;

public class P007_PermutationinString {

	public static boolean permuteString(String s, String t) {
		if(s.length() > t.length()) {
			return false;
		}
		HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
		HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();
		for (char ch : s.toCharArray()) {
			sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);
		}
		int left = 0, right = s.length();
		for(int i = 0; i < s.length(); i++) {
			tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
			
		}
		System.out.println(tMap);
		if(sMap.equals(tMap)) {
			return true;
		}
		
		while(right < t.length()) {
			
			tMap.put(t.charAt(right),  tMap.getOrDefault(t.charAt(right), 0) + 1);
			if(tMap.get(t.charAt(left)) == 1) {
				tMap.remove(t.charAt(left));
			}else {
				tMap.put(t.charAt(left),  tMap.getOrDefault(t.charAt(left), 0) - 1);
				}
			//System.out.println(sMap);
			System.out.println(tMap);
			if(sMap.equals(tMap)) {
				return true;
			}
			left++;
			right++;
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		//System.out.println( permuteString("ab", "eidbaooo"));
		System.out.println( permuteString("adc", "dcda"));		
	}

}

