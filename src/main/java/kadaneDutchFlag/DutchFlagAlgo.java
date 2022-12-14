package kadaneDutchFlag;

import java.util.Arrays;

public class DutchFlagAlgo {

	
	/*1.Initialize low=0, middle=0 and high=arr.length-1
	2.If the arr[middle] is 0, swap middle and low values and increment both pointer
	3.If the arr[middle] is 1, increment middle  pointer
	4.If the arr[middle] is 2, swap middle and high values and decrement high pointer
	5.Break the loop when middle<=high

10. Dutch Flag Algorithm is explained in Excel using different Test data

11. Dutch Flag Algorithm Problem solution Debugged & the solution and explained*/
	
	public static void DutchFlagAlgoAscending(int[] nums){
		int left = 0, middle = 0, right = nums.length - 1, temp;
		
		while(middle < right) {
			
			if(nums[middle] == 1) {
				middle++;
			}else if(nums[middle] == 0) {
				temp = nums[middle];
				nums[middle] = nums[left];
				nums[left] = temp;
				middle++; left++;
			}else if(nums[middle] == 2){
				temp = nums[middle];
				nums[middle] = nums[right];
				nums[right] = temp;
				 right--;
			}
			
		}
		System.out.println(Arrays.toString(nums));
	}
	
	public static void DutchFlagAlgoDescending(int[] nums){
		int left = 0, middle = 0, right = nums.length - 1, temp;
		
		while(middle <= right) {
			
			if(nums[middle] == 1) {
				middle++;
			}else if(nums[middle] == 2) {
				temp = nums[middle];
				nums[middle] = nums[left];
				nums[left] = temp;
				left++; middle++;
			}else if(nums[middle] == 0) {
				temp = nums[middle];
				nums[middle] = nums[right];
				nums[right] = temp;
				right--;
			}
			
		}
		System.out.println(Arrays.toString(nums));
	}
	
	/*1,2,3,  4,4,5,5, 6,7,8,9,

mid range = 1 - 3
left = 4,5
right = 6, 9*/
	
	public static void sortRange(int[] nums) {
		int left = 0, right = nums.length - 1, mid = 0, temp;
		while(mid <= right) {
			if(nums[mid] >= 1 && nums[mid] <= 3)
				mid++;
			else if(nums[mid] >= 4 && nums[mid] <= 5) {
				temp = nums[mid];
				nums[mid++] = nums[left];
				nums[left++] = temp;
			}else if(nums[mid] >= 6 && nums[mid] <= 9) {
				temp = nums[mid];
				nums[mid] = nums[right];
				nums[right--] = temp;
			}
		}
		System.out.println(Arrays.toString(nums));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DutchFlagAlgoAscending(new int[] {2,1,0,2,1,0,2,2,1,0,0,2} );
		//DutchFlagAlgoDescending(new int[] {2,1,0,2,1,0,2,2,1,0,0,2} );
		sortRange(new int[] {1,1,1,4,4,4,5,5,6,6,6} );
		
	}

}
