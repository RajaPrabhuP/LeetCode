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
/*		HashMap<Character, HashSet<Character>> rodCol = new HashMap<>();
		
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
		
		HashMap<Integer, Character> rajaMap = new HashMap<>();
		HashMap<Integer, Integer> devaMap = new HashMap<>();
		
		
		rajaMap.put(1, 'a');
		rajaMap.put(2, 'b');
		
		rajaMap.putIfAbsent(3, 'a');
		rajaMap.putIfAbsent(1, 'Z');
		
		rajaMap.compute(1,  (K, V) -> V = 'L' );
		rajaMap.compute(4,  (K, V) -> V = 'L' );
		rajaMap.computeIfPresent(5,  (K, V) -> V = 'N' );
		
		System.out.println(rajaMap);
		rajaMap.computeIfAbsent(4,  V -> 'Y' );
		devaMap.computeIfAbsent(4, V -> 1000);
		devaMap.computeIfPresent(4, (raja, rani) -> rani * 4);
		
		
				
		System.out.println(devaMap);
		
		//putIfAbsent =>>  hamp.putIfAbsent(k, V); ==> Particular key is not available in map, this will add K & V Pair
		//computeIfAbsent =>>  hamp.computeIfAbsent(k, V -> 12124); ==> Particular key is not available in map, this will add K & V Pair
		
				
		//computeIfPresent =>> hmap.computIfPresent(k, (K, V) -> V * 1000); If mentioned K is Prent, If u need update the value we can use this method
		//compute =>> hmap.computIfPresent(k, (K, V) -> V * 1000); If mentioned K is Prent, If u need update the value we can use this method
		
	*/
		
		String s = "a1";
		int i = Integer.parseInt("1");
		System.out.println(i+2);
		
		char[] chA = {'d', 'c', 'a', 'b'};
		
		Arrays.sort(chA);
		
		for(int l = 1; i < chA.length; i++) {
			int temp = l - 1;
			if(chA[l - 1] < chA[l])
				chA[l - 1] = chA[l];
		}
		
		System.out.println(chA);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
