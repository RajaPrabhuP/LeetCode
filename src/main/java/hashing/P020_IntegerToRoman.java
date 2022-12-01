package hashing;

public class P020_IntegerToRoman {

	/*https://leetcode.com/problems/integer-to-roman/*/
	public static String intToRoman(int num) {
		 int[] numCh = {1000, 900, 500, 400, 100, 90, 50,   40, 10, 9,   5, 4,   1};
		    String[] strCh  = {"M"  ,"CM", "D","CD", "C","XC","L","XL","X","IX","V","IV","I"};
		        int temp = num;
		        StringBuilder sbf = new StringBuilder();
		        for(int i = 0; i < numCh.length; i++){
		            while(temp >= numCh[i]){
		                sbf.append(strCh[i]);
		                temp -= numCh[i];
		            }
		        }
		        return sbf.toString();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
