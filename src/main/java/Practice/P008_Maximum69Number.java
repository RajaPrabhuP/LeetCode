package Practice;

public class P008_Maximum69Number {

	
	/*
	 * Intialize max value is num
	 * Using for loop and iterate the char array.
	 * if arrElm 6 then 9 else 6
	 * Current Array Converted into Integer and identify max
	 *  
	 * */
	//https://leetcode.com/problems/maximum-69-number/solution/
	 public int maximum69Number (int num) {
	        // O[N]
	        // O[N]
	        
	        String str = String.valueOf(num);
			char[] strArr = str.toCharArray();
			int max =  num;
			
			for(int i = 0; i < str.length(); i++){
				if(strArr[i] == '6')
					strArr[i] = '9';
				else
					strArr[i] = '6';
				
				max = Math.max(max, Integer.parseInt(String.valueOf(strArr)));
				strArr = str.toCharArray();
			}
			
			return max;
	        
	        
	    }
	
	 /*
	  * Int value convert into String and replace first Occ of 6 convert into 9.
	  * 6999 -> 9999
	  * 6666 -> 9666
	  * 9999 -> 9999
	  * 
	  * */
	 public int maximum69NumberFirst (int num) {
	        
		  int max = num;
			
		  String numStr = String.valueOf(num);
		  numStr = numStr.replaceFirst("6", "9");
		  max = Math.max(max, Integer.parseInt(numStr));
			return max;
	        
	    }
	 
	
	  public int maximum69NumberNumeric (int num) {
	       
	        int numCopy = num;
			int sixIdx = -1;
			int currIdx = -1;
			
			while(num > 0){
				
				int lastDigit = num % 10;
				 currIdx++;
				if(lastDigit == 6)
					sixIdx = currIdx;
				num = num / 10;
	           
				
			}
			
			return sixIdx == -1 ? numCopy : numCopy + 3 * (int) Math.pow( 10, sixIdx );
			
	        
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
