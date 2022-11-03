package hashing;

import java.util.HashMap;

public class P011_JewelsandStones {

	//https://leetcode.com/problems/jewels-and-stones/description/
	
	public static int numJewelsInStones(String jewels, String stones) {
	
		HashMap<Character, Integer> stonesMap = new HashMap<Character, Integer>();
		int sum = 0;
		for(int i = 0; i < stones.length(); i++) {
			stonesMap.put(stones.charAt(i), stonesMap.getOrDefault(stones.charAt(i), 0) + 1);
			}
		for(int j = 0; j < jewels.length(); j++) {
			if(stonesMap.containsKey(jewels.charAt(j))) {
				sum += stonesMap.get(jewels.charAt(j));
			}
		}
		
		System.out.println(sum);
		return sum;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numJewelsInStones("aA", "aAAbbbb");
		numJewelsInStones("z", "ZZ");
	}

}
