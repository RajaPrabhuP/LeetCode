package linkedList;

public class P002_PalindromeLinkedList {
	 public boolean isPalindrome(Node head) {
	        
		   /*initalize two pointers, fast and slow starting at head
		fast skips 1 node where slow moves to next node
		once we identified mid and fast goes to tail terminate the loop
		create list nodes, prev
		initalize prev as  slow and prev next as null so that we have tail node after node reversal in second half of the linked list
		now reverse the second half of the linked list
			set next value of the current node as previous value of that node
			iterate till you reach end of the linked list
		now the pointer prev will be at the mid+1 of the linked list
		set another pointer at head of the linked list
		compare value of the both pointers, and iterate till end of the linked list
			if value is not same, return false
		else return true at end of the iteration as it linked list is palindrome*/
		        
		 		Node slow = head;
		 		Node fast = head;
		        // 1 2 3 5 3 2 1 8
		        while(fast != null && fast.next != null){
		                fast = fast.next.next;
		                slow = slow.next;
		            }
		       // 1 2 2 3 2 2 1
		       //       3 2 2 1 
		        //        2 2 1 3
		             
		        	Node curr = slow;
		        	Node prev = null, next = null;
		            while(curr != null){
		               next = curr.next;
		               curr.next = prev;
		                prev = curr;
		                curr = next;
		                }
		               
		             // while(head != null){
		             //     System.out.println(head.val);
		             //     head = head.next;
		             // }
		        
		        
		      //  1 2 2 3 1 2 2
		      //  h       s
		            slow = prev;
		            while(slow != null){
		              if(head.value != slow.value) 
		                  return false;
		               head = head.next;
		               slow = slow.next;
		                
		            }
		            
		          // ListNode prev = slow;
		          // slow = slow.next;
		          // prev.next = null;
		        
		        return true;
		        
		    
		            
		        
		    }
}
