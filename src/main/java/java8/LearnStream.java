package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LearnStream {

	public static void main(String[] args) {
		
		List<String> al = new ArrayList<>();
		al.add("AA");
		al.add("BB");
		al.add("CC");
		al.add("DD");
		
		al.stream().filter(a -> a.equals("BB"))
		.forEach(a -> System.out.println("Hi "));
		
		HashMap<String, Integer> hmap = new HashMap<>();
		hmap.put("A", 1);
		hmap.put("B", 1);
		hmap.put("C", 1);
		
		hmap.entrySet().stream().filter(h -> h.getKey().equals("A"))
		.forEach(h -> System.out.println("YYYYY"));
		
		hmap.entrySet().stream().filter(each -> each.getValue() == 1).
		forEach(each -> System.out.println("Hi"));
	}

}
