import java.util.Arrays;

public class P009_MoveZeroes {
	
	/*
	 * Given an integer array nums, move all 0's to the end of it while maintaining 
	 * the relative order of the non-zero elements.
	Note that you must do this in-place without making a copy of the array.
	
	*Test Data
	*+ve -> [0,0,0,1,2,3,4] -> [1,2,3,4,0.0.0.0]
	*edge -> [0] -> [0]
	*-ve  > [0,0,0,0,0] -> [0 0 0 0 0 ]
	*
	*Pseudo code
	*create 2 var start and end -> start from zero end from arr length - 1
	*iterating throg while loop break point is start < end
	*conditionns:
	*
	*if arr[start] == 0 and arr[end] not equal to zero
	*	swap arr[start] and arr[end]
	*	and increment start decrement end
	*if arr[start] not equal to zero
	*	start ++
	*if arr[end] equal to zero
	*	end --;
	*
	*	space complexity = O[N]
	*	time complexity = O[N]
	*/
	public static int[] MoveZeroesProblem(int[] arr) {
		
		if(arr.length == 1) 
			return arr;
		int start = 0, end = arr.length - 1, temp;
		
		while(start < end) {
			if(arr[start] == 0 && arr[end] != 0) {
				temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
			if(arr[start] != 0 )
				start++;
			if(arr[end] == 0)
				end--;
			
		}
		System.out.println(Arrays.toString(arr));
		return arr;
		
	}
	
public static int[] MoveRightZeros(int[] arr) {
		
		if(arr.length == 1) 
			return arr;
		int left = 0, right = 0, temp;
		
		while(right < arr.length) {
			
			if(arr[right] != 0) {
				temp = arr[left];
				arr[left++] = arr[right];
				arr[right++] = temp;
			}else {
				right++; 
			}
		}
		
		System.out.println(Arrays.toString(arr));
		return arr;
		
		
		
		
	}
	
	public static void movesZeroTwoPointer(int[] nums) {
		int start = 0, end = start + 1, temp;
		
		while(end < nums.length) {
			
			if(nums[start] == 0) {
				
				if(nums[end] != 0) {
					temp = nums[start];
					nums[start] = nums[end];
					nums[end] = temp;
					start++;
				}
				
			}else {
				start++;
			}
			end++;
		}
		System.out.println(Arrays.toString(nums));
	}
	
	public static void main(String[] args) {
		
//		movesZeroTwoPointer(new int[] {0,0,0,1,2,3,4});
//		MoveZeroesProblem(new int[] {0});
//		MoveZeroesProblem(new int[] {0,0,0});
		MoveZeroesProblem(new int[] {1,0,2,0,3,0,14,0,5,0,6,0,70});
	}

}
