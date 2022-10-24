import java.util.Arrays;

public class RemoveElementInArray {

	/*
	 * Initialize the both left and right at same position 
	 * 2. If right != k means swap right to left
	 * 3. right always increment
	 * */
	
	public static void RemoveElementInArrayTwoPointer(int[] arr, int k){		
		
		int left = 0;
		
		for(int right = 0; right < arr.length; right++) {
			if(arr[right] != k) {
				arr[left++] = arr[right];
				}
		}
		System.out.println(Arrays.toString(Arrays.copyOf(arr, left)));
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveElementInArrayTwoPointer(new int[] {1,2,3,4,5,6,3,3,4,5,6}, 3);
	}

}
