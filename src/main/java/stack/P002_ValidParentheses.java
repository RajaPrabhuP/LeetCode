package stack;


import java.util.HashMap;
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
	 /*Using HashMap
	  * 
	  * 1. Adding respective close bracket to open bracket.
	  * 2. Iterate through each char in string 
	  * And if map contains char as key means add relevant value into stack.
	  * else if map doesn't have the key means and peek the top value as char pop the char
	  * 3. return s is empty
	  * 
	  * 
	  * */
	 public static boolean isValidOptimizedHashMap(String s) {
	        
	        HashMap<Character, Character> hmap = new HashMap<>();
			Stack<Character> stack = new Stack<>();
			hmap.put('{', '}');
			hmap.put('[', ']');
			hmap.put('(', ')');
			
			
			for(int i = 0; i < s.length(); i++){
				
				if(hmap.containsKey(s.charAt(i)))
					stack.push(hmap.get(s.charAt(i)));
				else if(stack.isEmpty())
					stack.push(s.charAt(i));
				else if((s.charAt(i) == stack.peek()))
						stack.pop();
					
			}
			return stack.isEmpty();
	    
	    }
		  
	 public static void main(String[] args) {
		 System.out.println(isValidOptimizedHashMap("}}}}"));
	 }

}
