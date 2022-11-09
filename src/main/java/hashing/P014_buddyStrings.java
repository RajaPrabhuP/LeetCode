package hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class P014_buddyStrings {
	
	//https://leetcode.com/problems/buddy-strings/
	
	public static boolean buddyStrings(String s, String goal) {
		
		if((s.length() != goal.length()) || s.length() == 1 )
			return false;
		if(s.length() == 2) {
			return swap(s, 0, s.length() -1).equals(goal);
		}else if(s.length() > 2) {
			return s.equals(goal);
		}
		
		int p1 = 0, p2 = 0;
		ArrayList<Character> sList = new ArrayList<Character>();
		ArrayList<Character> goalList = new ArrayList<Character>();
		
		int[] a = new int[10];
		int[] b = new int[10];
		
		while(p2 < goal.length()) {
			
			if(s.charAt(p1) != goal.charAt(p2)) {
				sList.add(s.charAt(p1));
				goalList.add(goal.charAt(p2));				
			}
			p1++;p2++;			
		}
		
		if((sList.size() != 2) || (goalList.size()) != 2 || !sList.containsAll(goalList) )
			return false;
			
		return true;
        
    }
	
	private static String swap(String s, int i, int j) {
		
		char[] charArray = s.toCharArray();
		
		char ch = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = ch;
		
		return String.valueOf(charArray);
	}
	
	public String[] uncommonFromSentences(String s1, String s2) {
        String[] s1Arr = s1.split(" ");
        String[] s2Arr = s2.split(" ");
        
        HashMap<String, Integer> s1Map = new HashMap<>();
        HashMap<String, Integer> s2Map = new HashMap<>();
        ArrayList<String> result = new ArrayList<>();
        
        for(String str : s1Arr){
            s1Map.put(str, s1Map.getOrDefault(str, 0) + 1);
        }
               
        for(String str : s2Arr){
            s2Map.put(str, s2Map.getOrDefault(str, 0) + 1);
        }
        
        for(Map.Entry<String, Integer> eachEntry : s1Map.entrySet()){
            if(eachEntry.getValue() == 1 && !s2Map.containsKey(eachEntry.getKey())){
                result.add(eachEntry.getKey());
            }
        }
        
        for(Entry<String, Integer> eachEntry : s2Map.entrySet()){
            if(eachEntry.getValue() == 1 && !s1Map.containsKey(eachEntry.getKey())){
                result.add(eachEntry.getKey());
            }
        }
        
        String[] resultArr = new String[result.size()];
        for(int i = 0; i < result.size(); i++){
            resultArr[i] = result.get(i);
        }
        
        return resultArr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(buddyStrings("ab", "ba"));
		System.out.println(buddyStrings("abcd", "bacd"));
		System.out.println(buddyStrings("abcd", "dcba"));
		System.out.println(buddyStrings("efgh", "efhg"));
		System.out.println(buddyStrings("abab", "abab"));
		
	}

}
