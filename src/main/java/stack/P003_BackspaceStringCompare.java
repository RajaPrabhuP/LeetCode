package stack;

import java.util.LinkedList;
import java.util.Stack;

public class P003_BackspaceStringCompare {

	//https://leetcode.com/problems/backspace-string-compare/
	
	/*Using stack 
	 * 1. Add each character in stack 
	 * 	if char is # pop
	 * 	else if char is not equal #
	 * 		push to stack
	 * 
	 * retur two stack is equals or not
	 * 
	 * */
	public static Stack oper(String s){
        
        Stack<Character> st = new Stack<>();
        
        for(int i = 0;i < s.length(); i++){
            if(!st.isEmpty() && s.charAt(i) == '#')
                st.pop();
           else if(s.charAt(i) != '#')
               st.push(s.charAt(i));
        }
           
        return st;
    }
	
	/*Pseudo code for Linked List
	 * 
	 * Iterate throgh for each and 
	 * if the char is # and list size greate the zero means 
	 * 		remove the last method
	 * else if char is not equal to #
	 * 		adding into linked list
	 **/ 
	 public LinkedList operLinked(String s){
	        
         LinkedList<Character> li = new LinkedList<>();
        
         for(char ch : s.toCharArray()){
             if(li.size() > 0 && ch == '#')
                 li.removeLast();
             else if(ch != '#')
                 li.add(ch);
         }
         
         return li;
    }
	 public boolean backspaceCompare(String s, String t) {
	        
         return oper(s).equals(oper(t));
       
     }
	 
	 public static void main(String[] args) {
		 
	 }
}
