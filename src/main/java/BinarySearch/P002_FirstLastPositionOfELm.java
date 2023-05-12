package BinarySearch;

import java.util.Arrays;

public class P002_FirstLastPositionOfELm {
	
	public static int firstOccure(int[] nums, int target) {
		
		int start = 0, end = nums.length - 1;
		int idx = -1;
		while(start <= end) {
			int mid =  (start + end) / 2;
			if(nums[mid] > target)
				end = mid -1;
			else if(nums[mid] < target)
				start = mid + 1;
			else {
				idx = mid;
				end = mid - 1;
			}
			
		}
		return idx;
		
	}
	
	
	public static int[] searchRange(int[] nums, int target) {      
        if(nums.length == 0)
              return new int[]{-1, -1};
        if(nums.length == 1 && nums[0] == target)
        	return new int[]{0, 0};

          int start = 0, end = nums.length - 1;
          int[] output = {-1, -1};
          while(start < end){
              int mid = (start + end) / 2;
              if(nums[mid] == target){
                   int midLeft = mid - 1;
                   int midRight = mid + 1;
                      output[0] = mid;
                      output[1] = mid;
                 while(midLeft >= 0 && midRight < nums.length){
                     if(nums[midLeft] == target){
                      output[0] = midLeft;
                      midLeft--;
                     }
                     if(nums[midRight] == target){
                      output[1] = midRight;
                      midRight++;
                     }
                     if(nums[midLeft] != target && nums[midRight] != target)
                          break;
                  }
                 break;
              }else if(nums[mid] > target)
                  end = mid - 1;
              else if(nums[mid] < target)
                  start = mid + 1;
          }
          System.out.println(Arrays.toString(output));
          return output;
          }
	public static void main(String[] args) {
		System.out.println(firstOccure(new int[] {1,2,3,5,5,5,5,7,8}, 5));
		
	}

}
