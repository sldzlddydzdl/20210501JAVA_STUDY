package infrun;

import java.util.PriorityQueue;

import infrun.MergeKSortedList.ListNode;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(4);
		node.next.next.next.next = new ListNode(5);
		
		ListNode result = reverseList(node);
		
		while(result != null) {
			System.out.println("result :  " + result.val );
			result = result.next;
		}

	}

	public static ListNode reverseList(ListNode current) {
		ListNode prev = null;
		ListNode next = null;
		while(current != null) {
			//LinkedList Swap
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		return prev;
	}
	
	
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}
	}
}
