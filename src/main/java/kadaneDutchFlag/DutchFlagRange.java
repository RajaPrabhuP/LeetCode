package kadaneDutchFlag;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DutchFlagRange {

	public static void DutchFlagAlgoAscending(int[] nums){
		
		List<Integer> leftRange = new ArrayList<>();
		List<Integer> middleRange = new ArrayList<>();
		List<Integer> rightRange = new ArrayList<>();
		leftRange.add(1);
		leftRange.add(2);
		leftRange.add(3);
		
		middleRange.add(4);
		middleRange.add(5);
		middleRange.add(6);
		middleRange.add(7);
		middleRange.add(8);
		middleRange.add(9);
		middleRange.add(10);
		
		rightRange.add(11);
		rightRange.add(12);
		rightRange.add(13);
		rightRange.add(14);
		rightRange.add(15);
		
		
		int left = 0, middle = 0, right = nums.length - 1, temp;
		
		while(middle <= right) {
			
			if(middleRange.contains(nums[middle])) {
				middle++;
			}else if(rightRange.contains(nums[middle])) {
				temp = nums[right];
				nums[right--] = nums[middle];
				nums[middle] = temp;
				
			}else if(leftRange.contains(nums[middle])) {
				temp = nums[left];
				nums[left++] = nums[middle];
				nums[middle++] = temp;
			}
			
		}
		System.out.println(Arrays.toString(nums));
			
		
	}

	/*Dutch Flag Range
	 * leftRange - 1 to 3
	 * middleRange - 4 to 10
	 * rightRange - 11 to 15
	 * 
	 * 1. left and middle start from 0 and right starts from length
	 * 2. If arr[middle] in the range of middle means increment middle
	 * 3. If arr[middle] in the range of left means swap middle and left and increment both left and middle
	 * 4. If arr[middle] in the range of right means swap middle and right decrement right alone 
	 * 
	 * 
	 * */
public static void DutchFlagAlgoAscendingArray(int[] nums){
		
		
		int left = 0, middle = 0, right = nums.length - 1, temp;
		
		while(middle <= right) {
			
			if(nums[middle] >= 4 && nums[middle] <= 10) {
				middle++;
			}else if(nums[middle] >= 11 && nums[middle] <= 15) {
				temp = nums[right];
				nums[right--] = nums[middle];
				nums[middle] = temp;
				
			}else if(nums[middle] >= 1 && nums[middle] <= 3) {
				temp = nums[left];
				nums[left++] = nums[middle];
				nums[middle++] = temp;
			}
			
		}
		System.out.println(Arrays.toString(nums));
			
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DutchFlagAlgoAscending(new int[] {5,7,2,9,1,14,12,10,5,3});
		DutchFlagAlgoAscendingArray(new int[] {5,7,2,9,1,14,12,10,5,3});
		
		
	}

}

