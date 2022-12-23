package stack;

import java.util.Arrays;
import java.util.Stack;

public class P007_DailyTemperatures {
	
	 public static int[] dailyTemperatures(int[] temperatures) {
	        
	        Stack<Integer> stack = new Stack<>();
	        int[] outPut = new int[temperatures.length];

	            for(int i = temperatures.length - 1; i >= 0; i--){

	                if(stack.isEmpty()){
	                    stack.push(i);
	                    outPut[i] = 0;
	                    //System.out.println(Arrays.toString(outPut));
	                }else if(!stack.isEmpty() && temperatures[i] < temperatures[stack.peek()] ){
	                     outPut[i] =  stack.peek() - i;
	                     stack.push(i);
	                    //System.out.println(Arrays.toString(outPut));
	                }else if(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
	                     while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()])
	                            stack.pop();
	                     
	                                          
	                   	if(!stack.isEmpty()) {
	                        outPut[i] =  stack.peek() -  i;
	                        
	                       }else { 
	                        outPut[i] = 0;
	                        
	                       }
	                   	stack.push(i);
	                    
	                    
	                    
	            }
	    }
	            System.out.println(Arrays.toString(outPut));
	            return outPut;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dailyTemperatures(new int[] {73,74,75,71,69,72,76,73});
		dailyTemperatures(new int[] {40, 60, 90});
		dailyTemperatures(new int[] {89,62,70,58,47,47,46,76,100,70});
		//                           [8,1,  5, 4, 3, 2,1, 1,  0,  0]
		
	}

}
