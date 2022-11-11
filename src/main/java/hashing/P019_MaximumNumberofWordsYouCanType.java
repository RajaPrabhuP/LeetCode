package hashing;

import java.util.HashSet;

public class P019_MaximumNumberofWordsYouCanType {
	
	//https://leetcode.com/problems/maximum-number-of-words-you-can-type/
	/*
	 * 1. Split the text using space delim
	 * 2. If brokencharacter length is zero means send string arr length
	 * 3. Now add the all broken character into hashset
	 * 4. Iterate the string array and inner for loop to iterate throgh each character
	 * 5. If character is contains broken set break and move next word
	 * 6. If word length - 1 is equal to index of word means increase counter and return   
	 *
	 * 
	 * */
	
	public int canBeTypedWords(String text, String brokenLetters) {
	        String[] textArr = text.split(" ");
	        if(brokenLetters.length() == 0)
	            return textArr.length;
	        
	        HashSet<Character> brokenSet = new HashSet<>();
	        for(char ch : brokenLetters.toCharArray()){
	            brokenSet.add(ch);
	        }
	        
	        int counter = 0;
	        
	        for(int i = 0; i < textArr.length; i++ ){
	            
	            String word = textArr[i];
	            
	            for(int j = 0; j < word.length(); j++){
	               if(brokenSet.contains(word.charAt(j)))
	                   break;
	                if(j == word.length() - 1)
	                    counter++;
	            }           
	        }
	        
	        return counter;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
