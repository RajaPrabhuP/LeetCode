import java.util.Arrays;

public class P002_FlippinganImage {
	
	/*
	 * 
	 * Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

For example, inverting [0,1,1] results in [1,0,0].
	 */
	
	 /*
	 * PROBLEM STATEMENT https:https://leetcode.com/problems/flipping-an-image/
		 * 1. Did I understand the problem? 
	 * 	yes
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
	 * 
	*/
	
	/*
	 * BRUTEFORCE:
	 * Iterate through for loop 
	 * condtion is i less the arr (internal numbers of arr)
	 * Each array store it in internalarr local var
	 * create another revarr 
	 * 
	 * using another for loop iterate revese the internal array
	 * inside internal loop conver if the value is 0 means 1 and i means 0;
	 * and store the revese array
	 * 
	 * revarr is storing to internal arr
	 * 
	 * 
	 * */
	
	public static void FlippinganImage_Learn(int[][] arr){
		
		System.out.println(arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			int[] intArr = arr[i];
			int[] revInt = new int[intArr.length];
			int k=0;
			for(int j = intArr.length - 1; j >= 0; j-- ) {
				revInt[k] =  intArr[j];
				if(revInt[k] == 0) {
					revInt[k] = 1;
				}else if(revInt[k] == 1) {
					revInt[k] = 0;
				}
				k++;
			}
			arr[i] = revInt;
			Arrays.toString(arr[i]);
			System.out.println(Arrays.toString(arr[i]));
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	/*
	 * Two Pointer:
	 * 
	 * Iterate using for loop and 
	 * and each interal arr store it one local variable
	 * declare start and end value. end value should be length of each internal array.
	 * 
	 * using while loop breaking cindirion is start is less the end
	 * if start value is 0 mean change into els if start value 1 means change into 0
	 * and swap both the values
	 * 
	 * and internaleach array reverse and change the value. and return
	 * 
	 * 
	 * */
	
	public static int[][] FlippinganImage_TwoPointer(int[][] arr){
		
		for(int i = 0; i < arr.length; i++) {
			
			int[] internalArr = arr[i];
			
			int start = 0, end = internalArr.length - 1,  temp;
			
			while(start < end) {
						
				temp = internalArr[start];
				internalArr[start] = internalArr[end];
				internalArr[end] = temp;
				start++;
				end--;
			}
			
			for(int k = 0; k <internalArr.length;k++ ) {
				if(internalArr[k] == 0) {
					internalArr[k] = 1;
				}else if(internalArr[k] == 1) {
					internalArr[k] = 0;
				}
			}
			
			arr[i] = internalArr;
		}
		
		return arr;
		
		
	}
	public static void main(String[] args) {
		
		FlippinganImage_Learn(new int[][] {{0,0}, {1,1}});
		
		FlippinganImage_Learn(new int[][] {{0,0,1,1}, {1,1,0,0}});
		

	}

}
