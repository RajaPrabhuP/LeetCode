package Practice;

public class P011_ExcelSheetColumnNumber {
	/*
	 * 
	 * */
	
	 public static int titleToNumber(String columnTitle) {
	     char ch = 65;  
	     System.out.println(ch);
	     System.out.println(706 / 26);
	    System.out.println(706 % 26);
		 int[] arr = new int[26];
	        int pow = 0;
	        int n = columnTitle.length();
	        int ans = 0;
	        for(int i = n-1; i>=0; i--){
	            int num = (columnTitle.charAt(i) - 'A') + 1;
	            ans += (int)Math.pow(26,pow++)*num;
	        }
	        return ans;
	    }
	 
	 public static String convertToTitle(int n) {
	      String result = "";
	      	       
	       while(n > 0) {
	    	   System.out.println(n / 26);
		       System.out.println(n % 26);
	           n --;
	           result = (char)('A' + (n % 26)) + result;
	           n = n / 26;
	       }
	       System.out.println(result);
	       return result;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//titleToNumber("A");
		convertToTitle(701);
	}
}
