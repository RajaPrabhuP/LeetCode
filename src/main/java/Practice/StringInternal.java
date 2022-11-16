package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class StringInternal {

	public static String[] printConve(ArrayList<String> al) {
		return (String[]) al.subList(0, al.size()).toArray();
		
		
		
	}
	
	public static void main(String[] args) {
		char[] chArr = new char[10];
//		String str = new String("ABCDEF");
//		int codePointAt = str.codePointBefore(1);
//		str.getChars(0, 2, chArr, 0);
//		System.out.println(str);
//		System.out.println(codePointAt);
//		System.out.println(str.hashCode());
//		
//		str.getChars(0, 3 , chArr, 5);
//		System.out.println(Arrays.toString(chArr));
//		ArrayList<String> al = new ArrayList<>(); 
//		al.add("A");
//		al.add("B");
//		al.add("C");
//		System.out.println(Arrays.toString(al.toArray()));
//		System.out.println(Arrays.toString(al.subList(0, al.size()).toArray()));
//		String[] array = al.toArray(new String[0]);
//		
		HashMap<Character, HashSet<Character>> rodCol = new HashMap<>();
		
		String col = "B0R0G0B1G1R1";
		
		for(int i = 0; i < col.length(); i=i+2) {
			
			HashSet<Character> hset = rodCol.getOrDefault(col.charAt(i + 1), new HashSet<>());
			hset.add(col.charAt(i));
			rodCol.put(col.charAt(i + 1), hset);
			
		}
		System.out.println(rodCol);
		
		HashMap<Character,Integer> rodColHash = new HashMap<>();
		
		
		String col1 = "B0R0G0B1G1R1";
		for(int i = 0; i < col1.length(); i++) {
			
			rodColHash.put(col1.charAt(i), rodColHash.getOrDefault(col1.charAt(i), 0) + 1);
			
		}
		
		
		
	}

}
