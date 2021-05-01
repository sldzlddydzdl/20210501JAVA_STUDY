package main;

import java.util.*;

public class 단자번호붙이기 {

	public static Queue<Integer> max = new PriorityQueue<>();
	
	public static int[][] dir = { {-1,0}, {1,0}, {0,-1} , {0,1} };
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		int[][] map = new int[N][N];
		char[][] newinput = new char[N][N];
		String[] input = new String[N];
		
		for(int i = 0 ; i < input.length; i++ ) {
			input[i] = sc.next();
		}
		
		for(int i= 0 ; i < newinput.length; i++) {
			newinput[i] = input[i].toCharArray();
		}
		
//		for(int i = 0; i < input.length; i++) {
//			for(int j = 0; j < input[i].length(); j++) {
//				System.out.print(newinput[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("-------- map -----------");
//		
		for(int i = 0 ; i < map.length; i++) {
			for(int j= 0 ;j < map[i].length; j++) {
				map[i][j] = (int)newinput[i][j] -48;
			}
		}
		
//		for(int i = 0; i < input.length; i++) {
//			for(int j = 0; j < input[i].length(); j++) {
//				System.out.print(map[i][j] + " ");
//			}
//			System.out.println();
//		}
		

		int count = 0;
		int nummax = 0;
		
		for(int i = 0 ; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				if(map[i][j] == 1) {
					int area = dfs(j, i , map , 0);
					count++;
					max.offer(area);
				}
			}
		
		}
		
		System.out.println(count);
		
		while(!max.isEmpty()) {
			System.out.println(max.poll());
		}
		
		
	}
	
//	int[][] dir = { {-1,0}, {1,0}, {0,-1} , {0,1} };
	
	public static int dfs(int y, int x , int[][] map ,int area) {
		
		if(x < 0 || y < 0 || x >= map.length || y >= map[x].length || map[x][y] == 0 || map == null)
			return area;
		
		area++;
		map[x][y] = 0;
		
		for(int[] dirs : dir)
			area = dfs(y + dirs[1] ,x + dirs[0]  , map , area);
		
		return area;
		
	}
	
	
}