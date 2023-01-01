package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LearnComparator {

	public static void main(String[] args) {
		int[][] arr = {{9,8}, {10, 6}, {12, 4}, {3,2}};
		
		Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
		System.out.println(Arrays.deepToString(arr));
		
		Arrays.sort(arr, (int[] a1, int[] a2) -> a1[0] - a2[0]);
		System.out.println(Arrays.deepToString(arr));
		
		String[][] strArr = {{"AA", "BB"}, {"FF", "EE"}, {"DD", "FF"}};
		Arrays.sort(strArr, Comparator.comparing(a -> a[0]));
		System.out.println(Arrays.deepToString(strArr));
		
		Arrays.sort(strArr, Comparator.comparing(a -> a[1]));
		System.out.println(Arrays.deepToString(strArr));
		
		int[] arrsingle = {3,45,47,3,34,1,3,4,5,6,7,8};
		Object[] array = Arrays.stream(arrsingle).boxed().sorted(Comparator.reverseOrder()).toArray();
		
		List<Integer> collect4 = Arrays.stream(arrsingle).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect4);
		List<Integer> collect3 = Arrays.stream(arrsingle).boxed().sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());
		System.out.println(collect3);
		
		List<Integer> al = Arrays.stream(arrsingle).boxed().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(al);
		
		List<Integer> collect = Arrays.stream(arrsingle)
		.boxed()
		.sorted(Collections.reverseOrder())
		.collect(Collectors.toList());
		//System.out.println(collect);
		//Arrays.stream(input).boxed().sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(i));
	    //Arrays.sort(arrsingle, Collections.reverseOrder());
		
		
		HashMap<String, Integer> hmap = new HashMap<>();
		hmap.put("A", 7);
		hmap.put("B", 6);
		hmap.put("C", 5);
		hmap.put("D", 4);

		List<Integer> collect2 = hmap.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getValue))
		.map(entry -> entry.getValue()).collect(Collectors.toList());
		
		System.out.println(collect2);
		
		Integer integer = hmap.entrySet().stream().sorted(Comparator.comparingInt(Map.Entry::getValue)).map(entry -> entry.getValue())
		.sorted(Collections.reverseOrder()).findFirst().get();
		
		System.out.println(integer);
		
		String string = hmap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).map(entry -> entry.getKey()).
		findFirst().get();
	
		
		List<String> collect5 = hmap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).map(entry->entry.getKey())
		.collect(Collectors.toList());
		System.out.println(collect5);
		
		LinkedHashMap<String, Integer> collect6 = hmap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)-> e1,LinkedHashMap::new));
		System.out.println(collect6);
		
		
		
		
		
		
	}

}

