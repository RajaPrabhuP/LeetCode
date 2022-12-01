package stack;

import java.util.LinkedList;
import java.util.Stack;

public class P006_CrawlerLogFolder {
public int minOperations(String[] logs) {
        
        /*Create stack and adding to each string
         if stack is empty and and string is d2 means na push
         else if string is ../ and Stack is empty 
                pop the value
        */
         Stack<String> folderStack = new Stack<>();
        
        for(int i = 0; i < logs.length; i++){
            
            if(!folderStack.isEmpty() && logs[i].equals("../"))
               folderStack.pop();
            else if(!logs[i].equals("./") && !logs[i].equals("../"))
                folderStack.push(logs[i]); 
            
        }
        return folderStack.size() ;
        
        /*
        Linked list:
        1.Iterate through loop
        if list size greater then zero and equals to ../ remove one elm
        else if not contains ./ and ../ means add to the list
        */
        LinkedList<String> al =new LinkedList<String>();  
         
        for(int i = 0; i < logs.length; i++){
            
            if(al.size() > 0 && logs[i].equals("../") )
                al.removeLast();
             else if(!logs[i].equals("./") && !logs[i].equals("../"))
                  al.add(logs[i]);
        }
        return al.size();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
