package linkedList;

import java.util.ArrayList;

public class SingleImplementation {
 
	
	Node head, tail;
	int length = 0;
	
	
	
	void add(int value) {
		Node temp =new Node(value);
		
		if(head == null) {
			head = temp;
			tail = temp;
		}else {
			tail.next = temp;
			tail = temp;
		}
		
		length++;
	}
	
	int size() {
		return length;
	}
	
	// 1 
	void removeFirst() {
		Node temp = head.next;
		head = temp; 
		length--;
	}
	
	boolean remove(int index) { //
		
		if( index > length - 1) // if the index is greater then length return false;
			return false;
		
		Node temp = head;
		if(temp == null) // list have no node
			return false;
		if(index == 0)
			head = temp.next;
		for(int i = 0; temp != null && i < index - 1; i++) 
			temp = temp.next; // identify the  for remove node previous node
		
		if(temp.next == null) //remove node is the last node means return to the element for prevone
			return false;
		
		temp.next = temp.next.next; // else if removenode next pointed into one node after another
		length --;
		return true;
	}
	
	boolean removeValue(int value) {
		
		Node temp = head;
		int pos = 0;
//		if(temp.value == value)
//			return remove(pos);
		while(temp != null) {
			if(temp.value == value)
				 return remove(pos);
		 	pos++;
		 	temp =temp.next;
		}
		return false;
		
	}
	
	
	
	int get(int index) {
		if(index > length - 1 )
			return -1;
		Node temp = head;
		for(int i = 1; i <= index; i++) {
			temp = temp.next;
		}
		return temp.value;
			
	}
	
	boolean set(int index, int value) {
		if(index > length )
			return false;
		
		Node temp = head;
		
		for(int i = 0; i <= index; i++ ) {
			
			if(i == index) {
				temp.value = value;
				tail = temp.next;
				break;
			}
			temp = temp.next;
		}		
		
		return true;
	}
	
	void printAllNode(Node n) {
		
		while(n != null) {
			System.out.print(n.value +" --> ");
			n = n.next;
		}
		
	}
	
	void printAllOddNode(Node n) {
		
		while(n != null) {
			System.out.print(n.next.value +" --> ");
			n = n.next.next;
		}
		
	}
	
	// indexOf
	// lastIndexOf
	
	int indexOf(int value) {
		
		Node temp = head;
		int pos = -1;
		while(temp != null) {
			pos++;
			if(temp.value == value)			
				return pos;
			
			temp = temp.next;
		}
		
		return -1;
		
	}
	
	int lastindexOf(int value) { // 1 2 3 4 2 3 5 6  //out = 6
		
		Node temp = head;
		int pos = 0;
		int output = -1;
		while(temp != null) {
			
			if(temp.value == value)			
				output = pos;
			pos++;
			temp = temp.next;
		}
		
		return output;
		
	}
	
	
	public void addFirst(int value) {
		
		Node newNode = new Node(value);
		
		if(head == null) {
			head = newNode;
		}else {
			newNode.next = head;
			head = newNode;			
		}
		
		length++;
		
	}
	
	public boolean removeLast() {
		return remove(length - 1);	
	}
	
	boolean removeAll(int value) {
		
		Node temp = head;
		int pos = 0;
		
		while(temp != null) {// 1 2 3 5 5 6 7 5 7
			if(temp.value == value) {
				  remove(pos);
				  pos--;
			}
		 	pos++;
		 	temp =temp.next;
		}
		return false;
		
	}
	
	void addAll(int[] value) {
		
		for (int i = 0; i < value.length; i++) {
			add(value[i]);
		}
		
	}
}
