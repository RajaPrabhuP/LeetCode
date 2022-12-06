import java.util.Arrays;

public class P017_SquareRoot {
	
	public static void squareRoot(int[] arr) {
		
		int[] result = new int[arr.length];
		
		int left = 0, right = arr.length - 1, insert = result.length - 1;
		
		while(left <= right) {
			
			if(Math.abs(arr[left]) > Math.abs(arr[right])) {
				result[insert--] = arr[left] * arr[left];
				left++;
			}else if(Math.abs(arr[left]) < Math.abs(arr[right])) {
				result[insert--] = arr[right] * arr[right];
				right--;
			}else {
				result[insert--] = arr[left] * arr[left];
				left++;
			}			
		}
		Arrays.sort(result);
		System.out.println(Arrays.toString(result));
	}
	
	public static void main(String[] args) {
		
		squareRoot(new int[] {-7, -6, -5, 1, 2, 3});
		
	}

}
