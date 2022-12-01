package slidingWindow;

public class P012_MaximumPointsYouCanObtainfromCards {
	//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
	//[1,2,3,4,5,6,1], k = 3
	/*First identify the whole sum in sum var.
	 * if codepoints length is equal to k means directlt return the value
	 * And identify the remaining window size like except k because we need the sum value from 
	 * both left and right.
	 * inside for loop we have condition like code point minus k windowsize is 4 caluculate the sum
	 *  if main sum minus window sum is remaining element sum is stored into temp sum
	 *  */
	
	 public static int maxScore(int[] codePoints, int k) {
		
		 int sum = 0, windowsum = 0;
		 
		 for(int i = 0; i < codePoints.length; i++)
			 sum = sum + codePoints[i];
		 if(codePoints.length == k)
			 return sum;
		 
		 for(int i = 0; i < codePoints.length - k; i++ )
			 windowsum = windowsum + codePoints[i];
		 int tempSum = sum - windowsum;
		 
		 for(int i = codePoints.length - k; i < codePoints.length; i++ ) {
			 int idx = i - (codePoints.length - k);
			 windowsum = windowsum + codePoints[i] - codePoints[idx];
			 tempSum = Math.max(tempSum, sum - windowsum);
		 }
		 System.out.println(tempSum);
		 return tempSum;
		 
	 }
	public static void main(String[] args) {
		maxScore(new int[] {1,2,3,4,5,6,1}, 3);

	}

}
