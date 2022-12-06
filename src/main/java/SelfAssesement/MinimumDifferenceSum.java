package SelfAssesement;

import java.util.Arrays;

public class MinimumDifferenceSum {
	public static int minSum(int[] arr){
		
		Arrays.sort(arr);
		if(arr.length == 1)
			return arr[0];
		int p1 = 0, p2 = p1 + 1;
		int sum = 0;
		while(p2 < arr.length){
			sum = sum + Math.abs(arr[p2] - arr[p1]);
			p1++; p2++;
		}
		
		System.out.println(sum);
		return sum;
		
	}

	public static void main(String[] args) {
		
		minSum(new int[] {});
		minSum(new int[] {5,4,8,1,2}); //1 + 2 + + 1 + 3 = 7
		
	}

}
