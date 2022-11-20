package doubleLinkedList;



public class DoubleImplementation {

	Node head, tail;
	int length = 0;
	
	
	void add(int value) {
		Node temp =new Node(value);
		
		if(head == null) {
			head = temp;
			tail = temp;
			//prev = temp; // [ 1 2 3 4 ]
		}else {
			temp.prev = tail;
			tail = temp;
			tail.next = temp;
		}
		
		length++;
	}
}
