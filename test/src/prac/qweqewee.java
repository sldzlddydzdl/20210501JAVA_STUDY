package prac;

import java.util.*;

public class qweqewee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> queue= new LinkedList<>();
		
		queue.offer(3);
		queue.offer(2);
		queue.offer(4);
		queue.offer(1);
		queue.offer(5);
		queue.offer(9);
		queue.offer(7);
		
		
		while(!queue.isEmpty()) {
			
			int com = queue.poll();
			for(int s : queue) {
				if(com < s) {
					System.out.println(com + "보다 더큰수" + s + "가있습니다.");
				}
			}
			
			
		}
		
	}

}
