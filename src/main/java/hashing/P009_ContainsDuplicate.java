package hashing;

import java.util.HashMap;
import java.util.HashSet;

public class P009_ContainsDuplicate {

	//https://leetcode.com/problems/contains-duplicate-ii/
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		boolean output = false;
		for(int i = 0; i < nums.length; i++) {
			
			if(hmap.containsKey(nums[i]) && Math.abs(i - hmap.get(nums[i])) <= k)
				return true;	
			
			hmap.put(nums[i], i);
				
		}
		
		return output;
        
    }
	
public static boolean containsNearbyDuplicateBrute(int[] nums, int k) {
	
	HashSet<Integer> hset = new HashSet<Integer>();
	
		for(int i = 0; i < nums.length; i++) {
			
			for(int j = i + 1; j < nums.length; j++) {
				
				if(nums[i] ==  nums[j] && Math.abs(i - j) <= k) {
					hset.add(nums[i]);
				}
				
			}
			
		}
		
		if(hset.isEmpty())
			return false;
		else 
			return true;
    }
	
	public static void main(String[] args) {
		System.out.println(containsNearbyDuplicateBrute(new int[] {1,2,3,4,5}, 1));
		System.out.println(containsNearbyDuplicateBrute(new int[] {1,2,3,1,2,3}, 1));
	}

}
