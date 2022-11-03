package hashing;

import java.util.HashSet;

public class P012_ArithmeticTriplets {
	//https://leetcode.com/problems/number-of-arithmetic-triplets/
	
	public static int arithmeticTriplets(int[] nums, int diff) {
		
		int counter = 0;
		int tempDiff = 0;
		
		HashSet<Integer> hset = new HashSet<Integer>();
		for (int n : nums) {
			hset.add(n);
		}
		
		for(int i = 0; i < nums.length; i++) {
			tempDiff = nums[i] - diff;
			if(hset.contains(tempDiff) && hset.contains(tempDiff - diff)) {
				counter++;
			}
		}
		return counter;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[4,5,6,7,8,9], diff = 2
		//arithmeticTriplets(new int[] {4,5,6,7,8,9}, 2);
		arithmeticTriplets(new int[] {0,1,4,6,7,10}, 3);
	}

}
