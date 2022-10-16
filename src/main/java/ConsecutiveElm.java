import java.util.Arrays;

public class ConsecutiveElm {

	//op - {3,5,7,9}*
	//int[] = {1,2,3,4,5} 

	public static void cosecutive(int[] arr) {
		//[1,2,3,4] -> 3,5,7
		int[] res = new int[arr.length - 1];
		int sum = 0;
		
		for(int i = 0; i < arr.length - 1; i++){

			sum = arr[i] + arr[i + 1];
			res[i] = sum; 
		}
		
		System.out.println(Arrays.toString(res));

	}
	
	public static void cosecutiveTwo(int[] arr) {
		int[] res = new int[arr.length];
		
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length ; j++) {
				
				res[i] = arr[i] + arr[j];
				break;
				
			}
		}
		System.out.println(Arrays.toString(res));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cosecutive(new int[] {1,2,3,4,5});
		cosecutiveTwo(new int[] {1,2,3,4,5});
	}

}
