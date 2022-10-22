package slidingWindow;

public class Asssessment {

	
	/*Arr = 1,5,2,3,7,1
	 * target = 3
	 * 
	 * constraint 1<= k < arr.length
	 * */
	/*Pseudo code for Two Pointer
	 * 
	 * create start and end, start is zero and end is target - 1,
	 * create sum = 0 and Max value also starts 0
	 * iterate throgh while loop breaking condition is end less then arr.length
	 * 
	 * 	Iterate throgh for loop using initialize start and condtion break is end
	 * 			add sum and using math to identify the Maximu value
	 * 
	 *  
	 * */
	
	public static void AsssessmentTwoPointer(int[] arr, int k) {
		
		int start = 0, end = k - 1, sum = 0, max = 0;
		
		while(end < arr.length) {
			
			for(int i = start; i <= end; i++) {
				System.out.println(arr[start]);
				System.out.println("End Sub Array");
				sum = sum + arr[i];
				max = Math.max(max, sum);
			}
			sum = 0;
			start++;
			end++;
		}
		
		System.out.println(max);
		
	}
	
public static void AsssessmentTwoPointerNew(int[] arr, int k) {
		
		int start = 0, end = k - 1, sum = 0, max = 0;
		
		while(end < arr.length) {
			
			sum = sum + arr[start] + arr[++start] + end;
			max = Math.max(max, sum);
			sum = 0;
			end++;
		}
		
		System.out.println(max);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AsssessmentTwoPointer(new int[] {1, 5, 2, 3, 7, 1}, 3);
		AsssessmentTwoPointerNew(new int[] {1, 5, 2, 3, 7, 1}, 3);
	}

}
