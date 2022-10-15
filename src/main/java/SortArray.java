import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArray {
	/*Pseduo code :
	1. create an result array with size of same array
	2. Iterate an array with loop
		if value is even store even list
		ELSE STORE IT odd list 
	Merge into two list and store into Array
	*/
	public static void voidSortArray(int[] arr) {
		int result[] = new int[arr.length];
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				even.add(arr[i]);
				
			}else {
				odd.add(arr[i]);
				
			}
		}
		//System.out.println(even);
		//System.out.println(odd);
		int oddsize = 0;
		for(int i = 0; i < even.size(); i++ ) {
			result[i] =  even.get(i);
			oddsize++;
		}
		
		for(int j = 0; j < odd.size(); j++) {
			result[oddsize++] =  odd.get(j);
		}
		
		System.out.println(Arrays.toString(result));
	}
	
	public static void voidSortArrayClean(int[] arr) {
		int result[] = new int[arr.length];
		int k = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				result[k++] = arr[i];
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				result[k++] = arr[i];
			}
		}
	}
	
	public static void main(String[] args) {
		
		voidSortArray(new int[] {1,2,3,4,5,6,7,8,9,120});
		voidSortArray(new int[] {});
		
		
	}
}
