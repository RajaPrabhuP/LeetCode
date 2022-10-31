package hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSumUsingMap {
		
	//https://leetcode.com/problems/two-sum/
	public static int[] TwoSumUsingMapmethod(int[] nums, int target) {
		
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		for(int i = 0; i < nums.length; i++)
			hmap.put(i, nums[i]);
		
		int left = 0, right = nums.length - 1;
		while(left < right) {
			if(hmap.get(left) + hmap.get(right) == target)
				return new int[] {left, right};
			else if(hmap.get(left) + hmap.get(right) > target)
				right--;
			else if(hmap.get(left) + hmap.get(right) < target)
				left++;
		}
		
		return result;
		
	}
	
	public static int[] TwoSumUsingMapmethod2(int[] nums, int target) {
		
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		int[] result = new int[2];
		
		//2,7,11,15 
		
		for(int i = 0; i < nums.length; i++) {
			
			if(hmap.containsKey(target - nums[i])) {
				result[0] = hmap.get(target - nums[i]);
				result[1] = i;
			}else {
				hmap.put(nums[i], i);
			}
			
		}
		System.out.println(Arrays.toString(result));
		return result;
	}
	
public static int[] TwoSumReturnValue(int[] nums, int target) {
		
		
		int[] result = new int[2];
		
		HashSet<Integer> hset = new HashSet<Integer>();
		
		for(int i = 0; i < nums.length; i++) {
		
		if(hset.contains(target - nums[i])) {
			result[0] = nums[i];
			result[1] = target - nums[i];
		}else {
			hset.add(nums[i]);
		}
		}
		
		System.out.println(Arrays.toString(result));
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSumUsingMapmethod2(new int[] {9,9,9,9}, 9);
		TwoSumReturnValue(new int[] {2,7,11,15}, 9);
	}

}
