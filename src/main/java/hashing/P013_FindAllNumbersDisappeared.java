package hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class P013_FindAllNumbersDisappeared {
	
	//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
	 public static List<Integer> findDisappearedNumbers(int[] nums) {
		
		 	HashSet<Integer> hset = new HashSet<Integer>();
	        List<Integer> list = new ArrayList<Integer>();
	        for(int i = 0; i < nums.length; i++)
	            hset.add(nums[i]);
	        
	        for(int j = 1; j <= nums.length; j++){
	            if(!hset.contains(j)){
	                list.add(j);
	            }
	        }
		  System.out.println(list);
		 return list;
		 
	 }
	public static void main(String[] args) {
		
		findDisappearedNumbers(new int[] {1,2,3,4,5,6,7,8});
	}

}
