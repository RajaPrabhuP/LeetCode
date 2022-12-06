package Practice;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueDuplicateSet {
	
		public static void uniqueDupl(String[] arr) {
			HashSet<String> unique = new HashSet<>();
			HashSet<String> dupl = new HashSet<>();
			int[] arr1 = {1,2};
			int[] arr2 = new int[2];
			arr2 = arr1;
			System.out.println(Arrays.toString(arr1));
			for(int i = 0; i < arr.length; i++) {
				
				if(!unique.add(arr[i]) && !dupl.contains(arr[i])) {
					unique.remove(arr[i]);
					dupl.add(arr[i]);
				}else {
					unique.add(arr[i]);
				}
			}
			System.out.println(unique);
			System.out.println(dupl);
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uniqueDupl(new String[] {	"ball22", "bat35",   "glove11", "glove21", "glove11"});
	
	}

}
