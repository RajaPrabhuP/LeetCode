import java.util.Arrays;

public class TwoParity {

	/*Pseduo code :
	 *  +ve -> 1,2,3,4,5,6,7,8,9,10
	 *  -ve -> 1
	 *  
	 *  
	 *  Pseudocode:
	 *  
	 *  create resultant array with same input size
	 *  
	 *  iterate the elm in first for loop,
	 *  if even nub -> store in even position in resultant
	 *  
	 *  if odd num -> store in odd position 
	 *  
	 * 
	*/
	
	public static void secondParity(int[] arr) {
		
		int[] resultantArr = new int[arr.length];
		int idx = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 ==0 && idx < arr.length) {
				resultantArr[idx] = arr[i];
				idx = idx + 2;
				System.out.println(Arrays.toString(resultantArr));
				
			}
		}
		
		idx = 1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0 && idx < arr.length) {
				resultantArr[idx] = arr[i];
				idx = idx + 2;
				
			}
		}
		System.out.println(Arrays.toString(resultantArr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		secondParity(new int[] {1,2,3,4,5,6,7,8,9,10});
	}

}
