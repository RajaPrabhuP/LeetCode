package hashing;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class P003_NoOfGoodPairs {

	//https://leetcode.com/problems/number-of-good-pairs/description/
	
	public static int fact(int nums) {
		int sum = 0;
		for(int i = nums; i >= 0; i--) {
			sum += i;
		}
		return sum;
		
	}
	
	/*
	 * Using HashMap and identify the number of occurence of each elm in array
	 * And get the values from hmap 
	 * and add the sum with each number of fact(+) for each number and sum.
	 * 
	 * */
	
	 public static int numIdenticalPairsMap(int[] nums) {
		
		 HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		 
		 for (int i : nums) {
			hmap.put(i, hmap.getOrDefault(i, 0) + 1);
		}
		 
		 int sum = 0;
		  for (int i : hmap.values()) {
			  int temp = i;
			  sum += fact(temp - 1);
		} 
		
		  System.out.println(sum);
		  return sum;
	        
	    }
	
	 /*Brute Force
	  * 
	  * Iterate through 2 for loops
	  * outer loop starts with zero and Inner for loop j = i+1
	  * and if arr[i] and arr[j] are equal means increment the counter.
	  * 
	  * */
	 public static int numIdenticalPairsBruteForce(int[] nums) {
			int counter = 0;
			 
			 for(int i = 0; i < nums.length; i++) {
				 
				 for(int j = i + 1; j < nums.length; j++) {
					 
					 if(nums[i] == nums[j])
						 counter++;				 
				 }
				 
			 }
			 System.out.println(counter);
			 return counter;	
		    }
	 /**/
	 public static int numIdenticalPairsUsingFormula(int[] nums) {
			
		 HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		 for (int i : nums) 
			hmap.put(i, hmap.getOrDefault(i, 0) + 1);
				 
		 int sum = 0;
		  for (int i : hmap.values()) 			 
			  sum=+ (i*(i - 1)/ 2);
			
		  System.out.println(sum);
		  return sum;
	        
	    }
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numIdenticalPairsMap(new int[] {1,2,3});
		numIdenticalPairsBruteForce(new int[] {1,1,1,1,1});
		numIdenticalPairsUsingFormula(new int[] {1,1,1,1,1});
	}

}
