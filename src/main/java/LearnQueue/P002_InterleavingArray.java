package LearnQueue;

import java.util.ArrayDeque;
import java.util.Stack;

public class P002_InterleavingArray {

	public static void interleaingArray(int[] arr) {
		Stack<Integer> firsthalf = new Stack<>();
		Stack<Integer> secondHalf = new Stack<>();
		
		for(int i = (arr.length / 2) - 1; i >= 0 ; i--)
			firsthalf.push(arr[i]);//4  3 2  1
		

		for(int i = arr.length - 1; i > (arr.length/2) - 1; i--)
			secondHalf.push(arr[i]);//8 7 6 5
		System.out.println(firsthalf);
		System.out.println(secondHalf);
		ArrayDeque<Integer> deque = new ArrayDeque<Integer>();
		while(!firsthalf.isEmpty()) {
			deque.offer(firsthalf.pop());
			deque.offer(secondHalf.pop());
		}
		System.out.println(deque);	
	}
	
	public static void main(String[] args) {
		
		interleaingArray(new int[] {1,2,3,4,5,6,7,8});

	}

}

