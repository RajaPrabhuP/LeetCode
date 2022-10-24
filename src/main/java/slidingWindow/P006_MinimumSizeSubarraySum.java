package slidingWindow;

public class P006_MinimumSizeSubarraySum {

	/*Given an array of positive integers nums and a positive integer target, return the minimal length of a 
	 * contiguous subarray [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or equal to target.
	 *  If there is no such subarray, return 0 instead.*/
	//  https://leetcode.com/problems/minimum-size-subarray-sum/
	
	public static int MinimumSizeSubarraySum( int[] nums, int target) {
		
		int start = 0, end = 0, sum = 0, min = Integer.MAX_VALUE;
		
		for(int i = 0; i < nums.length; i++) {
			
			sum = sum + nums[i];
			
			while(sum >= target) {
				min = Math.min(min, i - start + 1);
				sum = sum - nums[start];
				start++;	
			}
		}
		System.out.println(min);
		return min;
		
	}
	
	
	
	public static void main(String[] args) {
	
		//MinimumSizeSubarraySum(new int[] {1,2,3,4,5} , 9 );
		MinimumSizeSubarraySum(new int[] {2, 3, 1, 2, 4, 3} , 7 );
	}

}
