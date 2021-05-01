package infrun;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(9);
		ListNode node = addTwoNumbers(l1, l2);

		while(node != null) {
			System.out.println(node.val);
			node = node.next;
		}
		
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
		//1
		ListNode newHead = new ListNode(0);
		ListNode p1 = l1 , p2 = l2 , p3 = newHead;
		int carry = 0;
		
		//2 
		while(p1 != null || p2 != null) {
			if( p1 != null) {
				carry += p1.val;
				p1 = p1.next;
			}
			
			if( p2 != null) {
				carry += p2.val;
				p2 = p2.next;
			}
			
			p3.next = new ListNode(carry%10);
			p3 = p3.next;
			carry /= 10;
			
		}
		
		if(carry == 1) p3.next = new ListNode(1);
		return newHead.next;
		
    }



	public static class ListNode {
	    int val;
	    ListNode next;
	    
	    ListNode() {
	    	
	    }
	    
	    ListNode(int val) {
	    	this.val = val;
	    }
	    /*
	    ListNode(int val, ListNode next) { 
	    	this.val = val; this.next = next; 
	    }
	    */
	}
}