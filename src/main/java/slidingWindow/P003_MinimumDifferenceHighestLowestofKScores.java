package slidingWindow;

import java.util.Arrays;

public class P003_MinimumDifferenceHighestLowestofKScores {

	/*You are given a 0-indexed integer array nums, where nums[i] represents the score of the
	 *ith student. You are also given an integer k.
	Pick the scores of any k students from the array so
 	that the difference between the highest and the lowest of the k scores is minimized.
	Return the minimum possible difference.*/
	//https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
	/*
	 * Test Data:
	 * 
	 * 
	 * */
	/*Sliding window:
	 * 1. Declare min value is Integer.MaxVal
	 * 2. Sort the Array because any k value of (lower and Higher value) we need to identify.
	 * 3. first k value of min value should identify and store it in min value
	 * 4. Iterate through while breaki is k less the arr.length
	 * 5. diff is equal to arr[k] - arr[start++]
	 * 6. Min value need to update 
	 * 7 k also increment 
	 * */
	
	
	
	public static int minimumDifference(int[] nums, int k) {
		
		int start = 0, min = Integer.MAX_VALUE, diff = 0;
		Arrays.sort(nums);
		
		
		min = Math.min(min, nums[k - 1] - nums[start]);
		
		start++;
		while(k < nums.length) {
			diff = nums[k++] - nums[start++];
			min = Math.min(min, diff);
		}
		
		return min;
        
    }
	
	/*Brute Force:
	 * Sortvthe array
	 * Iterate throght for 
	 * intialize 0 and condition is i less then arr.length - end and increment i
	 * diff equal to arr[i + (k - 1)] - arr[i]
	 * min = Math.min
	 *  */
	
public static int minimumDifferenceButeForcr(int[] nums, int k) {
	
	int diff = 0, min = Integer.MAX_VALUE;
	Arrays.sort(nums);
	for(int i = 0; i <= nums.length - k; i++) {
		
		diff = nums[i + (k - 1)] - nums[i];
		min = Math.min(min, diff);
	}
	
	return min;
		
    }
	
	public static void main(String[] args) {
	
		System.out.println(minimumDifference(new int[] {9,4,1,7}, 2));
		System.out.println(minimumDifferenceButeForcr(new int[] {9,4,1,7}, 2));
	}

}
