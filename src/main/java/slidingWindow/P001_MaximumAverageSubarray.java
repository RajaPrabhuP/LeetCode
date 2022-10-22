package slidingWindow;

public class P001_MaximumAverageSubarray {

	/*You are given an integer array nums consisting of n elements, and an integer k.

	Find a contiguous subarray whose length is equal to k that has the maximum average value and
 	return this value. Any answer with a calculation error less than 10-5 will be accepted.
 	
 	https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/

 */
public static double findMaxAverage(int[] nums, int k) {
        
        int sum = 0, start = 0, end = 0;
        double max = Double.MIN_VALUE;
        double avg;
        //1,12,-5,-6,50,3 k = 4
       
        
        while(start < k ){
            sum+= nums[start];
            start++;
        }
        max = Math.max(max, sum / k);
        
        while(k < nums.length){
            sum = sum + nums[k];
            sum = sum - nums[end++];
            avg = sum / k;
            max = Math.max(max, avg);
            k++;
            start++;
        }
        return max;
    }

public static double findMaxAverageNew(int[] nums, int k) {
    
    int sum = 0, start = 0, end = 0, target = k;
    double max = Double.MIN_VALUE;
    double avg;
    //1,12,-5,-6,50,3 k = 4
   
    
    while(start < k ){
        sum+= nums[start];
        start++;
    }
    max = Math.max(max, sum / k);
    
    while(k < nums.length){
        sum = sum + nums[k];
        sum = sum - nums[end++];
        avg = sum / target;
        max = Math.max(max, avg);
        k++;
        start++;
    }
    return max;
}

public static void doubleMax() {
	
    double dou = -1;
    double div = 1;
    System.out.println(dou/ div);
  
}
	
	
	public static void main(String[] args) {
		
		//findMaxAverage(new int[] {1,12,-5,-6,50,3}, 4);
		System.out.println(findMaxAverage(new int[] {-1}, 1));
		//doubleMax();
	}

}
