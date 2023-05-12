package Practice;

public class P017_ConsecutiveOnes {
	public static int consecutiveOne(int[] arr, int k){
		//1,1,1,0,0,0,1,1,1,1,0
		if(arr.length <= k)
			return arr.length;
		
		int left = 0, right = 0, max = Integer.MIN_VALUE;
		
		while(right < arr.length){
			if(arr[right] == 0) { // 1  1 1 0 0 0 1
				k--;			// -1
			}
			if(k < 0){
				if(arr[left] == 0) { //1
					k++;
				}
				
				left++;
			}
			max = Math.max(max, right - left);  //5
			right++;
		
			}
		
			System.out.println(max + 1);
			return max + 1 ;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//consecutiveOne(new int[] {1,1,1,0,0,0,1,1,1,1,0}, 2);
		//consecutiveOne(new int[] {1,1,1,0,0,0,1,1,1}, 3);
		consecutiveOne(new int[] {0 , 0}, 2);
		
	}

}
