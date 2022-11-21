package doubleLinkedList;



public class DoubleImplementation {

	Node head, tail;
	int length = 0;
	
	
	void add(int value) {
		Node temp =new Node(value); 
		
		if(head == null) {
			head = temp;
			tail = temp;
			head.prev = null; // [ 1 2 3 4 ]
		}else {
			temp.prev = tail;
			tail.next = temp;
			tail = temp;	
		}
		
		length++;
	}
	
	
	boolean remove(int index) { //
		
		if( index > length - 1) // if the index is greater then length return false;
			return false;
		
		Node temp = head;
		if(temp == null) // list have no node
			return false;
		if(index == 0) {//  2
			head = temp.next;
			head.prev = null;
		}
		for(int i = 0; temp != null && i < index - 1; i++) 
			temp = temp.next; // identify the  for remove node previous node
		
		if(temp.next == null) //remove node is the last node means return to the element for prevone
			return false;
		
		temp.next = temp.next.next; // else if removenode next pointed into one node after another
		temp.next.prev = temp;  // 1  3
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

void printAllNode(Node n) {
	
	while(n != null) {
		System.out.print(n.value +" --> ");
		n = n.next;
	}
}

void printAllNodeReverse(Node n) {
	
	while(n != null) {
		System.out.print(n.value +" --> ");
		n = n.prev;
	}
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
