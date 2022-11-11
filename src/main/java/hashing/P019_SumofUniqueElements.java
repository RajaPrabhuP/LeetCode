package hashing;

import java.util.HashMap;
import java.util.Map;

public class P019_SumofUniqueElements {

	
	/*
	 * https://leetcode.com/problems/sum-of-unique-elements/
	 * 1. Using Map and identify all the occurence of each character.
	 * 2. Initialize sum = 0
	 * 3. Using entryset and identify one occurence character and sum
	 * 4. return sum 
	 * 
	 * */
	
	  public static int sumOfUnique(int[] nums) {
	      
	        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
	        
	        for(int num : nums){
	            hmap.put(num, hmap.getOrDefault(num, 0) + 1);
	        }
	        int sum = 0;
	        for(Map.Entry<Integer, Integer> eachEntry : hmap.entrySet()){
	           if(eachEntry.getValue() == 1) 
	               sum += eachEntry.getKey();
	        }
	        System.out.println(sum);
	        return sum;
	    }
	  
	  
	public static void main(String[] args) {
	
				
			sumOfUnique(new int[] {1,2,3,4,5});//15
			sumOfUnique(new int[] {1,2,3,2,2,2});//4
			sumOfUnique(new int[] {1,1,1,1,1});//0
		
		
	}

}
