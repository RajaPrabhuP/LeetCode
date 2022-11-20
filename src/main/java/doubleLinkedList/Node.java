package doubleLinkedList;

public class Node {

	int value;
	Node prev, next;
	
	Node(int value){
		this.value = value;
		next = null;
		prev = null;	
	}
}
