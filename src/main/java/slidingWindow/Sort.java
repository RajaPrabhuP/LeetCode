package slidingWindow;

import java.util.Arrays;

public class Sort {
	
	public static void sortNumber(int[] nums) {
		int temp;
		for(int i = 0; i < nums.length; i++) {
			
			for(int j = i + 1; j < nums.length; j++) {
				
				if(nums[i] > nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(nums));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortNumber(new int[] {2,1,0,1,2,3});
	}

}
