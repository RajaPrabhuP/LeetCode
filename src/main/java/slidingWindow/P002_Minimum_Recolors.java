package slidingWindow;

public class P002_Minimum_Recolors {

	/*
	 * You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', representing the color of the ith block. The characters 'W' and 'B' denote the colors white and black, respectively.

		You are also given an integer k, which is the desired number of consecutive black blocks.
		https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/

In one operation, you can recolor a white block such that it becomes a black block.

Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.
	 * \
	 * Test Data =>
	 * +ve ->   "WBBWWBBWBW", k = 7, output = 3, 
	 *  WBWBBBW", k = 2
	 	Pseudo Code Sliding window:
	 	start = zero, end = 0,
	 	target = k
	 	
	 	iterate through while to find max 
	 * 
	 * */
	// "WBBWWBBWBW", k = 7
	public static int Minimum_Recolors(String blocks, int k) {
		
		int start = 0, end = 0;
		int min = Integer.MAX_VALUE;
		int counter = 0;
		char[] chArr = blocks.toCharArray();
		
		while(start < k) {
			if(chArr[start] == 'W')
				counter++;
			start++;
		}
		
		min = Math.min(min, counter);
		
		while(k < chArr.length ) {
			if(chArr[k] == 'W') {
				counter++;
			}
			if(chArr[end++] == 'W') {
				counter--;
			}
			
			min = Math.min(min, counter);
			k++;
			//end++;
		}
			
		return min;
	}
	
	
	public static void main(String[] args) {
	
		//System.out.println(Minimum_Recolors("WBBWWBBWBW", 7));
		System.out.println(Minimum_Recolors("WBWBBBW", 2));
	
		

	}

}
