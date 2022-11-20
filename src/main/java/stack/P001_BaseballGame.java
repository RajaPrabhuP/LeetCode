package stack;

import java.util.Stack;

public class P001_BaseballGame {

	//https://leetcode.com/problems/baseball-game/
	
	  /* Pseudo code
    if integer then push into stack
    if char is D -> stack.peek * 2 -> push into stack
    if char is C -> pop the stack
    if char is + -> user temp at pop value and sum the peek and push the pop
    
    */
	
	public int calPoints(String[] operations) {
        /*
        if integer then push into stack
        if char is D -> stack.peek * 2 -> push into stack
        if char is C -> pop the stack
        if char is + -> user temp at pop value and sum the peek and push the pop
        
        */
        
        Stack<Integer> inStack = new Stack();
        
        for(int i = 0; i < operations.length; i++){
            
            if(operations[i].equals("D")){
                int temp = inStack.peek() * 2;
                inStack.push(temp);
            }else if(operations[i].equals("C")){
                  inStack.pop();
            }else if(operations[i].equals("+")){
               int temp =  inStack.pop();
               int sum = temp + inStack.peek();
                inStack.push(temp);
                inStack.push(sum);
            }else{
                 inStack.push(Integer.parseInt(operations[i]));
            } 
        }
        int sum = 0;
        while(!inStack.isEmpty()){
            sum += inStack.pop();
        }
        
        return sum;
        
    }
}
