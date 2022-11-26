package stack;

import java.util.Stack;

public class P005_MakeTheStringGreat {
	  public static String makeGood(String s) {
	       	 /*Add each char into stack.
	       	  * if condition of peek */       
	        Stack<Character> st = new Stack<>();
	        String result = "";
	        char[] sCh = s.toCharArray();
	        
	        for(int i = 0; i < sCh.length; i++){
	            
	            if(!st.isEmpty() && Math.abs(st.peek() - sCh[i]) == 32 )
	                st.pop();
	            else
	                st.push( sCh[i]);
	        }
	        //leetcode
	        
	        while(!st.isEmpty()){
	        	result = st.pop() + result;
	            System.out.println(result);
	        }
	        
//	        for(int i = 0; i < st.size(); i++){
//	            result = st.pop() + result;
//	            System.out.println(result); // code
//	            System.out.println(st.size());
//	            System.out.println(i+1);
//	        }
//	        
	        
	        return result;
	    }
	public static void main(String[] args) {
		
		System.out.println(makeGood("leEeetcode"));
	}

}
