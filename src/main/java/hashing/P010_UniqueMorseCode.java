package hashing;

import java.util.HashMap;
import java.util.HashSet;

public class P010_UniqueMorseCode {
	//https://leetcode.com/problems/unique-morse-code-words/description/
	
	public static int uniqueMorseRepresentationsUsingArray(String[] words) {
	
	HashSet<String> hset = new HashSet<String>();
	String[] morseCode = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
	String morseWord = "";
	for (String eachWord : words) {
		morseWord = "";
		for(char eachCh : eachWord.toCharArray()) {
			morseWord += morseCode[eachCh - 'a'];
		}
		hset.add(morseWord);
		//System.out.println(morseWord);
	}
	
	return hset.size();
        
    }
	
	
	public static int uniqueMorseRepresentationsUsingMap(String[] words) {
		
		HashSet<String> hset = new HashSet<String>();
		HashMap<Character, String> morseMap = new HashMap<Character, String>();
		morseMap.put('a',".-");
		morseMap.put('b',"-...");
		morseMap.put('c',"-.-.");
		morseMap.put('d',"-..");
		morseMap.put('e', ".");
		morseMap.put('f', "..-.");
		morseMap.put('g', "--.");
		morseMap.put('h',"....");
		morseMap.put('i',"..");
		morseMap.put('j',".---");
		morseMap.put('k',"-.-");
		morseMap.put('l',".-..");
		morseMap.put('m',"--");
		morseMap.put('n',"-.");
		morseMap.put('o',"---");
		morseMap.put('p',".--.");
		morseMap.put('q',"--.-");
		morseMap.put('r',".-.");
		morseMap.put('s',"...");
		morseMap.put('t',"-");
		morseMap.put('u',"..-");
		morseMap.put('v',"...-");
		morseMap.put('w',".--");
		morseMap.put('x',"-..-");
		morseMap.put('y',"-.--");
		morseMap.put('z',"--..");
		
		String morseWord = "";
		for (String eachWord : words) {
			morseWord = "";
			for(char eachCh : eachWord.toCharArray()) {
				morseWord += morseMap.get(eachCh);
			}
			hset.add(morseWord);
			
		}
		//System.out.println(hset.size());
		return hset.size();
	        
	    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//uniqueMorseRepresentationsUsingArray(new String[] {"gin","zen","gig","msg"});
		uniqueMorseRepresentationsUsingMap(new String[] {"gin","zen","gig","msg"});
	}

}
