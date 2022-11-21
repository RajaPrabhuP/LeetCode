package stack;

import java.util.Stack;

public class StackLearning {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		
		System.out.println(s);
		System.out.println(s.search(1));
		s.size();
		
		for (Integer integer : s) {
			System.out.println(integer);
		}
		
		while(!s.isEmpty()) {
			s.pop();
		}
		s.pop();
		System.out.println(s);
		s.push(s.pop());
		System.out.println(s);
		

	}

}
