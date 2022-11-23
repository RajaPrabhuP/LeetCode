package linkedList;

import java.util.Stack;

public class P001_ReverseLinkedList extends SingleImplementation {
	 public Node reverseList(Node head) {
	        /*Node temp = head; 
	        Stack<Node> st = new Stack<>();
	        
	        while(temp != null){
	            st.push(temp);
	            temp = temp.next;
	        }
	        
	        Node output = null;
	        while(!st.isEmpty()){
	            output = st.pop();
	        }
	        return output;
	        
	        /*Pseudo code
	        Break the next pointer to prev.
	        1. create three pointer prev, next and curr.
	        2. Iterating through loop breaking condition is is not null*
	        3. next is curr.next
	        4. curr next is prev
	        5. prev is curr
	        6 curr is next
	        
	        return the prev.
	        */
	        
	        if(head == null)
	            return null;
	        if(head.next == null)
	            return head;
	        
	        Node prev = null;
	        Node next = null;
	        Node curr = head;
	        
	        while(curr != null){
	            next = curr.next;
	            curr.next = prev;
	            prev = curr;
	            curr = next;            
	        }
	        
	        return prev;
        
	    }
	 
	 public static void main(String[] args) {
		 
		 P001_ReverseLinkedList sl1 = new P001_ReverseLinkedList();
		 sl1.add(1);
		 sl1.add(2);
		 sl1.add(3);
		 sl1.add(4);
		 sl1.printAllNode(sl1);
		 
	 }
}
