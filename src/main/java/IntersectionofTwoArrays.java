import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays {
	
	
	public static void IntersectionofTwoArrays(int[] nums1, int[] nums2) {
		 /*
        Test Data:
        +ve [1,2,3,4] [1,2] --> [1, 2]
        Edge[1,2,3,4] [5,6,7,8] -> []
        -ve [1,2,3,4] [] -> Exception or empty array
         Brute Force Pseudo code:
         Identify the size of the resultant array use Math 
         identify min val for 2 arrays
         
         Iterate the Outer for loop for first array
         Iterater another for loop for second array 
         identify both elm is same add into result
         */
        if(nums1.length > 0 && nums2.length > 0 )
        	throw new ArithmeticException("Array length greater than zero");    

        int len = Math.max(nums1.length, nums2.length);
        int[] result = new int[len];
        
        Set<Integer> resultSet = new HashSet<Integer>();
        
        int k = 0;
        
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                
                if(nums1[i] == nums2[j]){
                    result[k++] = nums1[i];
                    resultSet.add(nums1[i]);
                }
            }
        }
        
        System.arraycopy(resultSet.toArray(), 0, result, 0, 1);
//        Object[] array = resultSet.toArray();
//        int[] copyOf = Arrays.copyOf(result, k);
        System.out.println(Arrays.toString(result));
//        System.out.println(Arrays.toString(copyOf));
//        System.out.println(Arrays.toString(array));
	}
	
	
	public static void IntersectionofTwoArraysTwo(int[] nums1, int[] nums2) {
		 /*
       Test Data:
       +ve [1,2,3,4] [1,2] --> [1, 2]
       Edge[1,2,3,4] [5,6,7,8] -> []
       -ve [1,2,3,4] [] -> Exception or empty array
        Two Pointer:
        Sort the Two array using Arrays.sort method
        initialize start and end starting from zero
        using while loop the breaking condition is right less num2 size and left less than nums1 length
        create set 
        
        if start and right idx arr value is equal, num1 start adding into set and increment right,left
        if right less then left, right++
        if left less then right left++
        */
       if(nums1.length <= 0 && nums2.length <= 0 )
       	throw new ArithmeticException("Array length greater than zero");  
       
       int left = 0, right = 0;
       Set<Integer> hset = new HashSet<Integer>();
       
       Arrays.sort(nums1);
       Arrays.sort(nums2);
       
       while(left < nums1.length && right < nums2.length) {
    	   
    	   if(nums1[left] < nums2[right]) {
    		   left++;
    		   continue;
    	   }
    	   if(nums2[right] < nums1[left]) {
    		   right++;
    		   continue;
    	   }
    	   if(nums1[left] == nums2[right]) {
    		   hset.add(nums1[left]);
    		   left++;
    		   right++;
    		  
    		  }
    	  
    	   
    	   
       }

       System.out.println(hset);
	}
	
	
	public static void IntersectionofTwoArraysTwoPointers(int[] nums1, int[] nums2) {
		
		
		
	}
        
	public static void main(String[] args) {
		
		//IntersectionofTwoArrays(new int[] {1,2,3,4}, new int[] {4});
		IntersectionofTwoArraysTwo(new int[] {1,2,3,4}, new int[] {5,6,7,8});
		IntersectionofTwoArraysTwo(new int[] {1,2,3,4}, new int[] {});

		IntersectionofTwoArraysTwo(new int[] {1,2,3,4}, new int[] {2,4,4});


	}

}
