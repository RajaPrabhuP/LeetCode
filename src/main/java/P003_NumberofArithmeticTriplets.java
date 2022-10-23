
public class P003_NumberofArithmeticTriplets {
	
	/*
	 * 
	 * You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. 
	 * A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:

	i < j < k,
	nums[j] - nums[i] == diff, and
	nums[k] - nums[j] == diff.
	Return the number of unique arithmetic triplets.

	 */
	
	 /*
	 * PROBLEM STATEMENT https:https://leetcode.com/problems/number-of-arithmetic-triplets/
		 * 1. Did I understand the problem? 
	 * 	yes
	 * 	If no ask the person to provide
	 * 	with more details with examples 
	 * 	If yes go to the next step What is the
	 * 	input(s)? What is the expected output? 
	 * 
	 * 	Do I have any constraints to solve the
	 * 	problem?  - 
	 * 		-- Non-Decreasing order
	 * 		-- Should be added into nums1 in non-decreasing order
	 * 		-- 
	 * Do I have all the information to go to the next steps 
	 * 	How big is your test data set will be? 
	 * 
	 * 2. Test data set Minimum 3 data set including positive, negative and edge
	 * Validate with the interviewer if the data set is fine by his/ her assumptions
	 * 
	 * 
	 * 3. Do I know to solve it? 
	 * 	Yes- great is there an alternate ? 
	 * 	No - can I break the problem into sub problems?
	 * 
	 * 
	 * 4. Ask for hint (if you dont know how to solve
	 * this) 
	 * 
	 * 5. Do I know alternate solutions as well Yes- what are those? No- that
	 * is still fine, proceed to solve by what you know 
	 * 
	 * 6. If you know the alternate
	 * solution find out the O-notations (performance) 
	 * 
	 * 
	 * 7. Then, explain either both are the best (depends on
	 * the time) 
	 * 	Approach 1:- start with the worst-> improve (optimize) -> End up
	 * with the best 
	 * 	Approach 2: Write down the options and benefits and code the
	 * best 
	 * 
	 * 8. Start always with the Pseudo code 
	 * 
	 * 9. Test against different test data
	 * 
	 * 10. If it fails then debug to solve it
	 */
	/*
	 * 
	*/
	
	/*
	 * Brute Force:
	 * if array length less then three means throw an error
	 * initialize counter value is zero
	 * 1. Usingg 3 for loop first one start from 0 condition is less then array length -2
	 * 2. second for loop starts from i + 1 and condition is arraylength - 1
	 * 3. third for loop is starts from j+ 1 and condtion is less then arraylength
	 * 4. inside difference between i and j and j and is equal to means we increment the counter
	 * 
	 *  last return the counter
	 *  
	 *  +ve - >[0,1,4,6,7,10], diff = 3
	 *  +ve [4,5,6,7,8,9], diff = 2
	 *  edge - [0,0,0,0,0,0] diff = 2
	 *  -ve - [1,2] diff = 2
	 * */
	
	 public static int arithmeticTripletsBruteForce(int[] nums, int diff) {
		if(nums.length < 3)
			return -1;
		int cnt = 0;
		
		for(int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for(int k = j + 1; k < nums.length; k++) {
							
					if(((nums[j] - nums[i]) == diff) && ((nums[k] - nums[j]) == diff)) {
						cnt++;
					}
					
				}
				
			}
		}
		 
		 return cnt;
	        
	    }
	 
	 
	 public static int arithmeticTripletsArrayList(int[] nums, int diff) {
			if(nums.length < 3)
				return -1;
			int cnt = 0;
			
			for(int i = 0; i < nums.length - 2; i++) {
				for (int j = i + 1; j < nums.length - 1; j++) {
					for(int k = j + 1; k < nums.length; k++) {
								
						if(((nums[j] - nums[i]) == diff) && ((nums[k] - nums[j]) == diff)) {
							cnt++;
						}
						
					}
					
				}
			}
			 
			 return cnt;
		        
		    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
