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
	

	
	public static int kadaneAlgorithAllNegative(int[] nums) {
		int sum = 0,  max = 0, min = Integer.MIN_VALUE;
		for(int i = 0; i < nums.length; i++) {
			
			sum += nums[i];
			if(sum < 0) {
				min = Math.max(min, sum);
				sum = 0;
			}
			max = Math.max(max, sum);
		}
		System.out.println(max);
		if(max == 0)
			return min;
		return max;
	}
	
	
	public static void main(String[] args) {
		
		kadaneAlgorith(new int[] {-2,1,-3,4,-1,2,1,-5,4});
		
		//kadaneAlgorith(new int[] {0, 0, 0, 1, 2, 1});
		
		System.out.println(kadaneAlgorithAllNegative(new int[] {-3, -4, -2, -9}));
		System.out.println(kadaneAlgorithAllNegative(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
		
		//kadaneAlgorithAllNegative(new int[] {-1, -1, -1, -1});
	}

}
