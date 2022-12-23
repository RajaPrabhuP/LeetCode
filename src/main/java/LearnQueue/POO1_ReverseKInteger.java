package LearnQueue;

import java.util.ArrayDeque;

public class POO1_ReverseKInteger {
	
	public static void reverseKint(int[] arr, int k) {
		
		ArrayDeque<Integer> que = new ArrayDeque<Integer>();
		
		if(k > arr.length)
			k = arr.length;
		if(k < 0)
			return;
		int tar = k;
		for(int i = k - 1; i >= 0; i--)
			que.add(arr[i]);
		for(int j = tar; j < arr.length; j++)
			que.add(arr[j]);
		System.out.println(que);
		
		
		
	}
	
	public static void main(String[] args) {
		
		reverseKint(new int[] {1,2,3,4,5,6,7,8,9}, -1);

	}

}
