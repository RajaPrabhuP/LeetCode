package SelfAssesement;

public class P004_CircularPrinter {
	
	/*https://leetcode.com/discuss/interview-question/1263982/thomson-reuters-oa-circular-printer
	 * pseudo code:
1. Have a total value to find the no. of time needed to print the string
2. Declare a temp variable (character as 'A') -> since starting pointer is A
3. Iterate through the string, calculate the time it can take using formula (Math.abs(current char - temp variable) -> for first char it would be 1 since A->B is 1
4. Add it to total => Total => total + Math.min(value calculated in step 3, 26 - value caluclated in step 3) => since it can move in both sides, need to calculate shortest path
5. Assign current char as temp variable
6. Return total*/
	public static int circularPrinter(String s) {
		int sum = 0;
		int temp = 'A';
		
		for(int i = 0; i < s.length(); i++) {
			int dis = Math.abs(s.charAt(i) - temp);
			sum = sum + Math.min(dis, 26 - dis);
			temp = s.charAt(i);
		}		
		System.out.println(sum);
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		circularPrinter("");

	}

}
