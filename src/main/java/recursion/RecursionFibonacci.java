package recursion;

import junit.framework.Assert;

public class RecursionFibonacci {
	
	public static void fibonacci(int n) {
		
		int fact = 1;
		
		for(int i = n; i > 0; i--) 
			fact = fact * i;		
		
		System.out.println(fact);
		
	}
	
public static int fibonacciRecur(int n) {
		
	if(n == 1)
		return 1;
	n = n * fibonacciRecur(n - 1);
	return n;
	}

public static int countoneVal() {
	int num = 111;

	int oneCount = 0;

	while(num > 0){
	int lastDigit = num % 10;
	if(lastDigit == 1) {
		oneCount++;
	}
	
	num = num / 10;
	}
	System.out.println(oneCount);
	return oneCount;
}
	
		public static String outPut = "";
		public static String reverseString(String str) {
			if(str.length() == 0)
				return "";
			outPut = outPut + str.charAt(str.length() - 1);
			reverseString(str.substring(0, str.length() - 1));
			return outPut;
			
		}
		
		public static String reverseWord(String str) {
			if(str.length() == 0)
				return "";
			outPut = outPut + str.charAt(str.length() - 1);
			reverseString(str.substring(0, str.length() - 1));
			return outPut;
			
		}

	
public static int count(int input) {

	
	if (input == 0) return 0;
	return (input % 10) + count(input / 10);
	
	
}

		public static void addDigit(String str) {
			
			int sum = 0;
			
			for(int i = 0; i < str.length(); i++) {
				if(Character.isDigit(str.charAt(i)));
				
			}
			}
		
		public static void learnAssertion() {
			//Assert.assertEquals("a", "A");
			Assert.assertTrue(1==1);
			
		} 

	public static void main(String[] args) {
		// 5 4 3 2 1
		//fibonacci(5);
		//System.out.println(fibonacciRecur(5));
		//countoneVal();
		//int countoneValRecu = countoneValRecu(1111);
		
		//System.out.println(countoneValRecu);
		
		//System.out.println(reverseString("abc"));
		learnAssertion();

	}

}
