package Practice;

import java.util.HashSet;

public class P010_SentenceIsPangram {

	
	 public static boolean checkIfPangram(String sentence) {
		       
	        /*length 26 less means false
	            Add each character in set.
	            If set size is not 26 return false
	            return true;
	            */
	       
	        int len = sentence.length();
	        if(len < 26)
	            return false;
	        
	        HashSet<Character> hset = new HashSet<>();
	        
	        for(int i = 0; i < len; i++ )
	            hset.add(sentence.charAt(i));
	        
	        if(hset.size() != 26)
	            return false;
	        return true;      
	    }
	 
	 /*Add Two Pointer left and Right
	  * Two Pointer not crosssing each other and Add into hset
	  * And hset is size is 26 is true else return false
	  * */
	 public static boolean checkIfPangramTwoPointer(String sentence) {
	       
		 if(sentence.length() < 26)
	            return false;
	        int left = 0, right = sentence.length() - 1;
	        HashSet<Character> hset = new HashSet<>();
	        while(left < right){
	             hset.add(sentence.charAt(left++));
	             hset.add(sentence.charAt(right--));
	         }
	        
	        return hset.size() == 26;
	    }
	
	public static void main(String[] args) {
	
	
	}

}
