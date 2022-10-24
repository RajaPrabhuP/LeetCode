import java.util.Arrays;

public class P010_SingleParityTwoPointer {
	
	
	/*
	 * Input: nums = [3,1,2,4]
	Output: [2,4,3,1]
	Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
	 
	 * start and end 
	 * 
	 * 
	 * */
	/*BruteForce:
	 * 1. Create Result array with size of source array and k = -1.
	 * 2. Iterate through for loop 
	 * 3. if arr[k] is even means add k+1 position in result array
	 * 4. Iterate another for loop to identify the odd number
	 * 5. if arr[k] is odd means add k+1 position in result array
	 * 
	 * */
	
	public static int[] SingleParityBrute(int[] arr) {
		
		int[] result = new int[arr.length];
		int k = -1;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				k = k + 1;
				result[k] = arr[i];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				k = k + 1;
				result[k] = arr[i];
			}
		}
		
		System.out.println(Arrays.toString(result));  // n log n
		return result;
	}
	
	
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
		
		//SingleParity(new int[] {1,2,3,4,5,6});
		SingleParityBrute(new int[] {1,2,3,4,5,6});
		
	}

}
