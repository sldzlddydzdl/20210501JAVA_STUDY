package main;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class 바이러스 {

	static int[][] computers;
	static int[] visit;
	static int count;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		computers = new int[N+1][N+1];
		visit = new int[N+1];
		for(int i = 0 ; i < M; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			computers[x][y] = 1;
			computers[y][x] = 1;
		}
		
		dfs(1);
		
		System.out.println(count);
		
	}
	
	public static void dfs(int start) {
		
		visit[start] = 1;
		
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(start);
		
		while(!queue.isEmpty()) {
			
			int y = queue.poll();
			for(int i = 1; i < computers[y].length; i++) {
				if(computers[y][i] == 1 && visit[i] == 0) {
					queue.offer(i);
					visit[i] = 1;
					count++;
				}
			}
			
		}
		
	}
}
