package infrun;

public class MaxOfIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{1, 1, 0 ,1 ,1},
						{0, 1, 1 ,0 ,0},
						{0, 0, 0 ,0 ,0},
						{1, 1, 0 ,1 ,1},
						{1, 0, 1 ,1 ,1},
						{1, 0, 1 ,1 ,1}};
		System.out.println(maxAreaOfIsland(grid));
		
	}
	
	static int[][] dirs = {{-1, 0} , { 1, 0} , {0 , -1} , { 0,1}};
	static int m ,n;
	
	public static int maxAreaOfIsland(int[][] grid) {
		
		//1
		if(grid ==null || grid.length == 0) return 0;
		m = grid.length;
		n = grid[0].length;
		int max = 0;
		
		for(int i  =0 ; i < m; i ++) {
			for(int j = 0 ;  j< n; j++) {
				if(grid[i][j] == 1) {
					int area = dfs(grid, i , j , 0);
					max = Math.max(max, area);
				}
			}
		}
		
		return max;
	}
	
	
	
	public static int dfs(int[][] grid, int x, int y , int area) {
		//1 
		if(x < 0 || x >= m || y < 0 || y >= n || grid[x][y] == 0) {
			return area;
		}
		// 2 1인 육지가 들어오는 경우
		grid[x][y] = 0;
		area++;
		for(int[] dir : dirs) {
			area = dfs(grid, x + dir[0] , y+ dir[1] , area);
		}
		return area;
	}
}
