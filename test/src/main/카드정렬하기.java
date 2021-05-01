package main;

import java.util.*;

public class 카드정렬하기 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			
			long[] number = new long[N];
			
			for(int i = 0 ; i < number.length; i++) {
				number[i] = sc.nextInt();
			}
			
			Queue<Long> queue = new PriorityQueue<>();
			List<Long> list = new ArrayList<>();
			
			for(int i = 0; i < number.length; i++) {
				queue.offer(number[i]);
			}
			
			long sum  =0;
			long temp = 0;
			
			if(number.length == 1) {
				System.out.println(0);
				return;
			}
			
			while(!queue.isEmpty()) {
				
				
				long first = queue.poll();
				
				long second = queue.poll();
								
				temp = first+second;
				if(!queue.isEmpty()) {
					queue.offer(temp);
				}
				list.add(temp);
				
				
				temp = 0;
				
			}
			
			for(int i = 0  ; i < list.size(); i++) {
				sum += list.get(i);
			}
			
			System.out.println(sum);

		}
}