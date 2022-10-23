import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MergeSortedArray {

	/*
	 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and 
	 * two integers m and n, representing the number of elements in nums1 and nums2 respectively.
	Merge nums1 and nums2 into a single array sorted in non-decreasing order.
	The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
	To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements 
	that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
	
	 * /*
	 * PROBLEM STATEMENT https://leetcode.com/problems/merge-sorted-array/
		 * 1. Did I understand the problem? 
	 * 	yes or no 
	 * 	If no ask the person to provide
	 * 	with more details with examples 
	 * 	If yes go to the next step What is the
	 * 	input(s)? What is the expected output? 
	 * 
	 * 	Do I have any constraints to solve the
	 * 	problem?  - 
	 * 		-- Non-Decreasing order
	 * 		-- Should be added into nums1 in non-decreasing order
	 * 		-- 
	 * Do I have all the information to go to the next steps 
	 * 	How big is your test data set will be? 
	 * 
	 * 2. Test data set Minimum 3 data set including positive, negative and edge
	 * Validate with the interviewer if the data set is fine by his/ her assumptions
	 * 
	 * 
	 * 3. Do I know to solve it? 
	 * 	Yes- great is there an alternate ? 
	 * 	No - can I break the problem into sub problems?
	 * 
	 * 
	 * 4. Ask for hint (if you dont know how to solve
	 * this) 
	 * 
	 * 5. Do I know alternate solutions as well Yes- what are those? No- that
	 * is still fine, proceed to solve by what you know 
	 * 
	 * 6. If you know the alternate
	 * solution find out the O-notations (performance) 
	 * 
	 * 
	 * 7. Then, explain either both are the best (depends on
	 * the time) 
	 * 	Approach 1:- start with the worst-> improve (optimize) -> End up
	 * with the best 
	 * 	Approach 2: Write down the options and benefits and code the
	 * best 
	 * 
	 * 8. Start always with the Pseudo code 
	 * 
	 * 9. Test against different test data
	 * 
	 * 10. If it fails then debug to solve it
	 */
	/*
	 * +VE -> ARR 1 =  [1,2,3,0,0,0]] ARR2 = 2,5,6]    [1,2,2,3,5,6]
	 * -VE -> ARR 1 LENGTH IS LESS THAN ARRR2
	 * EDGE-> ARR1 [1,2,3,0,0,0] [1,2,3]  
	 * 
	 * BRUTEFORCE:
	 * 1. CHECK CONDITION ARR1 LENGTH MUST BE GREATER THEN ARR2 LENGTH
	 * 2. CREATE VARI K AMD STORE THE ARR1 LENGTH - arr2 length
	 * 3. ITERATE THROUGH FOR LOOP FOR ARR2
	 * 		ADDING THE VALUE IN ARR 1 LAST AND INCREMENT K VALUE
	 * 4.SORT THE ARRAY
	 * */
	
	//space - > O[1]
	//Time - > n log N 
	public static void MergeSortedArrayBruteForce(int[] nums1, int[] nums2) throws Exception {
		if(nums1.length < nums2.length )
			throw new ArithmeticException("nums1 length mus be greater then Arr2");  
			
		int len = nums1.length - nums2.length;
		
			for(int i = 0; i < nums2.length; i++) {
				nums1[len++] = nums2[i];
			}
		
		Arrays.sort(nums1);
		
		System.out.println(Arrays.toString(nums1));
		
		}
	
	/* Two Pointer
	 * Created 3 Pointers P1, P2, P3
	 * P1 is arr1.length - 1 P2 is arr2 length - 1 P3 is (arr1.length - arr2 length) - 1
	 * 
	 * Using while break condition is p1 and p2 greater then or equal to zero
	 * 	condition if arr1[p3] is equal to arr[p2]
	 * 		arr[p2] is assigned arr[p1--]
	 * 		arr[p3] is assigned arr[p1--]
	 * 		decrement p1,p2,p3
	 * else if condition is if arr1[p3] is less then arr[p2]
	 * 		arr[p2] is assigned arr[p1]
	 * 		decrement p1,p2
	 * else if condition is if arr1[p3] is greater then arr[p2]
	 * 		arr[p3] is assigned arr[p1]
	 * 		decrement p1,p3
	 * 
	 * */
	
	//space -> O[1]
	//Time -> O[N]
	public static void MergeSortedArrayTwoPointers(int[] nums1, int m, int[] nums2, int n) {
		
		int p1 = m - 1, p2 = n - 1, p3 = (m - n) - 1; 
		
		while(p1 >= 0 && p2 >= 0) {
			
			if(nums1[p3] == nums2[p2]) {
				nums1[p1--] = nums1[p3];
				nums1[p1--] = nums2[p2];
				p3--;
				p2--;
			}else if(nums1[p3] > nums2[p2]) {
				nums1[p1--] = nums1[p3];
				p3--;
			}else if(nums1[p3] < nums2[p2]) {
				nums1[p1--] = nums2[p2];
				p2--;
			}
		}
		
		System.out.println(Arrays.toString(nums1));
		
		}
	
	public static void MergeSortedArrayUsingArrayList(int[] nums1, int[] nums2) throws Exception {
		if(nums1.length < nums2.length )
			throw new ArithmeticException("nums1 length mus be greater then Arr2");  
			
		ArrayList<Integer> aList1 = new ArrayList<Integer>();
		ArrayList<Integer> aList2 = new ArrayList<Integer>();
		
		for(int i : nums1)
			aList1.add(i);
		for(int i : nums2)
			aList2.add(i);
		
		aList1.addAll(aList2);
		Collections.sort(aList1);
		}
	
	public static void main(String[] args) throws Exception {
		
		//MergeSortedArrayBruteForce(new int[] {1,2,3,4,5,-1, -1, -1, -1}, new int[] {5,6,7,8});
		//MergeSortedArrayBruteForce(new int[] {1,2}, new int[] {5,6,7,8});
		//MergeSortedArrayBruteForce(new int[] {1,2,3,0,0,0}, new int[] {1,2,3});
		MergeSortedArrayTwoPointers(new int[] {1,2,3,0,0,0}, 6, new int[] {2,5,6}, 3);
		MergeSortedArrayTwoPointers(new int[] {0,0,0}, 3, new int[] {0}, 1);
	}

}
