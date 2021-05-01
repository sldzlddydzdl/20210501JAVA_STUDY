package infrun;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(5);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		
		ListNode l3 = new ListNode(2);
		l3.next = new ListNode(6);
		l3.next.next = new ListNode(7);
		
		ListNode[] list = new ListNode[3];
		list[0] = l1;
		list[1] = l2;
		list[2] = l3;
		
		
		ListNode result = mergeKLists(list);
		System.out.println(" ===== ");
		while( result != null) {
			System.out.println(result.val);
			result = result.next;
		}
		
	}
	
	public static ListNode mergeKLists(ListNode[] lists) {
		//1 
		PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(Comp);
		ListNode newHead = new ListNode(0);
		ListNode p = newHead;
		for(ListNode node : lists) {
			System.out.println("node.val : " + node.val);
			System.out.println("node.next.val : " +  node.next.val);
			System.out.println("node.next.next.val : " +  node.next.next.val);
			
			
			if(node != null) {
				
				queue.offer(node);	
			}
		}
		
		
		
		System.out.println("queue 사이즈 : " + queue.size());
		System.out.println("++++queue : " + queue.peek().val);
		
		while(!queue.isEmpty()) {
			System.out.println(queue.peek().val);
			ListNode node = queue.poll();
			p.next = node;
			p = p.next;
			if(node.next != null) {
				queue.offer(node.next);
			}
			
		}
		
		System.out.println("queue 사이즈 : " + queue.size());
		
		System.out.println("newHead.next.val : " + newHead.next.val);
		return newHead.next;
		
		
	}
	
	public static Comparator<ListNode> Comp = new Comparator<ListNode>() {
		@Override
		public int compare(ListNode o1, ListNode o2) {
			// TODO Auto-generated method stub
			return o1.val - o2.val;
		}
		
	};
	
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
		 this.val = x;
		}
	}
	
}
