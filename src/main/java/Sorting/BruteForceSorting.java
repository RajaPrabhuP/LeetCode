package Sorting;

import java.util.Arrays;

public class BruteForceSorting {
	
	
		public static void sortBruteForce(int[] arr) {
			for(int i = 0; i < arr.length - 1; i++){
				
				for(int j = i + 1; j < arr.length; j++){
					if(arr[i] > arr[j]){
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
				
			}
			
			System.out.println(Arrays.toString(arr));
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortBruteForce(new int[] {9,8,7,6,5,4,3,2,1});
	}

}
