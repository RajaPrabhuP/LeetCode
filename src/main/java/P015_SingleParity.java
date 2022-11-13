
public class P015_SingleParity {
	
	/*https://leetcode.com/problems/sort-array-by-parity/
	 * 
	 * Single Parity:
	 * 1. left Pointer is zero and right is nums.length - 1
	 * 2. if left idx not equal to even and right idx not equal to odd
	 * 			then swap left and right 
	 * 			increment left decrement right
	 * 3. else if left is equal to even increment left
	 * 4. else if right is equal to odd decrement right 
	 * breaking condition is left less the right.
	 * 
	 * */
	
	public static int[] sortArrayByParityTwoPointer(int[] nums) {
        int left = 0, right = nums.length - 1;
		
		while(left < right){
			if(nums[left] % 2 != 0 && nums[right] % 2 == 0){
				int temp = nums[left];
				nums[left++] = nums[right];
				nums[right--] = temp;
			}else if(nums[left] % 2 == 0){
				left++;
			}else if(nums[right] % 2 != 0){
			right--;
		}
			
		}
		return nums;
    }
	
	 public int[] sortArrayByParityBruteForce(int[] nums) {
	                  
			int output[] = new int[nums.length];
			int idx = 0;
			for(int i = 0; i < nums.length; i++){
				if(nums[i] % 2 == 0)
					output[idx++] = nums[i];
			}
			for(int i = 0; i < nums.length; i++){
				if(nums[i] % 2 != 0)
					output[idx++] = nums[i];
			}
			
			return output;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
