package Assessment;

public class TwoPoint_SlidingWindow {

	/*https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/*/
	
	/*Brute Force:
	 * 
	 * Iterate the for loop and start from 1 and less then n
	 * Iterate throgh another loop with j = i + 1
	 * declare sum = 0
	 * if sum = i and i+1 is equal to n means return n;
	 * 
	 * +ve 
	 * 10, 0/p = 2, 8
	 * edge -> 2 [1, 1]
	 * -ve [0] - exception
	 * */
	//Leet COde -> fails 
	//Time -> O(N^2)
	public int[] getNoZeroIntegersBrute(int n) {
		int sum = 0;
		
		for(int i = 1; i < n; i++) {
			
			for(int j = i; j < n; j++) {
				
				sum = i + j;
				if(sum == n) {
					return new int[] {i, j};
				}
			}
			
		}
		
			
		return null;
        
    }
	
	
	/*Two Pointer
	 * 
	 * start and end pointer, start from 1 and end from n - 1
	 * iterate through while loop start is less then end
	 * if both start and end modulous not equal to zero means  sum
	 * if sum == n return array start and end 
	 * incremenbt start and decrement end
	 *  
	 * */
	
	public static boolean isContainZero(int num) {
		int temp;
		while(num > 0) {
		temp = num % 10;
		 if(temp == 0)
			 return false;
		num = num / 10;
		}
		return true;
	}
	
	public static int[] TwoPointer(int n) {
			if(n == 2)
				return new int[] {1, 1};
			int start = 1, end = n - 1;
			int sum = 0;
			while(start < end) {
				if(isContainZero(start) && isContainZero(end)) {
					sum = start + end;
					if(sum == n) {
						return new int[] {start, end};
					}else {
						start++;
						end--;
					}
				}else if(!isContainZero(start)) {
					start++;
				}else if(!isContainZero(end)) {
					end--;
				}
							
			}
		
			
		return null;
        
    }
	
	public static void main(String[] args) {
		System.out.println(TwoPointer(11));
	}

}
