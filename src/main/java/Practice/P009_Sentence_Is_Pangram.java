package Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class P009_Sentence_Is_Pangram {
	 public boolean checkIfPangram(String sentence) {
	        
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
	 
	 public static boolean checkIfPangramArray(String sentence) {
	        
	        int len = sentence.length();
	        char[] chArr = new char[26];
	        if(len < 26)
	        {}
	        
	        Arrays.fill(chArr, 'F');
	        System.out.println(Arrays.toString(chArr));
			
	        for(int i = 0; i < sentence.length(); i++) {
	        	
	        	if(chArr[sentence.charAt(i) - 'a'] == 'F') {
	        		chArr[sentence.charAt(i) - 'a'] = 'T';
	        	}
	        }
	        
	      return new HashSet<>( Arrays.asList(chArr)).size() == 1;
	        
	       
	        
	       
	        
	    }
	public static void main(String[] args) {
		checkIfPangramArray("abcdfe");

	}

}
