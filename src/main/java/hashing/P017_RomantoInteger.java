package hashing;

import java.util.HashMap;
import java.util.Map;

public class P017_RomantoInteger {

	//https://leetcode.com/problems/roman-to-integer/
	/*
	 * Using HashMap to Key(Roman letter) and Value is (Number)
	 * I can be placed before V (5) and X (10) to make 4 and 9. 
		X can be placed before L (50) and C (100) to make 40 and 90. 
		C can be placed before D (500) and M (1000) to make 400 and 900.
	 * 
	 * */
	
	 public int romanToInt(String s) {
	        
	      //  int index=s.length()-1;
	        int sum=0;
	        Map<Character,Integer> map = new HashMap<>();
	        map.put('I',1);
	        map.put('V',5);
	        map.put('X',10);
	        map.put('L',50);
	        map.put('C',100);
	        map.put('D',500);
	        map.put('M',1000);
	        
	        for(int i = s.length() - 1; i >= 0; i--){
	         
	            if((s.charAt(i) == 'I' && i < s.length() - 1) && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')  ){
	                sum = sum - 1;
	                
	            }else if((s.charAt(i) == 'X' && i < s.length() - 1) && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C') ){
	                sum = sum - 10;
	            }else if((s.charAt(i) == 'C' && i < s.length() - 1) && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M') ){
	                 sum = sum - 100;
	            }else{
	                sum = sum + map.get(s.charAt(i));
	            }
	            
	        }
	        return sum;
	    }
	public static void main(String[] args) {
		

	}

}
