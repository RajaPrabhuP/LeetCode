package Practice;

import java.util.HashMap;
import java.util.HashSet;

public class P002_FirstUniqueCharacterinaString {
	
	//https://leetcode.com/problems/first-unique-character-in-a-string/description/
	//O[N]
	public static int firstUniqChar(String s) {
		
		for(int i = 0; i < s.length(); i++) { // O (N)
		
			if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) { //O(N) + O(1)
				return i;
			}
		}
		
		return -1;
        
    }
	
public static int firstUniqCharMap(String s) {
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		for(int i = 0; i < s.length(); i++) {
			hmap.put(s.charAt(i), hmap.getOrDefault(s.charAt(i), 0) + 1);
		}
		
		for(int i = 0; i < s.length(); i++) {
			if(hmap.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
        
    }
	
	public static void main(String[] args) {
		
		System.out.println(firstUniqChar("leetcode"));
		System.out.println(firstUniqChar("aabb"));
		System.out.println(firstUniqCharMap("leetcode"));
		System.out.println(firstUniqCharMap("aabb"));
		
	}

}
