package stack;


import java.util.Stack;

import org.junit.experimental.theories.suppliers.TestedOn;

public class P002_ValidParentheses {

	//https://leetcode.com/problems/valid-parentheses/
	
	/*
	 * 1. Iterate throgh for loop and each char
	 * 2. check if  close)}]  bracket and stack is not empty and  peek alse respective open
	 * 		pop
	 * 	else
	 * 		push the character
	 * 3. return stack isempty
	 *   
	 * 
	 * */
	 public static boolean isValid(String s) {
	        
         Stack<Character> st = new Stack();
        
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) == '}' && !st.isEmpty() && st.peek() == '{'){
				st.pop();
			}else if(s.charAt(i) == ']' && !st.isEmpty() && st.peek() == '['){
				st.pop();
			}else if(s.charAt(i) == ')' && !st.isEmpty() && st.peek() == '('){
				 st.pop();
			}else {
				st.push(s.charAt(i));
			}
			}
        return st.isEmpty();
    
    }
	 
	 public static boolean isValidOptimized(String s) {
	        
         Stack<Character> st = new Stack();
        
        for(int i = 0; i < s.length(); i++){
            
            if(!st.isEmpty() && ((s.charAt(i) == '}' && st.peek() == '{') ||
            					(s.charAt(i) == ']' && st.peek() == '[')  ||
            					(s.charAt(i) == ')' && st.peek() == '(' )))
						st.pop();
			else 
				st.push(s.charAt(i));
        }
            	return st.isEmpty();
    
    }
	 
	 public static void main(String[] args) {
		 System.out.println(isValidOptimized("}}}}"));
	 }

}
