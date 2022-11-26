package SelfAssesement;

public class P003_IdentifySuminRange {
	
	/* 1. Identify the sum of the number is equal to targer
	 * 
	 * 
	 * */
	
	public static int identifySumRange(int target) {
		int sum = 0;
		for(int i = 0; i < Integer.MAX_VALUE; i++) {
			int num = i;
			sum = 0;
			while(num > 0) {
				sum = sum + (num % 10);
				num = num / 10;
			}
			if(sum == target)
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(identifySumRange(12));
	}

}
