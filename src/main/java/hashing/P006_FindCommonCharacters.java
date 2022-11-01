package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P006_FindCommonCharacters {

	/*https://leetcode.com/problems/find-common-characters/*/
	
		public static List<String> commonChars(String[] words) {
			
			List<Character> list1 = new ArrayList<Character>();
			List<Character> list2 = new ArrayList<Character>();
			for(int i = 0; i <words[0].length(); i++ ) {
				list1.add(words[0].charAt(i));
			}
			for(int i = 1; i < words.length; i++) {
				
				for(int j  = 0; j < words[i].length(); j++ ) {
					list2.add(words[i].charAt(j));
				}
				list1.retainAll(list2);
				list2.clear();
			}
			System.out.println(list1);
			return null;
		}
		
		public static List<String> commonCharsUsingMap(String[] words) {
			
			HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
			
			for(int i = 0; i < words[0].length(); i++)
				hmap.put(words[0].charAt(i), hmap.getOrDefault(words[0].charAt(i), 0) + 1);
			
			for(int j = 1; j < words.length; j++) {
				HashMap<Character, Integer> tempMap = new HashMap<Character, Integer>();
				for(int k = 0; k < words[j].length(); k++) {
					
					if(hmap.containsKey(words[j].charAt(k))) {
						tempMap.put(words[j].charAt(k), Math.min(tempMap.getOrDefault(words[j].charAt(k), 0) + 1, hmap.get(words[j].charAt(k))));
					}
				}
				
				hmap = tempMap;	
			}
			//System.out.println(hmap);
			List<String> result = new ArrayList<String>();
			for(Map.Entry<Character, Integer> eachEntry : hmap.entrySet()) {
				for(int i = 0; i < eachEntry.getValue(); i++) {
					result.add(String.valueOf(eachEntry.getKey()));
				}
			}
			//System.out.println(result);
			return result;
			
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//commonChars(new String[] {"bella","label","roller"});
		//commonChars(new String[] {"cool","lock","cook"});
		
		commonCharsUsingMap(new String[] {"cool","lock","cook"});
		commonCharsUsingMap(new String[] {"bella","label","roller"});
	}

}
