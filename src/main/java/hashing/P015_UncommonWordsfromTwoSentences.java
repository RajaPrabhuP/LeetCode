package hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class P015_UncommonWordsfromTwoSentences {

	//https://leetcode.com/problems/uncommon-words-from-two-sentences/
	
	public String[] uncommonFromSentences(String s1, String s2) {
        String[] s1Arr = s1.split(" ");
        String[] s2Arr = s2.split(" ");
        
        ArrayList<String> s1List = new ArrayList<String>();
        ArrayList<String> s2List = new ArrayList<String>();
        ArrayList<String> result = new ArrayList<String>();
        
        
        for(String str : s1Arr){
            s1List.add(str);
        }
        
        
        for(String str : s2Arr){
            s2List.add(str);
        }
        
        for(int i = 0; i < s1List.size(); i++){
           if(!s2List.contains(s1List.get(i))){
               result.add(s1List.get(i));
           }
        }
        for(int i = 0; i < s2List.size(); i++){
           if(!s1List.contains(s2List.get(i))){
               result.add(s2List.get(i));
           }
        }
        
        return (String[])result.toArray();
    }

	/*
	 * 1. split the sentence and store it 2 array
	 * 2. Create 2 map and store it each word and occurence in two maps respectively.
	 * 3. Take s1Map and if value is 1 and the particular key is not present in the s2Map add result list
	 * 4. Take s2Map and if value is 1 and the particular key is not present in the s1Map add result list
	 * 5. result list add into array and return the array
	 * 
	 * */
	
	
	public static String[] uncommonFromSentencesMap(String s1, String s2) {
		 	String[] s1Arr = s1.split(" ");
	        String[] s2Arr = s2.split(" ");
	        
	        HashMap<String, Integer> s1Map = new HashMap<>();
	        HashMap<String, Integer> s2Map = new HashMap<>();
	        ArrayList<String> result = new ArrayList<>();
	        
	        for(String str : s1Arr)
	            s1Map.put(str, s1Map.getOrDefault(str, 0) + 1);
	        
	               
	        for(String str : s2Arr)
	            s2Map.put(str, s2Map.getOrDefault(str, 0) + 1);
	        
	        
	        for(Map.Entry<String, Integer> eachEntry : s1Map.entrySet()){
	            if(eachEntry.getValue() == 1 && !s2Map.containsKey(eachEntry.getKey()))
	                result.add(eachEntry.getKey());
	            }
	        
	        for(Map.Entry<String, Integer> eachEntry : s2Map.entrySet()){
	            if(eachEntry.getValue() == 1 && !s1Map.containsKey(eachEntry.getKey()))
	                result.add(eachEntry.getKey());	           
	        }
	        
	        String[] resultArr = new String[result.size()];
	        for(int i = 0; i < result.size(); i++){
	            resultArr[i] = result.get(i);
	        }
	        
	        return resultArr;
	        
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uncommonFromSentencesMap("this apple is sweet", "this apple is sour");

	}

}
