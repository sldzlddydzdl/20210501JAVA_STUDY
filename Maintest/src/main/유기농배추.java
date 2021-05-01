package main;

import java.util.*;

public class 유기농배추 {

	static int[][] dir = {{-1,0} , {1, 0}, {0 , -1}, {0 ,1}};
	static int[][] ground;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int T = sc.nextInt(); // test 갯수
		
		
		
		for(int t= 0 ; t < T ; t++) {
			int M = sc.nextInt(); // 가로길이
			int N = sc.nextInt(); // 세로길이
			int K = sc.nextInt(); // 배추의 갯수
		
			ground = new int[N][M];
			for(int i = 0; i < K; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				ground[y][x] = 1;
			}
			
//			for(int i = 0; i < ground.length; i++) {
//				for(int j = 0 ; j < ground[i].length; j++) {
//					System.out.print(ground[i][j] + " ");
//				}
//				System.out.println();
//			}
			int count = 0;
			
			for(int i =0; i < ground.length; i++) {
				for(int j = 0; j < ground[i].length; j++) {
					if(ground[i][j] == 1) {
						dfs( i , j , ground );
						count++;
					}
				}
			}
			
			list.add(count);
			
		}
		
		for(int s : list)
			System.out.println(s);
		
	}
	
	public static void dfs (int i , int j , int[][] ground) {
		
		if(i < 0 || j < 0 || i >= ground.length || j >= ground[0].length || ground == null || ground[i][j] == 0) {
			return;
		}
		
		ground[i][j] = 0;
		
		for(int[] dirs : dir)
			dfs(i + dirs[0], j + dirs[1] , ground);
		
		
	}
	

}	
//		1 1 0 0 0 0 0 0 0 0 
//		0 1 0 0 0 0 0 0 0 0 
//		0 0 0 0 1 0 0 0 0 0 
//		0 0 0 0 1 0 0 0 0 0 
//		0 0 1 1 0 0 0 1 1 1 
//		0 0 0 0 1 0 0 1 1 1 
//		0 0 0 0 0 0 0 1 1 1 
//		0 0 0 0 0 0 0 0 0 0 




