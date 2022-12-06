package SelfAssesement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class FrequecySort {

	public static int[] frequSort(int[] arr) {
		
		TreeMap<Integer, Integer> tmap = new TreeMap<>();
		
		for(int i = 0; i < arr.length; i++)
			tmap.put(arr[i], tmap.getOrDefault(arr[i], 0) + 1);
		
		ArrayList<Integer> list = new ArrayList<>();
		for(Map.Entry<Integer, Integer> eachEntry : tmap.entrySet()) 
			list.add(eachEntry.getValue());
		Collections.sort(list);
		int idx = 0;
		for(int i = 0; i < list.size(); i++) {
			for(Map.Entry<Integer, Integer> eachEntry : tmap.entrySet()) {
				if(eachEntry.getValue() == list.get(i)) {
					for(int j = 0; j < eachEntry.getValue(); j++) {
						System.out.println(eachEntry.getKey());
						arr[idx++] = eachEntry.getKey(); 
					}
					tmap.put(eachEntry.getKey(), 0);
				}	
		}
		}
		
		System.out.println(arr);
		return arr;
		
		
		
	}
	
	
	public static void main(String[] args) {
		frequSort(new int[] {5,5,5,4,4,3,2,1});// 1 4 6 2 2 3 3 5 5
	}

}
