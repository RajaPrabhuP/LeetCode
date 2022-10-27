package slidingWindow;

public class P_009_MaximumProductSubarray {

	/*https://leetcode.com/problems/maximum-product-subarray/*/
	
	/*Given an integer array nums, find a contiguous non-empty subarray within the 
	 * array that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

A subarray is a contiguous subsequence of the array.
+ve - [1,2,3,4] 24
-ve []


 */
	 public static int maxProduct(int[] nums) {
	        
	        int left = 0, right = 0, prod = 1, max = Integer.MIN_VALUE;
	        
	        for(right = 0; right < nums.length; right++){
	            
	            prod = prod * nums[right];
	            
	            if(max > prod){
	                prod = prod / nums[left];
	                left++;
	            }
	            
	            max = Math.max(max, prod);
	        }
	        return max;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxProduct(new int[] {-2,0,-1}));
	}

}
