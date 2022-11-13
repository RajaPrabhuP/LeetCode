package hashing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class P004_DestinationCity {

	//https://leetcode.com/problems/destination-city/
	
	/*
	 * Using Map the Key as array First Elm(src)
	 * Value as second elemnet in the array 
	 * If get the value in Map and Iterate through map key
	 * If key does not have the value, that is a destination city
	 * */
	public static String destCity(List<List<String>> paths) {
		
		HashMap<String, String> srcMap = new HashMap<String, String>();
		for(int i = 0; i < paths.size(); i++) 
			srcMap.put(paths.get(i).get(0), paths.get(i).get(1));
	
		
		for (String list : srcMap.values()) {
			if(!srcMap.containsKey(list)) 
				return list;
		}		
		return null;			   
    }
	
	public static void InnerList(List<List<String>> paths) {
		
		System.out.println(paths.size());	
		
				for(int i = 0; i < paths.size(); i++) {
				paths.get(i).get(0);
				paths.get(i).get(1);
				}
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<String>> innerList = new ArrayList<List<String>>();
		List<String> city1 = new ArrayList<String>();
		city1.add("D");
		city1.add("B");
		List<String> city2 = new ArrayList<String>();
		city2.add("B");
		city2.add("C");
		List<String> city3 = new ArrayList<String>();
		city3.add("C");
		city3.add("A");
		
		innerList.add(city1);
		innerList.add(city2);
		innerList.add(city3);
		destCity(innerList);
	}

}
