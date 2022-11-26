package stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class LearnQueue {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		Deque<Integer> listDeque = new LinkedList<Integer>();
		deque.add(1);
		deque.add(2);
		deque.add(3);
		deque.add(4);
		deque.addFirst(5);
		deque.addLast(10);
		
		deque.offer(1);
		deque.offer(2);
		deque.offer(3);
		deque.offer(4);
		deque.offer(5);
		deque.offerFirst(10);
		
		for(int i : deque) 
			System.out.println(i);
		System.out.println("***********************************");
		deque.pop();
		deque.pop();
		deque.pop();
		deque.pop();
		deque.removeLast();
		deque.removeFirst();
		for(int i : deque) 
			System.out.println(i);
		System.out.println("***********************************");
		System.out.println(deque.peek());
		System.out.println(deque.peekFirst());
		System.out.println(deque.peekLast());
	}

}
