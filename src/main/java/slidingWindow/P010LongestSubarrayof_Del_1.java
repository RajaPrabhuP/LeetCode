package slidingWindow;

public class P010LongestSubarrayof_Del_1 {
	
	//https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
	
	/*Given a binary array nums, you should delete one element from it.

Return the size of the longest non-empty subarray containing only 1's in the resulting array. Return 0 if there is no such subarray.

 */
	
	public static int longestSubarray(int[] nums) {
		int len = nums.length;
		if(len == 0 || len == 1)
			return 0;
		
		int left = 0, right = 0, max = Integer.MIN_VALUE, isDeleted = 1;
		
		while(right < len) {
			
			if(nums[right] == 0)
				isDeleted--;
			
			if(isDeleted < 0) {
				if(nums[left] == 0)
					isDeleted++;
				left++;
			}
			
			if(isDeleted  >= 0 && isDeleted  <= 1 )
				max = Math.max(max, right - left );
			
			right++;
			
		}
		
		return max ;
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestSubarray(new int[] {0,1,1,1,0,1,1,0,1}));
		System.out.println(longestSubarray(new int[] {1,1,0,1}));
		System.out.println(longestSubarray(new int[] {1,1,1}));
	}

}
