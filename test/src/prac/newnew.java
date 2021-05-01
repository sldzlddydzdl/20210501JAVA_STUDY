package prac;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class newnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Stack st = new Stack();
		Queue<Integer> q = new LinkedList<>();
		Queue pq = new PriorityQueue<>();
		
		
		
		st.push("0"); 
		st.push("1");
		st.push("2");
		
		q.offer(2);
		q.offer(1);
		q.offer(0);
		
		pq.offer(3); // 원래는 pq.offer(new Integer(3)); 해야하는데 오토박싱이 된것
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		
	    Object sdf = q.element();
	    System.out.println(sdf);
	    
	    sdf = q.poll();
		
		Object obj = null;
		
		
		
		
		System.out.println("=== Stack ===");
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
		
		System.out.println("=== Queue ===");
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		// PriorityQueue에 저장된 요소를 하나씩 꺼낸다.
		while((obj = pq.poll())  != null)
			System.out.println(obj);
		*/
		
		Queue<Integer> q = new LinkedList<>();
		
		int[] progresses = {95, 90, 99, 99, 80, 99};
		int[] speeds = {1, 1, 1, 1, 1, 1};
		int temp = 0;
		
		int[] count = new int[progresses.length];
		for(int i = 0 ; i < count.length; i++) {
			count[i] = 0;
		}
		
		for(int i = 0; i < progresses.length; i++){
            while(progresses[i] < 100){
                progresses[i] += speeds[i];
                count[i]++;
            }      
        }
		
		
		for(int i = 0 ; i < count.length; i++) {
			System.out.println(count[i]);
		}
		
		  for(int i = 0 ; i < count.length; i++){
	            
	            while(true){
	                if(q.isEmpty()){
	                    q.offer(count[i]);
	                    temp = count[i];
	                    break;
	                }
	                
	                else if(q.size() == 1){
	                    q.offer(count[i]);
	                    break;
	                }   
	                
	                else if(q.size() >1){
	                    
	                    
	                }
	            }
	        }
	        
	}

}
