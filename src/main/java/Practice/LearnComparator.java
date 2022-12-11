package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class LearnComparator {

	public static void main(String[] args) {
		int[][] arr = {{9,8}, {10, 6}, {12, 4}, {3,2}};
		
		Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
		System.out.println(Arrays.deepToString(arr));
		
		Arrays.sort(arr, (int[] a1, int[] a2) -> a1[0] - a2[1]);
		System.out.println(Arrays.deepToString(arr));
		
		String[][] strArr = {{"AA", "BB"}, {"FF", "EE"}, {"DD", "FF"}};
		Arrays.sort(strArr, Comparator.comparing(a -> a[0]));
		System.out.println(Arrays.deepToString(strArr));
		
		Arrays.sort(strArr, Comparator.comparing(a -> a[1]));
		System.out.println(Arrays.deepToString(strArr));
		
		int[] arrsingle = {1,3,4,5,6,7,8};
		List<Integer> collect = Arrays.stream(arrsingle)
		.boxed()
		.sorted(Collections.reverseOrder())
		.collect(Collectors.toList());
		System.out.println(collect);
		//Arrays.stream(input).boxed().sorted(Comparator.reverseOrder()).forEach(i -> System.out.println(i));
	    //Arrays.sort(arrsingle, Collections.reverseOrder());
		
		
		
		
		
	}

}
