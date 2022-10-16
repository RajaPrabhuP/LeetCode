import java.util.Arrays;

public class SingleParityTwoPointer {
	
	
	/*
	 * Input: nums = [3,1,2,4]
	Output: [2,4,3,1]
	Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
	 
	 * start and end 
	 * 
	 * 
	 * */
	
	
	public static int[] SingleParity(int[] arr) {
		
		if(arr.length <= 2) {
			return arr;
		}
		int start = 0 , end = arr.length - 1, temp;
		
		while(start < end){
			
			if(arr[start] % 2 == 0 ){
				start++;			
			}else if(arr[end]  % 2 != 0){
				end --;
			}else{
				temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;			
			}
		}
		
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	public static void main(String[] args) {
		
		SingleParity(new int[] {1,2,3,4,5,6});
		
	}

}
