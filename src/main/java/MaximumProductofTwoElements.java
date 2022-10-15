
public class MaximumProductofTwoElements {

	
	/*
	 * Given the array of integers nums, you will choose two 
	 * different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
 
	Example 1:
	Input: nums = [3,4,5,2]
	Output: 12 
	Explanation: If you choose the indices i=1 and j=2 (indexed from 0), 
	you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 
	
	1) Did I understand the problem? yes or No !!  --> YES
		-> If No, Ask the person to provide more detail with example(s)
		-> If Yes, go to the next step !!
	what is the input(s)? -> Int array
	what is the expected output? -> Max Value - single Integer
	Do I have constraints to solve problem? yes  
	2 <= nums.length <= 500
	1 <= nums[i] <= 10^3
	Do I have all informations to go to the next step!!
	How big is your test data set will be?

2) Test Data set
	Positive -> [9,5,4,8,7] ->(9 - 1) * (8 - 1) ==> 56
	Edge   -> [8,8] -> 7 * 7 => 49
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
	crate maxVal is equal to Math.minval, 
	1. Iterate the through for loop (Outer) starts from 0
	2. Inner for loop start i + 1
	3. create  one local varable mul and equivalent answer
	4. Using math function to idwnfy the max val
	5. return the max Val

8) Implement them in the code (editor)

9)Test against the different data set

10) If it fails, debug them to solve it !!eclipse.buildId=4.12.0.I20190605-1800
java.version=1.8.0_281
java.vendor=Oracle Corporation
BootLoader constants: OS=win32, ARCH=x86_64, WS=win32, NL=en_US
Framework arguments:  -product org.eclipse.epp.package.java.product
Command-line arguments:  -os win32 -ws win32 -arch x86_64 -product org.eclipse.epp.package.java.product



	*/
	
	public static int MaximumProductofTwoElements(int[] arr){
		int mul = 0, maxVal = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i + 1; j < arr.length - 1; j++) {
				
				mul = (arr[i] - 1) * (arr[j] - 1);
				
				maxVal = Math.max(maxVal, mul);
			}
			
		}
		
		return mul;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(MaximumProductofTwoElements(new int[] {1,2,10,9,8}));
		System.out.println(MaximumProductofTwoElements(new int[] {1, 1}));
		System.out.println(MaximumProductofTwoElements(new int[] {9,9,9,9,9,9,9,9}));
		
	}
	
}
