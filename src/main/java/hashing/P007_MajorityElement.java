package hashing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class P007_MajorityElement {
	
	//https://leetcode.com/problems/majority-element/description/
	
	public static int majorityElement(int[] nums ) {
		
		if(nums.length == 0)
			return 0;
		
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		int max = 0;
		for(int i = 0; i < nums.length; i++) {
			hmap.put(nums[i], hmap.getOrDefault(nums[i], 0) + 1);
		}
		Integer maxVal = Collections.max(hmap.values());
		
		for (Entry<Integer, Integer> each : hmap.entrySet()) {
			if(each.getValue() == maxVal) {
				return each.getKey();
			}
		}
		
		return 0;
	        
	    }
	
public static int majorityElementTwo(int[] nums ) {
		
		if(nums.length == 0)
			return 0;
		
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		int max = 0;
		for(int i = 0; i < nums.length; i++) {
			hmap.put(nums[i], hmap.getOrDefault(nums[i], 0) + 1);
		}
		//Integer maxVal = Collections.max(hmap.values());
		int output = 0;
		for (Entry<Integer, Integer> each : hmap.entrySet()) {
			if(each.getValue() > max) {
				max = each.getValue();
				output = each.getKey();
			}
		}
		
		return output;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(majorityElement(new int[] {1,1,1,2,2,1}));
		System.out.println(majorityElementTwo(new int[] {1,1,1,2,2,1}));
	}

}
