package hashing;

import java.util.HashSet;

public class P018_FairCandy {
//https://leetcode.com/problems/fair-candy-swap/submissions/
	/*Brute Force
	 * 
	 * 1. SumAlice the alice array using for loop\
	 * 2. SumBob the Bob array using for loop
	 * 3. identify the condition is sumAlce - current value of bob and alicevalue[i] is equal to sumBob - currentValue of bob and alice value[i]
	 * 4. return result 
	 * 
	 * */
	
	public static int[] fairCandySwapBruteForce(int[] aliceSizes, int[] bobSizes) {
        int sumBob = 0, sumAlice = 0;
        int[] result =  new int[]{-1, -1};
         for(int i = 0; i < bobSizes.length; i++ ){
            sumBob = sumBob + bobSizes[i];
          }
      
         for(int i = 0; i < aliceSizes.length; i++ ){
            sumAlice = sumAlice + aliceSizes[i];
           }
      
         for(int i = 0; i < aliceSizes.length; i++) {
        	 for(int j = 0; j < bobSizes.length; j++) {
        		 
        		 if((sumAlice - aliceSizes[i] + bobSizes[j]) == (sumBob - bobSizes[j] + aliceSizes[i]) ) {
        			 result[0] =  aliceSizes[i];
        			 result[0] =  bobSizes[j];
        			 break;
        		 }
        	 }
        	
         }
		return result;      
    }
	
	/* 1. To idenfy the sum of both alice sizes and bob sizes
	 * 2. Mean time add the bob array in to set.
	 * 3. Idendify the difference and divided by 2
	 * 4. Iterate through for loop for alice size and diff present in set means return alize size and alice size - diff
	 * 
	 * 
	 * */
	
	public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumBob = 0, sumAlice = 0;
        HashSet<Integer> bobSet = new HashSet<>();
        for(int i = 0; i < bobSizes.length; i++ ){
            sumBob = sumBob + bobSizes[i];
            bobSet.add(bobSizes[i]);
        }
         System.out.println(sumBob);
         for(int i = 0; i < aliceSizes.length; i++ ){
            sumAlice = sumAlice + aliceSizes[i];
           }
        int diff = (sumAlice - sumBob) / 2;
         System.out.println(sumAlice);
        System.out.println(diff);
        
        for(int i = 0; i < aliceSizes.length; i++ ){
            
            if(bobSet.contains(aliceSizes[i] - diff)){
                return new int[]{aliceSizes[i], aliceSizes[i] - diff };
            }
           }
        return new int[]{-1, -1};
        
    }
	
	public static void main(String[] args) {
		
			
			fairCandySwap(new int[] {1,1}, new int[] {2,2});
			fairCandySwap(new int[] {1,2}, new int[] {2,3}); // 1,2
			fairCandySwap(new int[] {2}, new int[] {1, 3}); //2,3
			fairCandySwap(new int[] {2,4,3,5}, new int[] {1,2,3,4}); // 4,2
		}
}
