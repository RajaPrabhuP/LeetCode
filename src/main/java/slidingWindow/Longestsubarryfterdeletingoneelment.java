package slidingWindow;

import org.junit.Test;

public class Longestsubarryfterdeletingoneelment {


		@Test
		public void text() {
			findlongsubArrayafterDeleting(new int[] {1,1,1,0,1,1,1,1}, 1);
		}
	
	public static int findlongsubArrayafterDeleting(int[] nums, int k)
	{
		int left=0,right=0;
		int max=0,maxones=0;
	System.out.println("hi");
		
		
		if(right==nums.length-1 && k==1)return nums.length-1-k;
		while(right<nums.length)
		{
			if(nums[right]==0)k--;
			
			
			if(k<0)
			{
				if(nums[right]==0)left++;
			}
		    right++;	
			max=right-left-1;
			maxones=Math.max(maxones, max);
		}
		
		
		
		return maxones;
		
	}
	
}
