package slidingWindow;

import java.util.ArrayList;

public class LearnArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		System.out.println(al.size());
		al.trimToSize();
		System.out.println(al.size());
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		System.out.println(al.size());
		
		al.add(2, 7);
		al.add(3, 8);
		al.add(4, 9);
		al.add(5, 10);
		System.out.println(al);
		
		al.set(2, 12);
		System.out.println(al);
		al.removeIf(a-> (a == 1));
		
		
	
	
	}

}
