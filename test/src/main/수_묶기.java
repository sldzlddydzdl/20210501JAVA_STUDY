package main;

import java.util.*;

public class 거스름 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			
			Queue<Long> queue = new PriorityQueue<>();
			
			// ������ �����ų��� ���ؾ� ���̴� Ŀ���Ƿ� 
			Queue<Long> minus_queue = new PriorityQueue<>();
			
			Queue<Long> plus_queue = new PriorityQueue<>(Collections.reverseOrder());
			
			Queue<Long> zero_queue = new PriorityQueue<>();
			
			long temp1 = 1;
			long sum = 0;
			
			for(int i = 0 ; i < N ; i++) {
				queue.offer(sc.nextLong());
			}
			
			
			while(!queue.isEmpty()) {
				
				long num1 = queue.poll();
				
				if(num1 < 0) {
					minus_queue.offer(num1);
				}
				else if(num1 > 0) {
					plus_queue.offer(num1);
				}
				else { // num1 == 0 �϶� , ���̳ʽ��� �ϳ��϶� 0�����ϸ� ������� �ִ밡�ȴ�
					zero_queue.offer(num1);
				}
				
			}
			
			
			long plus_temp1 = 0;
			long plus_temp2 = 0;
			long minus_temp1 = 0;
			long minus_temp2 = 0;
			long minus_alone = 0;
			
			// ����� ��Ƴ��� ť
			while(!plus_queue.isEmpty()) {
				if(plus_queue.size() == 1) {
					sum += plus_queue.poll();
					break;
				}
				
				plus_temp1 = plus_queue.poll();
				
				plus_temp2 = plus_queue.poll();
				if(plus_temp1 == 1 && plus_temp2 == 1) {
					sum+= ( plus_temp2 + plus_temp1 ) ;
				}
				else if(plus_temp1 != 1 && plus_temp2 != 1) {
					sum += plus_temp1 * plus_temp2;
				}
				else if( ( plus_temp1 != 1 || plus_temp2 == 1 ) || ( plus_temp1 == 1 || plus_temp2 != 1)) {
					sum += (plus_temp1 + plus_temp2);
				}
				
			}
			
			
			
			// ������ ��Ƴ��� ť
			while(!minus_queue.isEmpty()) {
				if(minus_queue.size()==1) {
					minus_alone = minus_queue.poll();
					break;
				}
				
				minus_temp1 = minus_queue.poll();
				minus_temp2 = minus_queue.poll();
				sum += minus_temp1 * minus_temp2;
				
			}
			
			// ���ΰ� ���� ť
			// ������ ���̳ʽ��� �ϳ��϶��� ������ �����ϰ������Ƿ� 
			// ���̳ʽ����� �ϳ������� ������ �����ϰ��ϰ� �װ��� 0��������
			// ���ؼ� ������ ���ش�
			if(minus_alone < 0 && zero_queue.size() >= 1) {
				
				sum += minus_alone * zero_queue.poll();
				
			}
//			if ( minus_alone < 0 && zero_queue.isEmpty() ) {
//				sum += minus_alone;
//			}
			else if(minus_alone < 0 && zero_queue.isEmpty()) {
				sum += minus_alone;
			}
			System.out.println(sum);
			
			
		}
}