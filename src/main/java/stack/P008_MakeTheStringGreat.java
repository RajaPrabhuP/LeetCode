package stack;

import java.util.Stack;

public class P008_MakeTheStringGreat {
	/*https://leetcode.com/problems/make-the-string-great/description/*/
	public static String makeGood(String s) {
        if(s.length() == 1)
            return s;
       char[] ch = s.toCharArray();
       Stack<Character> chStack = new Stack<>();

        for(int i = 0; i < ch.length; i++){
              if(!chStack.isEmpty() && Character.isLowerCase(ch[i])) {
                    if(chStack.peek() == Character.toUpperCase(ch[i]))
                       chStack.pop(); 
                    else
                    	 chStack.push(ch[i]);
                    	
                }else if(!chStack.isEmpty() && Character.isUpperCase(ch[i])){
                     if(chStack.peek() == Character.toLowerCase(ch[i]))
                            chStack.pop();
                     else
                    	 chStack.push(ch[i]);
                     
              }else
                chStack.push(ch[i]);

                System.out.println(chStack);
                        }
                          
                          
            String res = "";
            while(!chStack.isEmpty()){
                res = chStack.pop() + res;
            }

    return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeGood("aAbBcCCCcc");
	}

}
