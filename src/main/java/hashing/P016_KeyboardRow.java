package hashing;

import java.util.Arrays;
import java.util.HashSet;

public class P016_KeyboardRow {

	
	//https://leetcode.com/problems/keyboard-row/
	/*
	 * 1. Create 3 hashset and add each line character in each character set
	 * 2. Iterate the word using for loop and convert lowercase 
	 * 3. Iterate each character in inner for loop
	 * 	i) If character present in first row then row2 and row3 flag is false
	 *  ii) If character present in second row then row3 and row1
	 * 4. if idx from word char is same to word length means increment couter and return counter. 
	 *   flag is false
	 * */
	 public String[] findWords(String[] words) {
	        
	       HashSet<Character> row1Set = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r' ,'t', 'y', 'u', 'i', 'o', 'p'));
	        HashSet<Character> row2Set = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
	        HashSet<Character> row3Set = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));
	        String[] result = new String[words.length];
	        boolean row1 = true, row2 = true, row3 = true;
	        int idx = 0;
	        
	        for(int i = 0; i < words.length; i++){
	            char[] wordArr = words[i].toLowerCase().toCharArray();
	            for(int j = 0; j < wordArr.length; j++ ){
	                
	                char ch = wordArr[j];
	                
	                if(row1Set.contains(ch) && row1){
	                    row2 = false;
	                    row3 = false;
	                 }else if(row2Set.contains(ch) && row2){
	                    row1 = false;
	                    row3 = false;
	                }else if(row3Set.contains(ch) && row3){
	                    row1 = false;
	                    row2 = false;
	                }else{
	                    break;
	                }
	                
	                if(j == wordArr.length - 1){
	                    result[idx++] = words[i];
	                }              
	            }
	            row1 = true; row2 = true; row3 = true;
	            
	        }
	        return  Arrays.copyOfRange(result, 0, idx) ;
	    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
