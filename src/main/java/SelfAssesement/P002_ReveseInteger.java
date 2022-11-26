package SelfAssesement;

public class P002_ReveseInteger {
	
	
	/*
	 * Using while loop breaking condition is num is greater then zero
	 * identify the last digit using mod and 
	 * the remainder to sum and sum multiply with 10
	 * num is divisible 10
	 * return sum 
	 * 
	 * Time= 10mins
	 * Time = O(N)
	 * Space = 0(1)
	 * 
	 * */
	public static int reverseInteger(int num) {
		//12345
		int sum = 0;
		
		while(num > 0) {
			sum = (sum * 10) + (num % 10);
			num = num / 10;
		}
		
		return sum;
		
	}
	
	/*Using String.value of method to convert integer to string 
	 * And convert the String into reverse using string Buider*/
	public static int reverseIntegerUsingString(int num) {
		//12345
		
		String valueOf = String.valueOf(num);
		return Integer.parseInt(new StringBuilder(valueOf).reverse().toString());
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseInteger(0001));
		System.out.println(reverseIntegerUsingString(00001));
	}

}
