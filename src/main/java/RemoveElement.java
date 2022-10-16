import java.util.Arrays;

public class RemoveElement {

	/*Given an integer array nums and an integer val, remove all occurrences of val 
	 * ]
	 *in nums in-place. The relative order of the elements may be changed.
	Since it is impossible to change the length of the array 
	in some languages, you must instead have the result be placed in the first part of the array 
	nums. More formally, if there are k elements after removing the duplicates, then the first k 
	elements of nums should hold the final result. It does not matter what you leave beyond the 
	first k elements.
	Return k after placing the final result in the first k slots of nums.
	Do not allocate extra space for another array. You must do this by 
	modifying the input array in-place with O(1) extra memory.
	
	0 <= nums.length <= 100
	0 <= nums[i] <= 50
	0 <= val <= 100
	
	+ve ->[1,2,3,4,5,6,6,6,6,8,9,8,9,5,8] val = 6 [1,2,3,4,5,8,9,8,9,5,8,_,_,_,_] return 11
	-ve ->[1,2,3,4,5] - val = 6 return 5
	edge->[1,1,1,1] val = 1 return 0
	
	*Pseudo code
	* declare idx = -1
	*1. Iterate through for loop
	*3. 
	* if arr[i] != val
	* 	 idx 
	* 	 increment the idx + 1
	* 
	* return idx
	*/
	
	//space - O[1]
	//time - o(N)
	public static void RemoveElementIn(int[] arr, int val) {
		int idx = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] != val) {
				arr[idx++] = arr[i];
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(idx);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveElementIn(new int[] {1,2,3,4,5,6,6,6,6,8,9,8,9,5,8}, 6);
		RemoveElementIn(new int[] {1,2,2,4}, 2);
		RemoveElementIn(new int[] {1,2,2,4}, 6);
		RemoveElementIn(new int[] {1,1,1,1,1}, 1);
	}

}
