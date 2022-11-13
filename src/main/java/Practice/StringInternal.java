package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class StringInternal {

	public static String[] printConve(ArrayList<String> al) {
		return (String[]) al.subList(0, al.size()).toArray();
		
		
		
	}
	
	public static void main(String[] args) {
		char[] chArr = new char[10];
		String str = new String("ABCDEF");
		int codePointAt = str.codePointBefore(1);
		str.getChars(0, 2, chArr, 0);
		System.out.println(str);
		System.out.println(codePointAt);
		System.out.println(str.hashCode());
		
		str.getChars(0, 3 , chArr, 5);
		System.out.println(Arrays.toString(chArr));
		ArrayList<String> al = new ArrayList<>(); 
		al.add("A");
		al.add("B");
		al.add("C");
		System.out.println(Arrays.toString(al.toArray()));
		System.out.println(Arrays.toString(al.subList(0, al.size()).toArray()));
	}

}
