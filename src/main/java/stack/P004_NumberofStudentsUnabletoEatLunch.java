package stack;

import java.util.ArrayDeque;
import java.util.Stack;

public class P004_NumberofStudentsUnabletoEatLunch {

	
		
		
		public static int countStudents(int[] students, int[] sandwiches) {
		    
		    // 1,1,1,0,0,1  ==> 1 1 0 0 1
		    // 1,0,0,0,1,1   
		    /* Student add ing into quue 
		        Atudent are available in array
		        if student top is equal to array elm
		        int result counter = 0; 
		    */
			
			   ArrayDeque<Integer> stuQu= new ArrayDeque<>();
		       Stack<Integer> sandwitchStack = new Stack<>();
		       
		       for(int i = 0; i < students.length; i++ ){
		            stuQu.add(students[i]);
		       }
		        
		        for(int j = sandwiches.length - 1; j >= 0; j--) {
		        	sandwitchStack.push(sandwiches[j]);
		        }
		        
		        int temp = 0, counter = 0;
		        
		        while(temp < stuQu.size()) {
		        	
		        	if(stuQu.peek() == sandwitchStack.peek()) {
		        		counter++;
		        		stuQu.poll();
		        		sandwitchStack.pop();
		        		temp = 0;
		        	}else {
		        		stuQu.add(stuQu.poll());
		        		temp++;
		        	}
		        		
		        }
		        return stuQu.size();
	}
			
		public static void main(String[] args) {
			
			countStudents(new int[] {1,1,0,0}, new int[] {0,1,0,1});
			
}
}
