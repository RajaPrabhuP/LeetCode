package Sorting;

import java.util.Arrays;

public class BubbleSort {

	
	
	public static void bubbleSort(int[] arr) {
		
		// 4 3 2 1	
		for(int i = 0; i < arr.length; i++) {
			int idx = i;
		   for(int j = 0; j < arr.length - 1 - i; j++) {
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
		bubbleSort(new int[] {9,8,7,6});	
	}

}
