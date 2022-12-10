package Sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int[] arr) {
		if(arr.length <= 1)
			return;
		for(int i = 0; i < arr.length - 1; i++) {
			
			for(int j = i ; j >= 0; j--) {
				
				if(arr[j] > arr[j + 1]) {
					
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertionSort(new int[] {5,4,3,5,1});
		//insertionSort(new int[] {4,5,6,1,1,});
		
	}

}
