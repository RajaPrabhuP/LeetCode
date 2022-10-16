import java.util.Arrays;

public class SortingWithoutUsing {
	
	/*
	 * 1) Did I understand the problem? yes or No !!  --> YES
		-> If No, Ask the person to provide more detail with example(s)
		-> If Yes, go to the next step !!
	what is the input(s)? -> Int array
	what is the expected output? -> Int arr
	Do I have constraints to solve problem? yes  
	
	Do I have all informations to go to the next step!!
	How big is your test data set will be?

2) Test Data set
	Positive -> [10,9,7,6,5,4,3,2,1] --> 1,2,3,4,5,6,7,8,9,10
	Edge   -> [1,1,1,1,1,1] --> [1,1,1,1,1,1]
	-ve   -> [] -> []

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
	
	1. Create i, j, temp var
	2. Initialize i = 0 and j = i + 1
	3. using while loop condition for break is both are less then size
	4. checking if i is less then j means and make J++
	5. else if i > j means swap both 

8) Implement them in the code (editor)

9)Test against the different data set

10) If it fails, debug them to solve it !!eclipse.buildId=4.12.0.I20190605-1800*/
	
	public static void sort(int[] arr) {
		
		int i = 0, j = i + 1, temp;
		
		while(i < arr.length && j < arr.length) {
			
			if(i < j) {
				j++;
			}else if(i > j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void sort1(int[] arr) {
		int temp;
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i + 1; j < arr.length ; j++) {
				
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		sort1(new int[] {10,9,8,7,6,5});

	}

}
