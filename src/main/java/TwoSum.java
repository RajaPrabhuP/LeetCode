import java.util.Arrays;

public class TwoSum {
	
	public static int[] twoSum(int arr[], int target) {
		arr.
		int[] resultarr = new int[2];
		if(arr.length < 2) {
			return new int[] {};
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length - 1; j++) {
				
				if(arr[i] + arr[j] == target) {
					resultarr[0] = i;
					resultarr[1] = j;
				}
			}
		}
		
		return resultarr;	
	}
	
	public static void main(String[] args) {
		
//		int[] twoSum = twoSum(new int[] {1, 2, 2, 3, 4}, 4);
//		System.out.println(Arrays.toString(twoSum));
//		
//		int[] twoSum1 = twoSum(new int[] {}, 4);
//		System.out.println(Arrays.toString(twoSum1));
//		
//		int[] twoSum2 = twoSum(new int[] {11,45,4}, 4);
//		System.out.println(Arrays.toString(twoSum1));
		int[] arr = {};
		int[] arr1 = new int[5];
		System.out.println(arr);
		System.out.println(arr1.toString());
	}

}
