package kadaneDutchFlag;

public class KadaneFlagAlgo {

	public static int kadaneAlgorith(int[] nums) {
		int sum = 0,  max = 0;
		for(int i = 0; i < nums.length; i++) {
			
			sum += nums[i];
			if(sum < 0)
				sum = 0;
			max = Math.max(max, sum);
			
		}
		System.out.println(max);
		return max;
	}
	
	public static int kadaneAlgorithAllNegativ(int[] nums) {
		int sum = 0,  max = Integer.MIN_VALUE;
		for(int i = 0; i < nums.length; i++) {
			
			sum += nums[i];
			max = Math.max(max, sum);
			max = Math.max(max, nums[i]);
			
		}
		System.out.println(max);
		return max;
	}
	
	
	public static void main(String[] args) {
		
		//kadaneAlgorith(new int[] {-2,1,-3,4,-1,2,1,-5,4});
		
		//kadaneAlgorith(new int[] {0, 0, 0, 1, 2, 1});
		
		kadaneAlgorithAllNegativ(new int[] {-3, -4, -2, -9});
		
		kadaneAlgorithAllNegativ(new int[] {-1, -1, -1, -1});
	}

}
