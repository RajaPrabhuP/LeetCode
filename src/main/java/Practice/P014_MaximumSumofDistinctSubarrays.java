package Practice;

import java.util.ArrayList;
import java.util.HashSet;

public class P014_MaximumSumofDistinctSubarrays {
	public static long maximumSubarraySum(int[] nums, int k) {
		/*long sum = 0;
	        long max = 0;
	        HashSet<Integer> hset = new HashSet<>();
	        for(int i = 0; i <= nums.length - k; i++){

	            for(int j = i; j < i + k; j++){
	                hset.add(nums[j]);
	                sum = sum + nums[j];
	            }
	            if(hset.size() == k)
	                max = Math.max(max, sum);
	            System.out.println(hset);
	            hset.clear();
	            sum = 0;
	        }

	        return max;*/

		long sum = 0;
		long max = 0;
		int left = 0, right = 0;
		HashSet<Integer> al = new HashSet<>();

		while(right < nums.length){
			if((right - left + 1) <= k && al.add(nums[right])){
				sum = sum + nums[right++];
				
			}else{
				sum = sum - nums[left];
				al.remove(nums[left]);
				left++;
			}
			if(al.size() == k)
				max = Math.max(max, sum);
		}
		System.out.println(max);
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				maximumSubarraySum(new int[] {1,1,1,7,8,9}, 3);
	}

}
