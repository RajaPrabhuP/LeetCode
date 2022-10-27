package slidingWindow;

public class P009_MaximumProductSubarray {

	/*https://leetcode.com/problems/maximum-product-subarray/*/
	
	/*Given an integer array nums, find a contiguous non-empty subarray within the 
	 * array that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

A subarray is a contiguous subsequence of the array.
+ve - [1,2,3,4] 24
-ve []

/*Brute Force
 * 
 * 1. Iterate through for loop
 * * 
 * */
	
	public static int BruteForce(int[] nums) {		 
		  int  max = Integer.MIN_VALUE, prod = 1;
		
		for(int i = 0; i < nums.length; i++) {
			
			for(int j = i; j < nums.length; j++) {
				
				prod = prod * nums[j];
				
				max = Math.max(max, prod);
			}
		}
					 
		 
	       
	        return max;
	    }
	 
	

	/*Two Pointer
	 * 
	 * 1. Set two Pointer from start and end
	 * 2. And cretae two ProdL and ProdR value and max Integer Min
	 * 3. Iterate through while loop breaking condition is left and right is less then length
	 * 4. prodL = prodL * nums[left]
	 * 5. prodR = prodR * nums[right]
	 * 6. using the Math max value to identify the 
	 * 7. left value and right value is zero 
	 * 		prod = 1
	 * 8. left++, right++; 
	 * 
	 * */
 
public static int TwoPointer(int[] nums) {		 
	 
	 if(nums.length == 0)
		 return 0;
	 if(nums.length == 1)
		 return nums[0];
				 
	 
        int left = 0, right = nums.length - 1, prodL = 1, prodR = 1, max = Integer.MIN_VALUE;
		
        while(left < nums.length && right >= 0 ) {
        	
        	prodL = prodL * nums[left];
        	prodR = prodR * nums[right];
        	
        	max = Math.max(max, Math.max(prodL, prodR));
        	
        	if(nums[left] == 0)
        		prodL = 1;
        	
        	if(nums[right] == 0)
        		prodR = 1;
        	
        	left++;
        	right++;
        	
        	
        }
        
        return max;
     }



public static int maxProduct(int[] nums) {		 
	 
	 if(nums.length == 0)
		 return 0;
	 if(nums.length == 1)
		 return nums[1];
				 
	 
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


public static int maxProduct1(int[] nums) {		 
	 
	 if(nums.length == 0)
		 return 0;
	 if(nums.length == 1)
		 return nums[1];
				 
	 
       int left = 0, right = 0, prod = 1, max = Integer.MIN_VALUE;
       
       for(right = 0; right < nums.length; right++){
           
           prod = prod * nums[right];
           max = Math.max(max, prod);
          if(max > prod){
               prod = 1;
              }
           
         
       }
       return max;
   }

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxProduct(new int[] {-2,0,-1}));
	}

}
