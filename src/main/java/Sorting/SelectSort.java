package Sorting;

import java.util.Arrays;

public class SelectSort {

	/*Time = O[n^2]
	 * space = O[n]
	 * 
	 *Iterate throgh outer loop for each elm
	 *arr [i] is the pivot element
	 *ising inner loop and identify if arr[i] is greater then arr[j] means 
	 *j index is pivot.
	 *After that swap pivot and arr[i]	 * */
	public static void selectSort(int[] arr) {
		
		for(int i = 0; i < arr.length - 1; i++) {
			int idx = i;
			
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j])
					idx = j;
			}
			
			 int temp = arr[i];
			 arr[i] = arr[idx];
			 arr[idx] = temp;
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
public static void selectSortDesc(int[] arr) {
		
		for(int i = 0; i < arr.length - 1; i++) {
			int idx = i;
			
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] < arr[j])
					idx = j;
			}
			
			 int temp = arr[i];
			 arr[i] = arr[idx];
			 arr[idx] = temp;
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	public static void main(String[] args) {
		selectSort(new int[] {9,8,7,6});
		selectSortDesc(new int[] {1,2,3,3,4});

	}

}