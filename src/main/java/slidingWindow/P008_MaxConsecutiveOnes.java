package slidingWindow;

public class P008_MaxConsecutiveOnes {

	
	
	/*Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array 
	 * if you can flip at most k 0's.

 */
	
	/* 
	 * Sliding Window:
	 * 1. Initialize left and right start with zero,
	 * 2. Iterate throuhj while loop
	 * 2. if k < 0 to calculate the maximum right - left - 1
	 * 		inside if left is equal to zero increment target and increment left
	 * 		if left == 1 means increment left
	 * 	else if k > 0
	 * 		inside if right == 0 decrement -- and right increment
	 * 		else right == 1 increment right;
	 * 
	 * */
	
	public static void MaxConsecutiveOnes(int[] nums, int k) {    
		
		int len = nums.length, left = 0, right = 0, max = Integer.MIN_VALUE;
		
		//[1,1,1,0,0,0,1,1,1,1,0], k = 2
		
		while(right  < len ) {
			
		if(k < 0) {
			max = Math.max(max, right - left - 1);
			System.out.println(max);
			if(nums[left] == 0) {
				k++;
				left++;
			}else if(left == 1) {
				left++;
			}
		}else{
			if(nums[right] == 0) {
				k--;
				right++;
			}else if(nums[right] == 1) {
				right++;
			}			
		}
		}
		
	}
	
public static void MaxConsecutiveOnesTwo(int[] nums, int k) {    
		
		int len = nums.length, left = 0, right = 0, max = Integer.MIN_VALUE;
		
		//[1,1,1,0,0,0,1,1,1,1,0], k = 2
		
		while(right  < len ) {
			if(nums[right] == 0) 
				k--;	
		if(k < 0) {
			max = Math.max(max, right - left );
			System.out.println(max);
				if(nums[left] == 0) k++;
						left++;
			}
		
		right++;
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MaxConsecutiveOnes(new int[] {1,1,1,0,0,0,1,1,1,1,0}, 2);
		//MaxConsecutiveOnesTwo(new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3);
		
	}

}
