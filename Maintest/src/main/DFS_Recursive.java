package main;

import java.util.Scanner;

public class DFS_Recursive {
	
//	DFS ( Depth First Search )
//	그래프 순회 방법 중 하나 이다
//	- 깊이 우선 탐색
//	
//	- 시작 노드에서 깊이가 커지는 방향으로 탐색을 진행하여 더이상 방문할 인접
//	노드가 없는 경우 이전 노드가 돌아가서, 다시 깊이 우선 탐색을 반복하게 된다.
//	      1
//		/   \
//	   /     \
//	  2       3
//	 / \     / \
// 	4   5   6   7      순서 : 1 -> 2 -> 4 -> 5 -> 3 -> 6 -> 7
 	
 	// 입력  
 	// 5 6
 	// 0 1  0 2  1 3  1 4  2 4  3 4
	
	// 출력
	// 0 -> 1 -> 3 -> 4 -> 2 
 	
	
/// --------------------- DFS - 재귀 호출 ----------------------
 	static final int MAX_N = 10;
 	static int N, E; // N = 숫자(노드) 갯수, E = 간선 갯수
 	static int[][] Graph = new int[MAX_N][MAX_N];
 	static boolean[] Visited = new boolean[MAX_N];
 	
 	static void dfs(int node) { 
 		Visited[node] = true;
 		System.out.println(node + " ");
 		
 		for(int next = 0; next < N; ++next) {
 			if(!Visited[next] && Graph[node][next] != 0) {
 		// 	해당 Visited가 false 이면서 해당 Graph가 1(true) 일때, 
 		//								( 즉 간선이 존재할때 )
 				dfs(next);
 			}
 		}
 	}
 	
 	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		E = sc.nextInt();
		for( int i = 0 ; i < E; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			Graph[u][v] = Graph[v][u] = 1;
		}
		dfs(0);
	}
 	
}

