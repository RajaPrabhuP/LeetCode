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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numIdenticalPairsMap(new int[] {1,2,3});
	}

}
