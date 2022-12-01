package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class P013_ThreeSum {
	//https://leetcode.com/problems/3sum/
	
	
public static List<List<Integer>> threeSum(int[] nums) {
        /*Using theree for loop 
         * if all integer sum is zeor means adding into arraylist and arraylist adding set set.
         * Before adding into set list should be sorted.
         *  */
        HashSet<ArrayList<Integer>> hset = new HashSet<>();
      
        for(int i = 0; i < nums.length - 2; i++){
            
            for(int j = i + 1; j < nums.length - 1; j++){
                
                for(int k = j + 1; k < nums.length; k++){
                    
                	if(nums[i] + nums[j] + nums[k] == 0){
                    	ArrayList<Integer> al = new ArrayList<>();
                    	al.add(nums[i]);
                        al.add(nums[j]);
                        al.add(nums[k]);
                        System.out.println(al);// [-1, 0,1] 
                        Collections.sort(al);
                        hset.add(al);
                        System.out.println(hset);
                    }
                   
                }
            }
                 
        }
        List<List<Integer>> result = new ArrayList<>(hset);
        return result;
        
    }

public static List<List<Integer>> threeSumUsingArray(int[] nums) {
    
    HashSet<List<Integer>> hset = new HashSet<>();
    int[] n = new int[3];
    for(int i = 0; i < nums.length - 2; i++){
        for(int j = i + 1; j < nums.length - 1; j++){
           for(int k = j + 1; k < nums.length; k++){
               	if(nums[i] + nums[j] + nums[k] == 0){
            		n[0] = nums[i];
            		n[1] = nums[j];
            		n[2] = nums[k];
            		Arrays.sort(n);
            		System.out.println(Arrays.toString(n));
                	ArrayList<Integer> al = new ArrayList<>();
                	for(int l = 0; i < n.length; i++)
                		al.add(n[l]);
                	hset.add(al);
                    System.out.println(hset);
                }
               
            }
        }
             
    }
    List<List<Integer>> result = new ArrayList<>(hset);
    return result;
    
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threeSum(new int[] {-1,0,1,2,-1,-4});
//		threeSum(new int[] {0,0,0});
//		threeSum(new int[] {1,1,1});
//		
//		threeSumUsingArray(new int[] {-1,0,1,2,-1,-4});
		//threeSumUsingArray(new int[] {0,0,0});
		//threeSumUsingArray(new int[] {1,1,1});
		
	}

}
