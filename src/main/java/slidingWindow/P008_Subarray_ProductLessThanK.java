package slidingWindow;

public class P008_Subarray_ProductLessThanK {

	
	
	/*
	 * https://leetcode.com/problems/subarray-product-less-than-k/
	 * Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product
	 *  of all the elements in the subarray is strictly less than k.
	 * */
	
	/*BruteForce
	 * 
	 * 1. Outer loop iterate start from zero
	 * 2. Inner loop iterate start from zero
	 * 3. declare mul = 1, counter = 1,
	 * 4. multiply mul * arr[j],
	 * 5. If mul < k increment counter and increment right
	 * 6. else mul = 1 and break
	 * 7. after complting inner loop mul needs to update to 1
	 * 8. again do all above steps
	 * 
	 * 
	 * */
	
	public static void Subarray_ProductLessThanK(int[] nums, int k) {
		int mul = 1, counter = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                
                mul = mul * nums[j];
               System.out.println(nums[i] +" "+nums[j]);
                if(mul < k){
                   counter++; 
                }else{
                    mul = 1;
                    break;
                }
               
            }
            mul = 1;
        }
        
        System.out.println(counter);
	}
	
	/*Two Pointer
	 * Declare left and right at zero 
	 * 1.mul = mul * nums[right];
	 * if mul 
	 * 
	 * */
	
	public static void Subarray_ProductLessThanKSliding(int[] nums, int k) {
		int mul = 1, counter = 0, left = 0, right = 0;
        //10,5,2,6
		while(left < nums.length && right < nums.length) {
			
		
			if(mul < k) {
				mul = mul * nums[right];
				counter++;
				right++;
			}else if(mul >= k) {
				mul = mul / nums[left];
				left++;			
			}
			
			if(right >= nums.length) {
				left++;
				right = left;
				mul = 1;
			}
		}
       
        
        System.out.println(counter);
	}
	
	
	public static int Subarray_ProductLessThanKSlidingSol(int[] nums, int k) {
		
		int len = nums.length;
		int mul = 1, counter = 0, left = 0, right = 0;
		if(len == 1 && nums[0] < k)
			return counter;
		
        //10,5,2,6
		while(left < len || right < len) {
			
                                                                                                                                                                                                                                			mul = mul * nums[right];
			if(mul >= k || right >= len) {
				mul = mul / nums[left];
				if(nums[left] < k)
					counter++;
				left++;
				right++;
			}else if(mul < k) {
				counter++;
				right++;
				
			}
			System.out.println(counter);
		}
       
        
        System.out.println(counter);
        return counter;
	}
	
	
	public static void main(String[] args) {
		
		Subarray_ProductLessThanKSlidingSol(new int[] {10,5,2,6}, 100);
		//Subarray_ProductLessThanKSliding(new int[] {10,5,2,6}, 100);

	}

}
