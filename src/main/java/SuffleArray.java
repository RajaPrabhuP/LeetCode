import java.util.Arrays;

public class SuffleArray {

	/*
	 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
		Return the array in the form [x1,y1,x2,y2,...,xn,yn].
		
		*1) Did I understand the problem? yes or No !!  --> YES
				-> If Yes, go to the next step !!
	what is the input(s)? -> int arr with 2n of size
	what is the expected output? -> result arr with same size of source
	Do I have constraints to solve problem? yes  
	1 <= n <= 500
nums.length == 2n
1 <= nums[i] <= 10^3
	Do I have all informations to go to the next step!! yes
	How big is your test data set will be?

2) Test Data set
	Positive -> [1,2,3,4,5,6] -> 1,4,2,5,3,6
	Edge   -> [1,4] -> 1, 4
	-ve   ->

3) Do I know how to solve it?
	Yes -  great, is there an alternate?
	No - can I break down the problem into sub problems?

4) Ask for hint (if you do not know how to solve)

5) Do I know alternate solutions as well?
	Yes - What are those?
	No - That is still fine, proceed to solve by what you know !!

6) If you know alternate solutions -> find out the the 0 Notations (Performance)

	Then, explain either both are the best (depends on the time)

	Approach 1: Start with worst -> improve (Optimize) -> End up with the best 
	Approach 2: Write down the options and benefits and code the best

7) Start always with Pseudo code
	1. create result arr with same size of source;
	2. if arr length equal to 2 return the same source array
	3. Idenfify mid val;
	4. Iterate through for loop is less the mid val
	5. resut arr idx start from 0
	6

8) Implement them in the code (editor)

9)Test against the different data set

10) If it fails, debug them to solve it !!eclipse
		*/
	
	public static void SuffleArray(int[] arr) {
		
		int[] res = new int[arr.length];
		
		int mid = arr.length / 2;
		int k = 0;
		
		for(int i = 0; i < mid; i++) {
			res[k++] = arr[i];
			res[k++] = arr[mid + i];
			System.out.println(Arrays.toString(res));
		}
		
	}
	public static void main(String[] args) {
		
				 SuffleArray(new int[] {1,2,3,4,5,6});
				 SuffleArray(new int[] {1,2});

	}

}
