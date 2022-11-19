package linkedList;

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
	
	boolean remove(int index) {
		
		if( index > length - 1) // if the index is greater then length return false;
			return false;
		
		Node temp = head;
		if(temp == null) // list have no node
			return false;
		for(int i = 0; i < index - 1; i++) 
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
		while(temp.next != null) {
			if(temp.value == value)
				remove(pos);
		 	pos++;
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
	
	
	
}
