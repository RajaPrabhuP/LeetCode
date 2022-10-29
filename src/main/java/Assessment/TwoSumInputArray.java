package Assessment;

public class TwoSumInputArray {

	//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
	/*Brute Force
	 * 
	 * 1. Outer for iterate from 0 th idx
	 * 2. inner for loop iterate throght i + 1;
	 * 3. calculate sum = i + j
	 * 4. if sum == target return array with i + 1 and j + 1
	 * 
	 * +ve - [2,7,11,15 ] - 0, 1
	 * -ve - [2, 7, 11, 15] - [-1, -1]
	 * 
	 *  * 
	 * */
	
	 public int[] twoSum(int[] numbers, int target) {
		int sum = 0;
		int[] result = new int[] {-1, -1};
		
		for(int i = 0; i < numbers.length; i++) {
			
			for(int j = i + 1; j < numbers.length; j++) {
				
				if(target == numbers[i] + numbers[j]) {
					return new int[] {i + 1, j + 1};
				}
				
				
				}
		}
		 
		return numbers;
	        
	    }
	 
	 
	 /*Two Pointer
		 * 
		 * Declare start and end Pointer start = 0 end length - 1
		 * iterate through while breaking condition is start less the end
		 * if sum equal to target means return array with start + 1m and end + 1
		 * else if sum greater then sum means end decrement
		 * else if sum i less the target start++
		 * 
		 * +ve - [2,7,11,15 ] - 0, 1
		 * -ve - [2, 7, 11, 15] - [-1, -1]
		 * 
		 * 
		 * 
		 *  * 
		 * */
	 
	 // Time -> 
	 public int[] twoPointer(int[] numbers, int target) {
			int sum = 0;
			int[] result = new int[] {-1, -1};
			int start = 0, end = numbers.length - 1;
			
			while(start < end) {
				
				if(numbers[start] + numbers[end] == target) {
					return new int[] {start + 1, end + 1};
				}else if(numbers[start] + numbers[end] > target) {
					end--;
				}else if(numbers[start] + numbers[end] < target) {
					start++;
				}
				
			}
			 
			return numbers;
		        
		    }
	
	public static void main(String[] args) {
		

	}

}
