import java.util.Arrays;

public class P014_TwoParity {

	
	
	/*Pseduo code :
	 *  +ve -> 1,2,3,4,5,6,7,8,9,10
	 *  -ve -> 1
	 * https://leetcode.com/problems/sort-array-by-parity-ii/ 
	 *  
	 *  Pseudocode:
	 *  
	 *  create resultant array with same input size
	 *  
	 *  iterate the elm in first for loop,
	 *  if even nub -> store in even position in resultant
	 *  
	 *  if odd num -> store in odd position 
	 *  
	 * 
	*/
	
	public static void secondParity(int[] arr) {
		
		int[] resultantArr = new int[arr.length];
		int idx = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 ==0 && idx < arr.length) {
				resultantArr[idx] = arr[i];
				idx = idx + 2;
				System.out.println(Arrays.toString(resultantArr));
				
			}
		}
		
		idx = 1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0 && idx < arr.length) {
				resultantArr[idx] = arr[i];
				idx = idx + 2;
				
			}
		}
		System.out.println(Arrays.toString(resultantArr));
	}
	/*Two Pointer:
	 * 
	 * left Pointer starts 0 index and right pointer is left + 1
	 * if left idx elm not even and right idx elm not odd means swap two numbers
	 * else if left is even means increment by two
	 * else if right is odd means increment by two
	 * 
	 * */
	  public static int[] sortArrayByParityII(int[] nums) {
	        int left = 0, right = left + 1;
			
			while(left < nums.length && right < nums.length){
				if(nums[left] % 2 != 0 && nums[right] % 2 == 0){
					int temp = nums[left];
					nums[left] = nums[right];
					nums[right] = temp;
					left += 2;
	               right += 2;
				}else if(nums[left] % 2 == 0)
					left = left + 2;
	            else if(nums[right] % 2 != 0)
					right = right + 2;
				
			}
			return nums;
	    }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//secondParity(new int[] {1,2,3,4,5,6,7,8,9,10});
		sortArrayByParityII(new int[] {1,2,3,4,5,6,7,8,9,10});
	}

}
