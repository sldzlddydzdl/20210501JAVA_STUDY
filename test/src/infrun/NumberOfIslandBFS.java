package infrun;

import java.util.*;

public class NumberOfIslandBFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] grid = {{'1' ,'1' , '1' ,'0' ,'1'},
						 {'1' ,'1' , '0' ,'0' ,'0'},
						 {'0' ,'1' , '1' ,'0' ,'1'},
						 {'0' ,'0' , '0' ,'0' ,'1'}
						};
		
		NumberOfIslandBFS a = new NumberOfIslandBFS();
		System.out.println(a.numberOfIsland(grid));

	}
	
	
	
	int numberOfIsland(char[][] grid) {
		if(grid == null|| grid.length == 0) return 0;
		int count =0;
		
		for(int i  =0 ; i < grid.length; i++) {
			for(int j = 0 ; j < grid[i].length; j++) {
				if(grid[i][j] == '1') {
					count++;
					bfs(grid , i , j);
				}
			}
		}
		
		return count;
	}
	
	int[][] dirs = {{-1,0} , {1,0} , {0,1} ,{0,-1}};
	void bfs(char[][] grid ,int  x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {x , y});
		System.out.println("count : " + queue.peek()[0] +" , "+ queue.peek()[1]);
		while(!queue.isEmpty()) {
			int[] point = queue.poll();
			for(int[] dir : dirs) {
				int x1 = point[0] + dir[0];
				int y1 = point[1] + dir[1];
				if(x1 >= 0 && y1 >= 0 && x1 < grid.length && 
				   y1 <grid[0].length && grid[x1][y1] == '1' ) {
					grid[x1][y1] = '0';
					print(grid);
					queue.offer(new int[] {x1, y1});
					System.out.println(queue.peek()[0] +" , "+ queue.peek()[1]);
					System.out.println();
				}
			}
		}
	}
	
	void print(char[][] grid) {
		
		for(int i = 0 ; i < grid.length; i++) {
			for(int j = 0 ; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
